package com.example.plantwatcher.controllers;

import com.example.plantwatcher.services.implementation.PumpService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pump")
public class PumpController {
private final PumpService pumpService;

    public PumpController(PumpService pumpService) {
        this.pumpService = pumpService;
    }


    @GetMapping
    @RequestMapping("/checkPumpStatus")
    @ResponseBody
    public boolean checkStatus(){

    return pumpService.checkStatus();

    }
}
