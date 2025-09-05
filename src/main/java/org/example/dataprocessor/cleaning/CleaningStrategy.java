package org.example.dataprocessor.cleaning;

import java.util.List;

public interface CleaningStrategy {
    List<Integer> clean(List<Integer> data);
}
