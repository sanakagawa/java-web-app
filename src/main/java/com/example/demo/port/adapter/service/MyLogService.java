package com.example.demo.port.adapter.service;

import com.example.demo.domain.model.ExternalLogger;
import org.springframework.stereotype.Component;

@Component
public class MyLogService implements ExternalLogger {
    @Override
    public void log(String message) {
        System.out.println("MyLogService: " + message);
    }
}
