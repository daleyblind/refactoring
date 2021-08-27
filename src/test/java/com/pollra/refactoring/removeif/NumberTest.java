package com.pollra.refactoring.removeif;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberTest {

    @Test
    void test() {
        // given
        Number firstNumber = new Number(10);
        Number secondNumber = new Number(5);

        // when
        Number resultByPlus = firstNumber.calculate("+", secondNumber);
        Number resultByMinus = firstNumber.calculate("-", secondNumber);
        Number resultByMultiply = firstNumber.calculate("*", secondNumber);
        Number resultByDivide = firstNumber.calculate("/", secondNumber);

        // then
        assertEquals(15, resultByPlus.getNo());
        assertEquals(5, resultByMinus.getNo());
        assertEquals(50, resultByMultiply.getNo());
        assertEquals(2, resultByDivide.getNo());
    }

}