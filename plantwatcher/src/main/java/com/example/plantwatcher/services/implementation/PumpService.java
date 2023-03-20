package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.controllers.PumpController;
import com.example.plantwatcher.services.interfaces.PumpInterface;
import org.springframework.stereotype.Service;

@Service
public class PumpService implements PumpInterface {
    private final PumpController pumpController;

    public PumpService(PumpController pumpController) {
        this.pumpController = pumpController;
    }

    public void turnThePumpOn(){

    }

    public void turnThePumpOff(){

    }
}
