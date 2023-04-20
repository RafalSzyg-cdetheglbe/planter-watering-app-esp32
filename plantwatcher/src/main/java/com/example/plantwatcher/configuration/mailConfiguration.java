package com.example.plantwatcher.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@Configuration
public class mailConfiguration {
    @Value("${spring.mail.host}")
    private String host;

    @Value("${spring.mail.port}")
    private int port;

    @Value("${spring.mail.username}")
    private String username;

    @Value("${spring.mail.password}")
    private String password;

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost(host);
        sender.setPort(port);
        sender.setUsername(username);
        sender.setPassword(password);
        System.out.println(username);
        System.out.println(password);
        sender.setJavaMailProperties(getMailProperties());
        return sender;
    }

    private Properties getMailProperties() {
        Properties properties = new Properties();
        properties.put("spring.mail.smtp.auth", true);
        properties.put("spring.mail.smtp.starttls.enable", true);
        return properties;
    }
}
