package org.example.dataprocessor;

import org.example.dataprocessor.enums.AnalysisType;
import org.example.dataprocessor.enums.CleaningType;
import org.example.dataprocessor.enums.OutputType;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            DataProcessorService service = new DataProcessorService();


            List<Integer> data1 = Arrays.asList(5, -2, 7, 8);
            double result1 = service.process(
                    CleaningType.REMOVE_NEGATIVES,
                    AnalysisType.MEAN,
                    OutputType.CONSOLE,
                    data1
            );
            System.out.println("Returned result = " + result1);
            System.out.println("----");


            List<Integer> data2 = Arrays.asList(5, -2, 7, 8);
            double result2 = service.process(
                    CleaningType.REPLACE_NEGATIVES_WITH_ZERO,
                    AnalysisType.MEDIAN,
                    OutputType.TEXT_FILE,
                    data2
            );
            System.out.println("Returned result = " + result2);
            System.out.println("Check target/result.txt");
            System.out.println("----");


            List<Integer> data3 = Arrays.asList(1,3,5,7,9,11,13,15,17,19);
            double result3 = service.process(
                    CleaningType.REMOVE_NEGATIVES,
                    AnalysisType.P90_NEAREST_RANK,
                    OutputType.CONSOLE,
                    data3
            );
            System.out.println("Returned result = " + result3);
            System.out.println("----");


            List<Integer> data4 = Arrays.asList(2,4,4,4,5,5,7,9);
            double result4 = service.process(
                    CleaningType.REPLACE_NEGATIVES_WITH_ZERO,
                    AnalysisType.STD_DEV,
                    OutputType.TEXT_FILE,
                    data4
            );
            System.out.println("Returned result = " + result4);
            System.out.println("Check target/result.txt");
            System.out.println("----");


            List<Integer> data5 = Arrays.asList(5,5,5,1,1,2,2,3);
            double result5 = service.process(
                    CleaningType.REMOVE_NEGATIVES,
                    AnalysisType.TOP3_FREQUENT_COUNT_SUM,
                    OutputType.CONSOLE,
                    data5
            );
            System.out.println("Returned result = " + result5);
            System.out.println("----");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

