package com;

import java.util.LinkedList;
import java.util.List;

public class Conway {

    private static List<Integer> conway(List<Integer> input){
        List<Integer> output = new LinkedList<>();

        Integer actual = -1;
        Integer group = 0;

        for(Integer i : input){
            if (actual < 0) {
                actual = i;
                group++;
            } else if (actual == i){
                group++;
            } else {
                output.add(group);
                output.add(actual);
                actual = i;
                group = 1;
            }
        }

        if (group != 0){
            output.add(group);
            output.add(actual);
        }

        return output;
    }

    public static void main(String args[]){
        List<Integer> input = new LinkedList<>();
        input.add(1);

        for(int i = 0; i < 10; i++){
            System.out.println("List:");
            input.forEach( e -> System.out.print(e + ", "));
            System.out.println("\n--------------");
            input = conway(input);
        }
    }
}
