package com.example.plantwatcher.controllers;

import com.example.plantwatcher.models.Moisture;
import com.example.plantwatcher.services.implementation.MoistureService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

        System.out.println("MOISTURE: "+requestBody);
        moistureService.postSensorRead(Integer.parseInt(requestBody));
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @RequestMapping("/getMoisture")
    public ResponseEntity<String> getMoistureInfo(){
        Moisture moisture=moistureService.getAllMoistureDataOfLastReading();
      return ResponseEntity.ok(moisture.toString());
    }

    @GetMapping
    @RequestMapping("/getAllMoistureReadings")
    public ResponseEntity<String> getAllMoistureReadings(){
        List<Moisture> moistures=moistureService.getAllMoistureReadings();
        return ResponseEntity.ok(moistures.toString());
    }


}
