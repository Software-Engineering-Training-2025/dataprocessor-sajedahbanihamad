package org.example.dataprocessor.analysis;

import java.util.*;
import java.util.stream.Collectors;

public class Top3FrequentCountSumAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return 0.0;

        Map<Integer, Long> freq = data.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        return freq.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = Long.compare(b.getValue(), a.getValue());
                    if (cmp == 0) return Integer.compare(a.getKey(), b.getKey());
                    return cmp;
                })
                .limit(3)
                .mapToLong(Map.Entry::getValue)
                .sum();
    }
}
