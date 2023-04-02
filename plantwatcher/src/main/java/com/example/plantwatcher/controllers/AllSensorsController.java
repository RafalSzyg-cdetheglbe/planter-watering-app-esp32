package com.example.plantwatcher.controllers;


import com.example.plantwatcher.models.Sensor;
import com.example.plantwatcher.services.implementation.SensorService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sensors")
@CrossOrigin(origins = "*")
public class AllSensorsController {

    private final SensorService sensorService;

    public AllSensorsController(SensorService sensorService) {
        this.sensorService = sensorService;
    }
    @GetMapping
    @RequestMapping("/getAllSensorInfo")
    @ResponseBody
    public Sensor getAllSensorsInfo(){
        return sensorService.getAllSensorsInfo();
    }
}
