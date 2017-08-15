package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonDivisibleSubset {
    private static Integer nonDivSub(Integer[] numbers, Integer k){
        int result = 0;
        for (int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++ ){
                if ((numbers[i] + numbers[j]) % k == 0)
                    result++;
            }
        }
        return result;
    }

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);
        String[] line1 = scan.nextLine().split(" ");

        Integer k = Integer.valueOf(line1[1]);
        String[] input = scan.nextLine().split(" ");
        Integer[] list = new Integer[Integer.valueOf(line1[0])];

        int a = 0;
        for (String in : input){
            list[a++]= Integer.valueOf(in);
        }

        System.out.println(nonDivSub(list, k));
    }
}
