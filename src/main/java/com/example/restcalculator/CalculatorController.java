package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    Calculator calculator = new Calculator();

    @RequestMapping("/sum")
    int sum(@RequestParam int a, @RequestParam int b){
        return calculator.sum(a, b);
    }

    @RequestMapping("/mul")
    int mul(@RequestParam int a, @RequestParam int b){ return calculator.mul(a, b); }

    @RequestMapping("/div")
    int div(@RequestParam int a, @RequestParam int b){ return calculator.div(a, b);}

    @RequestMapping("/quad")
    int quad(@RequestParam int a){ return calculator.quad(a); }

    @RequestMapping("/absolute")
    int abs(@RequestParam int a){ return calculator.abs(a); }

    @RequestMapping("/exp")
    double exp(@RequestParam int a, @RequestParam int b){
        return calculator.exp(a, b);
    }



}
