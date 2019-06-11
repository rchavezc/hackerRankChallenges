package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int result = 0;

        for (;i <= j; i++) {
            StringBuilder reversed = new StringBuilder();
            Integer aux = i;
            reversed.append(aux.toString()).reverse();
            aux = Integer.valueOf(reversed.toString());
            if (Math.abs(i - aux) % k == 0) {
                result++;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }

//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] ijk = scanner.nextLine().split(" ");
//
//        int i = Integer.parseInt(ijk[0]);
//
//        int j = Integer.parseInt(ijk[1]);
//
//        int k = Integer.parseInt(ijk[2]);
//
//        int result = beautifulDays(i, j, k);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//    }
}
