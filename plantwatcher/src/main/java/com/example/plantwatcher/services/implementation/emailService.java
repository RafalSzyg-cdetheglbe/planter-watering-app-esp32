package com.example.plantwatcher.services.implementation;

import com.example.plantwatcher.models.Configuration;
import com.example.plantwatcher.models.Email;
import com.example.plantwatcher.repository.ConfigurationRepository;
import com.example.plantwatcher.repository.EmailRepository;
import com.example.plantwatcher.repository.InsolationRepository;
import com.example.plantwatcher.repository.TemperatureRepository;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Service
public class emailService {
    final int FIXED_SENDING_RATE = 60*1000;
    final String APPLICATION_EMAIL = "planter.notifier@gmail.com";



    private final JavaMailSender mailSender;

    private final EmailRepository emailRepository;
    private final InsolationRepository insolationRepository;
    private final TemperatureRepository temperatureRepository;
    private final ConfigurationRepository configurationRepository;

    public emailService(JavaMailSender mailSender, EmailRepository emailRepository, InsolationRepository insolationRepository, TemperatureRepository temperatureRepository, ConfigurationRepository configurationRepository) {
        this.mailSender = mailSender;
        this.emailRepository = emailRepository;
        this.insolationRepository = insolationRepository;
        this.temperatureRepository = temperatureRepository;
        this.configurationRepository = configurationRepository;
    }


    public void sendEmailNotification(String email, String type) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom(APPLICATION_EMAIL);
        message.setTo(email);

        if(type.equals("temperature")) {
            message.setSubject("Temperature is too low");
            message.setText("Sensor reading says that temperature is below configured one");
            System.out.println("Wysłane");
        }
        else
        {
            message.setSubject("Insolation is too low");
            message.setText("Sensor reading says that insolation is below configured one");
            System.out.println("Wysłane!");
        }
        mailSender.send(message);
    }

  //  @Scheduled(fixedRate = FIXED_SENDING_RATE)
    public void checkNotification() {

        LocalDateTime currentTime = LocalDateTime.now();
        List<Email> emailList=emailRepository.findAll();
        Configuration configuration = configurationRepository.findById(1L).orElse(null);
        if(temperatureRepository.findFirstByOrderByDateDesc().getValue()<configuration.getConfig().getTemperatureStarter()){



            for (Email email:emailList
                 ) {
                if(email.getTemperatureNotificationDate() == null || email.getTemperatureNotificationDate().isAfter(currentTime.minus(1, ChronoUnit.DAYS)))
                sendEmailNotification(email.getEmail(),"temperature");
            }
        }

        if(insolationRepository.findFirstByOrderByDateDesc().getValue()>configuration.getConfig().getInsolationStarter()){


            for (Email email:emailList
            ) {
                if(email.getInsolationNotificationDate() == null || email.getInsolationNotificationDate().isAfter(currentTime.minus(1, ChronoUnit.DAYS)))
                    sendEmailNotification(email.getEmail(),"insolation");
            }
        }

    }



}
