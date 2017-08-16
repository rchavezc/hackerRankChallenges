package com;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedian {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        String[] inputS = scan.nextLine().split(" ");
        int[] input = new int[inputS.length];

        int i = 0;
        for(String in : inputS){
            input[i++] = Integer.valueOf(in);
        }

        Arrays.sort(input);

        int midd = input.length / 2;

        System.out.println(input[midd]);
    }
}
