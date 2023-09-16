package com.example.demo.domain.model;

public class Minus implements Calculator {
    @Override
    public int calculate(int x, int y) {
        return x - y;
    }
}
