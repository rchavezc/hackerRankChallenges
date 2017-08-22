package com;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciModified {

    private static BigInteger pow(BigInteger in){
        return in.multiply(in);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");

        double n = Double.parseDouble(input[2]);

        BigInteger t1 = new BigInteger(input[0]);
        BigInteger t2 = new BigInteger(input[1]);
        BigInteger tn = new BigInteger("0");

        for (int i = 1; i < n - 1; i++){
            tn = t1.add(pow(t2));
            t1 = t2;
            t2 = tn;
        }

        System.out.println(tn);
    }
}
