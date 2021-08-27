package com.pollra.refactoring.removeif;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @since       2021.08.27
 * @author      pollra
 * @description number
 **********************************************************************************************************************/
public class Number {
    private int no;

    public Number(int no) {
        this.no = no;
    }

    public Number calculate(String expression, Number number) {
        Map<String, BinaryFunction<Integer, Number>> operatorMap = new HashMap<>();
        operatorMap.put("+", (a, b) -> new Number(a + b));
        operatorMap.put("-", (a, b) -> new Number(a - b));
        operatorMap.put("*", (a, b) -> new Number(a * b));
        operatorMap.put("/", (a, b) -> new Number(a / b));
        return Optional.ofNullable(operatorMap.get(expression))
                .orElseThrow(IllegalArgumentException::new)
                .apply(this.no, number.no);
    }

    public int getNo() {
        return no;
    }

    @Override
    public String toString() {
        return "Number{" +
                "no=" + no +
                "}";
    }
}
