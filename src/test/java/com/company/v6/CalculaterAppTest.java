package com.company.v6;

import com.company.v6.operation.Operation;
import com.company.v6.repository.NumberRepository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
//import static org.mockito.Mockito.when;

public class CalculaterAppTest {
                @Test
                public void  testCase1(){
                    NumberRepository numberRepository = mock(NumberRepository.class);
                    List<Double> numbers = new ArrayList<>();
                    numbers.add(30.0);
                    numbers.add(20.0);
                    when(numberRepository.read()).thenReturn(numbers);
                    String[] args = {"add"};
                    CalculaterApp calculaterApp = new CalculaterApp(numberRepository, args);
                    calculaterApp.run();
                }
}