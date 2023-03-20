package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.controllers.PumpController;
import org.springframework.stereotype.Service;

@Service
public class PumpService {
    private final PumpController pumpController;

    public PumpService(PumpController pumpController) {
        this.pumpController = pumpController;
    }

    public void turnThePumpOn(){

    }

    public void turnThePumpOff(){

    }
}
