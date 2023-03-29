package com.example.plantwatcher.controllers;


import com.example.plantwatcher.dto.ConfigsDTO;
import com.example.plantwatcher.models.Configs;
import com.example.plantwatcher.services.implementation.ConfigsService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/configs")
@CrossOrigin(origins = "*")
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

    @GetMapping
    @RequestMapping("/getAllConfigurations")
    @ResponseBody
    public List<Configs> getAllConfigs(){
       return configsService.getAllConfigs();
    }

}
