package org.example.dataprocessor.cleaning;

import org.example.dataprocessor.enums.CleaningType;

public class CleaningFactory {
    public static CleaningStrategy getStrategy(CleaningType type) {
        return switch (type) {
            case REMOVE_NEGATIVES -> new RemoveNegatives();
            case REPLACE_NEGATIVES_WITH_ZERO -> new ReplaceNegativesWithZero();
        };
    }
}
