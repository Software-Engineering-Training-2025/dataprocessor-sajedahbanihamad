package org.example.dataprocessor.analysis;

import java.util.List;

public class StdDevAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        double mean = data.stream().mapToDouble(x -> x).average().orElse(0);
        double variance = data.stream()
                .mapToDouble(x -> Math.pow(x - mean, 2))
                .sum() / data.size();
        return Math.sqrt(variance);
    }
}
