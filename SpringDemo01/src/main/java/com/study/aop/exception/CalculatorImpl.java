package com.study.aop.exception;

/**
 * @author yyt
 */
public class CalculatorImpl implements CalculatorService{

    @Override
    public int numAdd(int a, int b) {
        return a + b;
    }

    @Override
    public int numSub(int a, int b) {
        return a - b;
    }

    @Override
    public int numMul(int a, int b) {
        return a * b;
    }

    @Override
    public int numDiv(int a, int b) {
        return a / b;
    }
}
