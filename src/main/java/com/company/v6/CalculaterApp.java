package com.company.v6;

import com.company.v6.input.CMDLineInputs;
import com.company.v6.input.Inputs;
import com.company.v6.operation.Operation;
import com.company.v6.operation.OperationFactory;
import com.company.v6.output.ConsoleOutput;
import com.company.v6.output.Outputs;
import com.company.v6.repository.FIleNumberRepository;
import com.company.v6.repository.NumberRepository;

import java.util.List;

public class CalculaterApp {

    private NumberRepository numberRepository;
    private  String[] args;

    public CalculaterApp(NumberRepository numberRepository,String[] args){
        this.numberRepository = numberRepository;
        this.args = args;
    }

    public void run() {

        Inputs inputs = new CMDLineInputs(args);
        String operator = inputs.read();

        //NumberRepository numberRepository = new FIleNumberRepository();
        List<Double> inputNumbers = numberRepository.read();


        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator,inputNumbers);


        Outputs outputs = new ConsoleOutput();
        outputs.show("The result is: " + operation.perform());
        outputs.show("Exiting the program....");
    }
}
