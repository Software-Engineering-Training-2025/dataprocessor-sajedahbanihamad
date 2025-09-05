package org.example.dataprocessor.output;

import org.example.dataprocessor.enums.OutputType;

public class OutputFactory {
    public static OutputStrategy getStrategy(OutputType type) {
        switch (type) {
            case CONSOLE:
                return new ConsoleOutput();
            case TEXT_FILE:
                return new FileOutput();
            default:
                throw new IllegalArgumentException("Unknown output type: " + type);
        }
    }
}
