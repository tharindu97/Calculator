package com.company.v6.operation;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

public class OperationFactoryTest {

    @Test
    public void shouldReturnAddOperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("add" , inputNumbers);
        // verify operations is an instance of add operation class

        assertThat(operation, instanceOf(AddOperation.class));

    }

    @Test
    public void shouldReturnSubOperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("sub" , inputNumbers);
        // verify operations is an instance of add operation class

        assertThat(operation, instanceOf(SubOperation.class));

    }

    @Test
    public void shouldReturnMulOperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("mul" , inputNumbers);
        // verify operations is an instance of add operation class

        assertThat(operation, instanceOf(MulOperation.class));

    }

    @Test
    public void shouldReturnDivOperation(){
        OperationFactory operationFactory = new OperationFactory();
        List<Double> inputNumbers = new ArrayList<>();
        inputNumbers.add(10.0);
        inputNumbers.add(20.0);
        Operation operation = operationFactory.getInstance("div" , inputNumbers);
        // verify operations is an instance of add operation class

        assertThat(operation, instanceOf(DivOperation.class));

    }


}