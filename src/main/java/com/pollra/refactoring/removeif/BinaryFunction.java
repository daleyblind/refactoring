package com.pollra.refactoring.removeif;

@FunctionalInterface
public interface BinaryFunction<T, R> {
    R apply(T t1, T t2);
}
