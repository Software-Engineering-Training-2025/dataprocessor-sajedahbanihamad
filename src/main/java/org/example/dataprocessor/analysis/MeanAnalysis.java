package org.example.dataprocessor.analysis;

import java.util.List;

public class MeanAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        return data.stream().mapToDouble(x -> x).average().orElse(Double.NaN);
    }
}
