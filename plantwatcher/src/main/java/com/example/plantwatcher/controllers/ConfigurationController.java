package com.example.plantwatcher.controllers;

import com.example.plantwatcher.models.Configs;
import com.example.plantwatcher.models.Configuration;
import com.example.plantwatcher.services.implementation.ConfigurationService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/configuration")
@CrossOrigin(origins = "*")
public class ConfigurationController {

private final ConfigurationService configurationService;

    public ConfigurationController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }


    @GetMapping
@RequestMapping("/getCurrentConfiguration")
    @ResponseBody
public Configs getCurrentConfiguration()
{
 return configurationService.getConfiguration();
}

@PostMapping
    @RequestMapping("/changeConfiguration")
    public ResponseEntity<String> changeConfiguration(@RequestBody Configs config){
        configurationService.changeConfiguration(config);
        return ResponseEntity.ok().build();
}


}
