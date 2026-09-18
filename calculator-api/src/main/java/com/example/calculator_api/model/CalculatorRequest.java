package com.example.calculator_api.model;

import jakarta.validation.constraints.NotNull;

public class CalculatorRequest {

    @NotNull
    private Double a;

    @NotNull
    private Double b;

    public CalculatorRequest() {
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }
}