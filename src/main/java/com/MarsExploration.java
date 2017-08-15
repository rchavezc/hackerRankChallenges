package com;

public class MarsExploration {
    public static void main(String[] args) {
        String input = "SOSSPSSQSSOR";
        Character[] sos = {'S', 'O', 'S'};
        Integer count = 0, indexSos = 0;

        for (int i = 0; i < input.length(); i++){
            if (indexSos > 2)
                indexSos=0;

            if (input.charAt(i) != sos[indexSos])
                count++;

            indexSos++;
        }

        System.out.println(count);
    }
}
