package com;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSum {
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0, j = arr.length - 1; i < 4; i++, j--){
            min += arr[i];
            max += arr[j];
        }
        System.out.println(min + " " + max);
    }

    /*private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }*/

    public static void main(String[] args) {
        int[] arr = {256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(arr);
    }
}
