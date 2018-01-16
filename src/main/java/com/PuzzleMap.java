package com;

import java.util.*;

public class PuzzleMap {

    public static void main(String[] args){
        Integer[] input = {100,100,225,300,473,80};
        Integer[] output = {180,773,225,100};

        Arrays.sort(input);
        Arrays.sort(output);

        List<Integer> inputList = Arrays.asList(input);
        List<Integer> outputList = Arrays.asList(output);

        Collections.reverse(inputList);
        Collections.reverse(outputList);

        Map<Integer, List<List<Integer>>> combinations = new HashMap<>();

        for (Integer element : outputList){
            List<List<Integer>> combinationList = new ArrayList<>();
            for (int i = 0; i < inputList.size(); i++){
               int sum = inputList.get(i);
               List<Integer> combination = new ArrayList<>();
               if (sum < element) {
                   combination.add(i);
                   inner:
                   for (int j = i + 1; j < inputList.size(); j++) {
                        sum += inputList.get(j);
                        if (sum == element) {
                            combination.add(j);
                            combinationList.add(combination);
                            break inner;
                        } else if (sum < element) {
                            combination.add(j);
                        }  else {
                            sum -= inputList.get(j);
                        }
                   }
               } else if (sum == element){
                   combination.add(i);
                   combinationList.add(combination);
               }
            }
            combinations.put(element, combinationList);
        }

        Map<Integer, List<Integer>> goodCombination = new HashMap<>();

        for (Integer element : outputList){
            for (List<Integer> combination : combinations.get(element)){

            }
        }
    }
}
