package com;

import java.io.IOException;
import java.util.Scanner;

public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int a1 = x1, a2 = x2;
        if (x1 < x2 && v2 < v1){
            while (a1 <= a2) {
                if (a1 == a2)
                    return "YES";
                a1 += v1;
                a2 += v2;
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

        String result = kangaroo(x1, v1, x2, v2);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();*/

        System.out.println(kangaroo(0, 2, 5 ,3));
    }
}
