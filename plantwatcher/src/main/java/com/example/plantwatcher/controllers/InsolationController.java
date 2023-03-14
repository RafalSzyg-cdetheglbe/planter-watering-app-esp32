package com.example.plantwatcher.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/insolation")
public class InsolationController {

    @PostMapping
    @RequestMapping("/sensorRead")
    public ResponseEntity<String> postInsolationRead(@RequestBody String requestBody){

       // System.out.println(requestBody);
        return ResponseEntity.ok().build();
    }
}
