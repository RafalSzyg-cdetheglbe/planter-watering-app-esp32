package com.example.plantwatcher.controllers;

import com.fasterxml.jackson.core.JsonParser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/moisture")
public class MoistureController {

    @PostMapping
    @RequestMapping("/sensorRead")
    public ResponseEntity<String> postMoistureRead(@RequestBody String requestBody){

        System.out.println("Moisture: "+requestBody);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    @RequestMapping("/getMoisture")
    public ResponseEntity<String> getMoistureInfo(){
        ResponseEntity<String>responseEntity;
      return ResponseEntity.ok().build();
    }
}
