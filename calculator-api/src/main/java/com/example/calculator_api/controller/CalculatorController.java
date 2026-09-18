package com.example.calculator_api.controller;

import com.example.calculator_api.model.CalculatorRequest;
import com.example.calculator_api.model.CalculatorResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
@CrossOrigin(origins = "https://calculators-api-tau.vercel.app")
public class CalculatorController {

    @PostMapping("/add")
    public ResponseEntity<CalculatorResponse> add(
            @Valid @RequestBody CalculatorRequest request) {

        double ans = request.getA() + request.getB();

        return ResponseEntity.ok(
                new CalculatorResponse(ans)
        );
    }

    @PostMapping("/subtract")
    public ResponseEntity<CalculatorResponse> subtract(
            @Valid @RequestBody CalculatorRequest request) {

        double ans = request.getA() - request.getB();

        return ResponseEntity.ok(
                new CalculatorResponse(ans)
        );
    }

    @PostMapping("/multiply")
    public ResponseEntity<CalculatorResponse> multiply(
            @Valid @RequestBody CalculatorRequest request) {

        double ans = request.getA() * request.getB();

        return ResponseEntity.ok(
                new CalculatorResponse(ans)
        );
    }

    @PostMapping("/division")
    public ResponseEntity<?> divide(
            @Valid @RequestBody CalculatorRequest request) {

        if (request.getB() == 0) {
            return ResponseEntity
                    .badRequest()
                    .body("Can't divide by zero");
        }

        double ans = request.getA() / request.getB();

        return ResponseEntity.ok(
                new CalculatorResponse(ans)
        );
    }
}