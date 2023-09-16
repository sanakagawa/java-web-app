package com.example.demo.port.adapter.resource;

import com.example.demo.application.service.CalcService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculatorResource {

    private final CalcService calcService;

    public CalculatorResource(CalcService calcService) {
        this.calcService = calcService;
    }

    // 足し算の結果を返却する
    // http://localhost:8080/calc/add?x=1&y=2
    @GetMapping("/add")
    @ResponseStatus(HttpStatus.OK)
    public int add(int x, int y) {
        return this.calcService.add(x, y);
    }

    @GetMapping("/minus")
    @ResponseStatus(HttpStatus.OK)
    public int minus(int x, int y) {
        return this.calcService.minus(x, y);
    }

    // 掛け算の結果を返却する
    @GetMapping("/multiply")
    @ResponseStatus(HttpStatus.OK)
    public int multiply(int x, int y) {
        return this.calcService.multiply(x, y);
    }

    // 割り算の結果を返却する
    @GetMapping("/divide")
    @ResponseStatus(HttpStatus.OK)
    public int divide(int x, int y) {
        return this.calcService.divide(x, y);
    }

}
