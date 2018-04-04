package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IceCreamParlor {
    static int[] icecreamParlor(int m, int[] arr) {
        int[] positions = new int[2];
        for (int i = 0; i < arr.length; i++){
            int result = 0;
            result += arr[i];

            if (result < m) {
                positions[0] = i + 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (result + arr[j] == m){
                        positions[1] = j + 1;
                        return positions;
                    }
                }
            }
        }
        return null;
    }
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }*/

    public static void main(String[] args) {
        int[] array = {2,2,4,3};
        int[] result = icecreamParlor(4, array);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
