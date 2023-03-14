package com.example.plantwatcher.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/temperature")
public class TemperatureController {
    @PostMapping
    @RequestMapping("/sensorRead")
    public ResponseEntity<String> postTemperatureRead(@RequestBody String requestBody){

       // System.out.println(requestBody);
        return ResponseEntity.ok().build();
    }
}
