package com.example.plantwatcher.services.interfaces;

import com.example.plantwatcher.models.Moisture;

public interface MoistureInterface {
    public void postSensorRead(int moistureRead);
    public Moisture getAllMoistureDataOfLastReading();
    public void deleteOldRecordings();

}
