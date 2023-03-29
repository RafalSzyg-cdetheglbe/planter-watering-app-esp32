package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.models.Configs;
import com.example.plantwatcher.models.Configuration;
import com.example.plantwatcher.repository.ConfigurationRepository;
import com.example.plantwatcher.services.interfaces.ConfigsInterface;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationService implements ConfigsInterface {
    private final ConfigurationRepository configurationRepository;

    public ConfigurationService(ConfigurationRepository configurationRepository) {
        this.configurationRepository = configurationRepository;
    }

    public Configs getConfiguration() {
        Configs configs = new Configs();
        Configuration configuration = configurationRepository.findById(1L).orElse(null);
        configs.setName(configuration.getConfig().getName());
        configs.setInsolationStarter(configuration.getConfig().getInsolationStarter());
        configs.setMoistureStarter(configuration.getConfig().getMoistureStarter());
        configs.setTemperatureStarter(configuration.getConfig().getTemperatureStarter());
        return configs;
    }

    public void changeConfiguration(Configs configs) {
        Configuration configuration = configurationRepository.findById(1L).orElse(null);
        configuration.setConfig(configs);
        configurationRepository.save(configuration);
    }
}
