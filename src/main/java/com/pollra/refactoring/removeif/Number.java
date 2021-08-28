package com.pollra.refactoring.removeif;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @since       2021.08.27
 * @author      pollra
 **********************************************************************************************************************/
public class Number {
    private final int no;
    private final static Map<String, BinaryFunction<Integer, Number>> operatorMap;
    static {
        operatorMap = new HashMap<>();
        operatorMap.put("+", (a, b) -> new Number(a + b));
        operatorMap.put("-", (a, b) -> new Number(a - b));
        operatorMap.put("*", (a, b) -> new Number(a * b));
        operatorMap.put("/", (a, b) -> new Number(a / b));
    }

    public Number(int no) {
        this.no = no;
    }

    public Number calculate(String expression, Number number) {
        return Optional.ofNullable(operatorMap.get(expression))
                .orElseThrow(IllegalArgumentException::new)
                .apply(this.no, number.no);
    }

    public int getNo() {
        return no;
    }
}
