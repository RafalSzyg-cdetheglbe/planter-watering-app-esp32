package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.models.Insolation;
import com.example.plantwatcher.repository.InsolationRepository;
import com.example.plantwatcher.services.interfaces.InsolationInterface;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class InsolationService implements InsolationInterface {

private final InsolationRepository insolationRepository;

    public InsolationService(InsolationRepository insolationRepository) {
        this.insolationRepository = insolationRepository;
    }

    @Override
    public void postInsolationRead(int insolationRead) {
        Insolation insolation=new Insolation();
        insolation.setDate(LocalDateTime.now().withSecond(0).withNano(0));
        insolation.setValue(insolationRead);

        insolationRepository.save(insolation);
    }

    public Insolation getAllInsolationDataOfLastReading() {
        return insolationRepository.findFirstByOrderByDateDesc();
    }

    public List<Insolation> getAllInsolationReadings() {
        return insolationRepository.findAllByOrderByDateAsc();
    }
}
