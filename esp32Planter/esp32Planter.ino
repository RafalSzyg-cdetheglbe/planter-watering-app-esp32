#include <WiFi.h>
#include <HTTPClient.h>
#include "esp32-hal-gpio.h"
#include <OneWire.h>
#include <DallasTemperature.h>

#define MOISTURE_SENSOR_PIN GPIO_NUM_34
#define INSOLATION_SENSOR_PIN GPIO_NUM_35

int RELAY_PIN=17;
const int oneWireBus = 4;

OneWire oneWire(oneWireBus);
DallasTemperature sensors (&oneWire);

const char* ssid = "mikoshi";
const char* password = "Kraken123";
const char* moistureEndpoint = "http://192.168.1.108:8080/moisture/sensorRead";
const char* temperatureEndpoint = "http://192.168.1.108:8080/temperature/sensorRead";
const char* insolationEndpoint = "http://192.168.1.108:8080/insolation/sensorRead";
const char* pumpEndpoint = "http://192.168.1.108:8080/pump/checkPumpStatus";
HTTPClient http;

void checkResponse(int httpResponseCode){
if (httpResponseCode > 0) {
    Serial.printf("HTTP POST request was successful, response code: %d\n", httpResponseCode);
    String response = http.getString();
    Serial.println(response);
  } else {
    Serial.printf("HTTP POST request failed, error: %s\n", http.errorToString(httpResponseCode).c_str());
  }
}

void setup() {
  Serial.begin(115200);
  sensors.begin();

  gpio_set_direction(MOISTURE_SENSOR_PIN, GPIO_MODE_INPUT);
  gpio_pullup_en(MOISTURE_SENSOR_PIN);

  gpio_set_direction(INSOLATION_SENSOR_PIN, GPIO_MODE_INPUT);
  gpio_pullup_en(INSOLATION_SENSOR_PIN);


  pinMode(RELAY_PIN, INPUT);
  WiFi.begin(ssid, password);
  Serial.println("Connecting to WiFi");
}

void loop() {
  if (WiFi.status() == WL_CONNECTED) 
  {
  Serial.println("WiFi connected");

  sensors.requestTemperatures();
  float temperature = sensors.getTempCByIndex(0);
  Serial.print("Temperature: ");
  Serial.println(temperature);
  String temperatureData=String(temperature);

 int insolation=digitalRead(INSOLATION_SENSOR_PIN);
 String insolationData=String(insolation);
  Serial.println("INSOLATION: ");
  Serial.println(insolationData);

  int moisture =analogRead(MOISTURE_SENSOR_PIN);
  String moistureData=String(moisture);
  Serial.println("MOISTURE: ");
  Serial.println(moistureData);
 ///////////////////////////////////////////////
  http.begin(moistureEndpoint);
  int httpMoistureResponseCode = http.POST(moistureData);
  checkResponse(httpMoistureResponseCode);
  http.end();
 ///////////////////////////////////////////////
  http.begin(temperatureEndpoint);
  int httpTemperatureResponseCode = http.POST(temperatureData);
  checkResponse(httpTemperatureResponseCode);
  http.end();
 ///////////////////////////////////////////////
  http.begin(insolationEndpoint);
  int httpInsolationResponseCode = http.POST(insolationData);
  checkResponse(httpInsolationResponseCode);
  http.end();
 /////////////////////////////////////////////// 
  http.begin(pumpEndpoint);
 int pumpResponseCOde=http.GET();
 String pumpStatus=http.getString();
  if(pumpStatus=="true")
  {
  Serial.println("Pump on");
  pinMode(RELAY_PIN, OUTPUT);
  delay(5000);
  pinMode(RELAY_PIN, INPUT);
  Serial.println("Pump off");
  }
  else
  {
    Serial.println("Pump off");
  }
 // Print the response body to the serial console for debugging
  
  http.end();

  delay(5000);


  } 
  else {
    Serial.println("Connecting to WiFi...");
    delay(1000);
  }
}