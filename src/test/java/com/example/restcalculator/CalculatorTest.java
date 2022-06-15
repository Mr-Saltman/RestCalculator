package com.example.restcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest(){
        // Arrange
        int a = 21;
        int b = 9;

        int expectedResult = 30;

        // Act

        int result = calculator.sum(a, b);

        // Assert

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void mulTest(){
        int a = 9;
        int b = 3;

        int expectedResult = 27;

        int result = calculator.mul(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void divTest(){
        int a = 9;
        int b = 3;

        int expectedResult = 3;

        int result = calculator.div(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void divTestCheckZero(){
        int a = 9;
        int b = 0;

        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.div(a, b);
        });
    }

    @Test
    void quadTest(){
        int a = 9;

        int expectedResult = 81;

        int result = calculator.quad(a);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void absTest(){
        int a = -9;

        int expectedResult = 9;

        int result = calculator.abs(a);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void expTest(){
        int a = 3;
        int b = 3;

        int expectedResult = 27;

        double result = calculator.exp(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void expSmallerThanZeroTest(){
        int a = 3;
        int b = -1;

        double expectedResult = 1.0/3.0;

        double result = calculator.exp(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void expOneTest(){
        int a = 3;
        int b = 1;

        int expectedResult = 3;

        double result = calculator.exp(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void expZeroTest(){
        int a = 3;
        int b = 0;

        int expectedResult = 1;

        double result = calculator.exp(a, b);

        Assertions.assertEquals(expectedResult, result);
    }

}
