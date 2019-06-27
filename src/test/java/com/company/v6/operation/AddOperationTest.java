package com.company.v6.operation;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class AddOperationTest {
    @Test
    public void addPositiveToPositive(){
        Operation operation = new AddOperation(2,3);
        double result =operation.perform();
        assertThat(result,is(5.0));
    }

    @Test
    public void addPositiveToPositiveZero(){
        Operation operation = new AddOperation(2,0);
        double result =operation.perform();
        assertThat(result,is(2.0));
    }

    @Test
    public void addPositiveToNegative(){
        Operation operation = new AddOperation(-2,-5);
        double result =operation.perform();
        assertThat(result,is(-7.0));
    }

    @Test
    public void addPositiveToNegativeZero(){
        Operation operation = new AddOperation(-2,0);
        double result =operation.perform();
        assertThat(result,is(-2.0));
    }

    @Test
    public void addPositiveToZeroZero(){
        Operation operation = new AddOperation(0,0);
        double result =operation.perform();
        assertThat(result,is(0.0));
    }


}