package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.dto.ConfigsDTO;
import com.example.plantwatcher.models.Configs;
import com.example.plantwatcher.repository.ConfigsRepository;
import com.example.plantwatcher.services.interfaces.ConfigsInterface;
import org.springframework.stereotype.Service;

@Service
public class ConfigsService implements ConfigsInterface {

    private final ConfigsRepository configsRepository;


    public ConfigsService(ConfigsRepository configsRepository) {
        this.configsRepository = configsRepository;
    }

    public void addConfig(ConfigsDTO configsDTO){
        Configs config=new Configs();
        config.setInsolationStarter(configsDTO.getInsolationStarter());
        config.setMoistureStarter(configsDTO.getMoistureStarter());
        config.setTemperatureStarter(configsDTO.getTemperatureStarter());
        config.setName(configsDTO.getName());

        configsRepository.save(config);
    }
}
