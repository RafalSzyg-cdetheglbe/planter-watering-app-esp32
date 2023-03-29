package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Moisture;
import com.example.plantwatcher.models.Sensor;
import com.example.plantwatcher.models.Temperature;
import com.example.plantwatcher.repository.InsolationRepository;
import com.example.plantwatcher.repository.MoistureRepository;
import com.example.plantwatcher.repository.TemperatureRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SensorService {

    private final TemperatureRepository temperatureRepository;
    private final MoistureRepository moistureRepository;
    private final InsolationRepository insolationRepository;


    public SensorService(TemperatureRepository temperatureRepository, MoistureRepository moistureRepository, InsolationRepository insolationRepository) {
        this.temperatureRepository = temperatureRepository;
        this.moistureRepository = moistureRepository;
        this.insolationRepository = insolationRepository;
    }

    public Sensor getAllSensorsInfo(){
        Temperature temperature=temperatureRepository.findFirstByOrderByDateDesc();
        Moisture moisture=moistureRepository.findFirstByOrderByDateDesc();
        Insolation insolation=insolationRepository.findFirstByOrderByDateDesc();

        return new Sensor(temperature.getValue(),
                (int)(moisture.getValue()),
                insolation.getValue(),
                insolation.getDate());
    }



}
