package com.example.calculator_api.model;

public class CalculatorResponse {

    private double result;

    public CalculatorResponse(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }
}