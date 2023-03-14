package com.example.plantwatcher.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pump")
public class PumpController {

    @GetMapping
    @RequestMapping("/checkPumpStatus")
    @ResponseBody
    public boolean pumpOn(){
    return true;
    }
}
