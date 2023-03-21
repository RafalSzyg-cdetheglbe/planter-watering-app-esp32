package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.models.Temperature;
import com.example.plantwatcher.repository.TemperatureRepository;
import com.example.plantwatcher.services.interfaces.TemperatureInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TemperatureService implements TemperatureInterface {
    private final TemperatureRepository temperatureRepository;

    public TemperatureService(TemperatureRepository temperatureRepository) {
        this.temperatureRepository = temperatureRepository;
    }

    @Override
    public void postTemperatureReading(int temperatureRead) {
        Temperature temperature=new Temperature();
        temperature.setValue(temperatureRead);
        temperature.setDate(LocalDateTime.now().withSecond(0).withNano(0));

        temperatureRepository.save(temperature);
    }

    public Temperature getAllTemperatureDataOfLastReading() {
        return temperatureRepository.findFirstByOrderByDateDesc();
    }

    public List<Temperature> getAllTemperatureReadings() {
        return  temperatureRepository.findAllByOrderByDateAsc();
    }
}
