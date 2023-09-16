package com.example.demo.application.service;

import com.example.demo.domain.model.*;
import org.springframework.stereotype.Service;

@Service
public class CalcService {

    private final ExternalLogger externalLogger;

    public CalcService(ExternalLogger externalLogger) {
        this.externalLogger = externalLogger;
    }

    public int add(int x, int y) {
        this.externalLogger.log("add called.");
        return new Plus().calculate(x, y);
    }

    public int minus(int x, int y) {
        this.externalLogger.log("minus called.");
        return new Minus().calculate(x, y);
    }

    public int multiply(int x, int y) {
        this.externalLogger.log("multiply called.");
        return new Multiply().calculate(x, y);
    }

    public int divide(int x, int y) {
        this.externalLogger.log("divide called.");
        return new Divide().calculate(x, y);
    }
}
