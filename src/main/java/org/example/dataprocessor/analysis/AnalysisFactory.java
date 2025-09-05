package org.example.dataprocessor.analysis;

import org.example.dataprocessor.enums.AnalysisType;

public class AnalysisFactory {
    public static AnalysisStrategy getStrategy(AnalysisType type) {
        switch (type) {
            case MEAN:
                return new MeanAnalysis();
            case MEDIAN:
                return new MedianAnalysis();
            case STD_DEV:
                return new StdDevAnalysis();
            case P90_NEAREST_RANK:
                return new P90NearestRankAnalysis();
            case TOP3_FREQUENT_COUNT_SUM:
                return new Top3FrequentCountSumAnalysis();
            default:
                throw new IllegalArgumentException("Unknown analysis type: " + type);
        }
    }
}
