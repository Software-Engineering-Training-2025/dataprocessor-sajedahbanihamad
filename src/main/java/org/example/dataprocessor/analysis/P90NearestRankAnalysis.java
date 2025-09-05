package org.example.dataprocessor.analysis;

import java.util.List;

public class P90NearestRankAnalysis implements AnalysisStrategy {
    @Override
    public double analyze(List<Integer> data) {
        if (data.isEmpty()) return Double.NaN;
        List<Integer> sorted = data.stream().sorted().toList();
        int n = sorted.size();
        int rank = (int) Math.ceil(0.9 * n);
        return sorted.get(rank - 1);
    }
}
