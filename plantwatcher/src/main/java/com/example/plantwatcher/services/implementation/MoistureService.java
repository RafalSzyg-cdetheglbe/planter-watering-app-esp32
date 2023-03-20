package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.models.Moisture;
import com.example.plantwatcher.repository.MoistureRepository;
import com.example.plantwatcher.services.interfaces.MoistureInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MoistureService implements MoistureInterface {

    private final MoistureRepository moistureRepository;

    public MoistureService(MoistureRepository moistureRepository) {
        this.moistureRepository = moistureRepository;
    }

    @Override
    public void postSensorRead(int moistureRead) {

        Moisture moisture=new Moisture();
        moisture.setDate(LocalDateTime.now().withSecond(0).withNano(0));
        moisture.setValue(moistureRead);
        moistureRepository.save(moisture);
    }

    @Override
    public Moisture getAllMoistureDataOfLastReading() {
        //return moistureRepository.findByLastMoistureReading();
        return null;
    }

    @Override
    public void deleteOldRecordings() {

    }


}
