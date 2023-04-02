package com.example.plantwatcher.controllers;


import com.example.plantwatcher.models.Plant;
import com.example.plantwatcher.services.implementation.PlantService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/plants")
@CrossOrigin(origins = "*")
public class PlantController {

    private final PlantService plantService;

    public PlantController(PlantService plantService) {
        this.plantService = plantService;
    }

    @GetMapping
    @ResponseBody
    @RequestMapping("/getPlants")
    public List<Plant> getAllPlants(){
        return plantService.getAllPlants();
    }


}
