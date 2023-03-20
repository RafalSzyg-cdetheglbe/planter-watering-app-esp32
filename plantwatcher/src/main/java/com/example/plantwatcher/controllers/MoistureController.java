package com.example.plantwatcher.controllers;

import com.example.plantwatcher.services.implementation.MoistureService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/moisture")
public class MoistureController {

private final MoistureService moistureService;

    public MoistureController(MoistureService moistureService) {
        this.moistureService = moistureService;
    }


    @PostMapping
    @RequestMapping("/sensorRead")
    public ResponseEntity<String> postMoistureRead(@RequestBody String requestBody){

        System.out.println("Moisture: "+requestBody);
        moistureService.postSensorRead(Integer.parseInt(requestBody));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @RequestMapping("/getMoisture")
    public ResponseEntity<String> getMoistureInfo(){
        ResponseEntity<String>responseEntity;
      return ResponseEntity.ok().build();
    }
}
