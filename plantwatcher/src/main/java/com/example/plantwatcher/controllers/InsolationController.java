package com.example.plantwatcher.controllers;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.models.Moisture;
import com.example.plantwatcher.models.Temperature;
import com.example.plantwatcher.services.implementation.InsolationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/insolation")
public class InsolationController {
private final InsolationService insolationService;

    public InsolationController(InsolationService insolationService) {
        this.insolationService = insolationService;
    }


    @PostMapping
    @RequestMapping("/sensorRead")
    public ResponseEntity<String> postInsolationRead(@RequestBody String requestBody){

        insolationService.postInsolationRead(Integer.parseInt(requestBody));
        System.out.println("INSOLATION: "+requestBody);
        return ResponseEntity.ok().build();
    }


    @GetMapping
    @RequestMapping("/getInsolation")
    public ResponseEntity<String> getInsolationInfo(){
        Insolation insolation= insolationService.getAllInsolationDataOfLastReading();
        return ResponseEntity.ok(insolation.toString());
    }

    @GetMapping
    @RequestMapping("/getAllInsolationReadings")
    public ResponseEntity<String> getAllMoistureReadings(){
        List<Insolation> moistures=insolationService.getAllInsolationReadings();
        return ResponseEntity.ok(moistures.toString());
    }


}
