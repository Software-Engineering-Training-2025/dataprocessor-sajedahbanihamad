package org.example.dataprocessor.cleaning;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveNegatives implements CleaningStrategy {
    @Override
    public List<Integer> clean(List<Integer> data) {
        return data.stream()
                .filter(x -> x >= 0)
                .collect(Collectors.toList());
    }
}

