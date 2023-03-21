package com.example.plantwatcher.controllers;

import com.example.plantwatcher.models.Moisture;
import com.example.plantwatcher.models.Temperature;
import com.example.plantwatcher.services.implementation.TemperatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/temperature")
public class TemperatureController {
    private final TemperatureService temperatureService;

    public TemperatureController(TemperatureService temperatureService) {
        this.temperatureService = temperatureService;
    }

    @PostMapping
    @RequestMapping("/sensorRead")
    public ResponseEntity<String> postTemperatureRead(@RequestBody String requestBody){

        temperatureService.postTemperatureReading(Integer.parseInt(requestBody));
        System.out.println("Temperature: "+requestBody);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @RequestMapping("/getTemperature")
    public ResponseEntity<String> getTemperatureInfo() {
        Temperature temperature = temperatureService.getAllTemperatureDataOfLastReading();
        return ResponseEntity.ok(temperature.toString());
    }

    @GetMapping
    @RequestMapping("/getAllTemperatureReadings")
    public ResponseEntity<String> getAllTemperatureReadings(){
        List<Temperature> moistures=temperatureService.getAllTemperatureReadings();
        return ResponseEntity.ok(moistures.toString());
    }


}

