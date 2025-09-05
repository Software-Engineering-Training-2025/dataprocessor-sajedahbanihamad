package org.example.dataprocessor.cleaning;

import java.util.List;
import java.util.stream.Collectors;

public class ReplaceNegativesWithZero implements CleaningStrategy {
    @Override
    public List<Integer> clean(List<Integer> data) {
        return data.stream()
                .map(x -> x < 0 ? 0 : x)
                .collect(Collectors.toList());
    }
}
