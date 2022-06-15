package com.example.restcalculator;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public int mul(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        if(b == 0){
            throw new ArithmeticException();
        } else {
            return a / b;
        }
    }

    public int quad(int a){
        return a*a;
    }

    public int abs(int a){
        if(a>0){return a;} else{return a*(-1);}
    }

    public double exp(int a, int b){
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
