package org.example.dataprocessor.output;

public class ConsoleOutput implements OutputStrategy {
    @Override
    public void output(double result) {
        System.out.println("Result = " + result);
    }
}
