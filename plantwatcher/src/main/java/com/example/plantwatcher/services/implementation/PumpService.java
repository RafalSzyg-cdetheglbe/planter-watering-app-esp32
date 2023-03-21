package com.example.plantwatcher.services.implementation;


import com.example.plantwatcher.models.*;
import com.example.plantwatcher.repository.*;
import com.example.plantwatcher.services.interfaces.PumpInterface;
import jakarta.transaction.Transactional;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class PumpService implements PumpInterface {
    private final PumpRepository pumpRepository;
    private final ConfigurationRepository configurationRepository;
    private final MoistureRepository moistureRepository;
    private final TemperatureRepository temperatureRepository;
    private final InsolationRepository insolationRepository;

    public PumpService(PumpRepository pumpRepository, ConfigurationRepository configurationRepository, MoistureRepository moistureRepository, TemperatureRepository temperatureRepository, InsolationRepository insolationRepository) {
        this.pumpRepository = pumpRepository;
        this.configurationRepository = configurationRepository;
        this.moistureRepository = moistureRepository;
        this.temperatureRepository = temperatureRepository;
        this.insolationRepository = insolationRepository;
    }

    public void turnThePumpOn(Pump pump){
        pump.setState(true);
        pump.setWasChecked(false);
        pumpRepository.save(pump);
    }

    public void turnThePumpOff(Pump pump){
        pump.setState(true);
        pumpRepository.save(pump);
    }

    public boolean checkStatus() {
       Pump pump = pumpRepository.findById(1L).orElse(null);
        assert pump != null;
        pump.setWasChecked(true);

        if(pump.getState()) {
            pump.setState(false);
            pumpRepository.save(pump);
            return true;
        }
        else {
            pumpRepository.save(pump);
            return false;}
    }

    @Scheduled(fixedDelay = 10000)
    @Transactional
    public void updatePumpStatus() {

        Pump pump = pumpRepository.findById(1L).orElse(null);
        if (pump.getWasChecked()) {
            Configuration configuration = configurationRepository.findById(1L).orElse(null);
            assert configuration != null;
            assert pump != null;
            Insolation insolation = insolationRepository.findFirstByOrderByDateDesc();
            Moisture moisture = moistureRepository.findFirstByOrderByDateDesc();
            Temperature temperature = temperatureRepository.findFirstByOrderByDateDesc();


            if (configuration.getConfig().getMoistureStarter() < moisture.getValue()) {
                turnThePumpOn(pump);
            }

        }
    }

}
