package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Puzzle {

    public static void main(String[] args){
        Integer[] input = {100,100,225,300,473,80};
        Integer[] output = {180,773,225,100};

        Arrays.sort(input);
        Arrays.sort(output);

        List<Integer> inputList = Arrays.asList(input);
        List<Integer> outputList = Arrays.asList(output);

        Collections.reverse(inputList);
        Collections.reverse(outputList);

        for (int i:output){
            System.out.println(String.format("Printing %d", i));
            List<Integer> elements = new ArrayList<>();

            outer:
            for (int j = 0; j < input.length; j++) {
                int sum = input[j];
                elements.add( input[j]);
                if (sum == i){
                    elements.forEach(e -> System.out.println(e));
                    break outer;
                } else {
                    inner:
                    for (int k = j + 1; k < input.length; k++) {
                        elements.add(input[k]);
                        sum += input[k];
                        if (sum > i) {
                            elements.clear();
                            break inner;
                        } else if (sum == i) {
                            elements.forEach(e -> {
                                System.out.println(e);
                                final int[] some = new int[input.length - elements.size()];
                                for (int l = 0; l < input.length; l++){
                                    if (elements.get(input[l]) == null)
                                        some[l] = elements.get(input[l]);
                                }
                            });
                            break outer;
                        }
                    }
                    elements.clear();
                }
            }
            if (elements.isEmpty())
                System.out.println("No match found");
            elements.clear();
        }
    }
}
