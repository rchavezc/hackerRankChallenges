package com;

import javafx.collections.transformation.SortedList;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SortedVotes {

    public static void main( String[] args ) {
        String[] array = {"Mariana", "Victor", "Soledad", "Victor", "Mariana", "Soledad", "Mariana"};

        List<String> list = Arrays.asList(array);
        list.sort(String::compareTo);

        String current = list.get(0);
        String winner = current;

        Integer max = 0, count = 0;

        for (String element: list){
            if (element.equals(current))
                max++;
            else {
                max = 1;
            }
            if (count <= max){
                winner = winner.compareTo(current) < 0 ? current : winner;
                count = max;
            }
            current = element;
        }

        System.out.println(winner);
    }
}
