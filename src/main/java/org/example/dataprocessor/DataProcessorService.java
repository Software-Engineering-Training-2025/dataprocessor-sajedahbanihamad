package org.example.dataprocessor;

import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;
import org.example.dataprocessor.cleaning.*;
import org.example.dataprocessor.analysis.*;
import org.example.dataprocessor.output.*;

import java.util.ArrayList;
import java.util.List;

public class DataProcessorService {

    public double process(
            CleaningType cleaningType,
            AnalysisType analysisType,
            OutputType outputType,
            List<Integer> data) throws Exception {


        CleaningStrategy cleaner = CleaningFactory.getStrategy(cleaningType);
        List<Integer> cleaned = cleaner.clean(new ArrayList<>(data));


        AnalysisStrategy analyzer = AnalysisFactory.getStrategy(analysisType);
        double result = analyzer.analyze(cleaned);


        OutputStrategy out = OutputFactory.getStrategy(outputType);
        out.output(result);


        return result;
    }
}

