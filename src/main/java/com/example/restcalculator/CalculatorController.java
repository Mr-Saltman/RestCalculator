package com.example.restcalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/sum")
    int sum(@RequestParam int a, @RequestParam int b){
        return a + b;
    }

    @RequestMapping("/mul")
    int mul(@RequestParam int a, @RequestParam int b){ return a*b; }

    @RequestMapping("/quad")
    int quad(@RequestParam int a){ return a*a; }

    @RequestMapping("/absolute")
    int abs(@RequestParam int a){ if(a>0){return a;} else{return a*(-1);} }

    @RequestMapping("/exp")
    double exp(@RequestParam double a, @RequestParam int b){
        if(b>0){
            return expCalc(a, b);
        } else if(b<0){
            return (1/expCalc(a, b));
        } else {
            return 1;
        }
    }

    double expCalc(double a, int b){
        double val = 1;
        int b_absolute = abs(b);

        for(int i=0; i<b_absolute; i++){
            val=val*a;
        }

        return val;
    }

}
