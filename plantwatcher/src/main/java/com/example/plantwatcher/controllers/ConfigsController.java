package com.example.plantwatcher.controllers;


import com.example.plantwatcher.dto.ConfigsDTO;
import com.example.plantwatcher.services.implementation.ConfigsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/configs")
public class ConfigsController {

    private final ConfigsService configsService;

    public ConfigsController(ConfigsService configsService) {
        this.configsService = configsService;
    }

    @PostMapping
    @RequestMapping("/addConfig")
    public ResponseEntity<String> addConfig(@RequestBody ConfigsDTO configsDTO){

        configsService.addConfig(configsDTO);

        return ResponseEntity.ok("Config added");
    }
}
