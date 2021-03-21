package com;

import java.math.BigInteger;
import java.util.*;

public class BigSorting {

    static String[] bigSorting(String[] unsorted) {
        TreeSet<BigInteger> bigIntegers = new TreeSet<>();

        for(String a : unsorted){
            bigIntegers.add(new BigInteger(a));
        }

        String[] sorted = new String[unsorted.length];

        int a = 0;
        for (BigInteger big : bigIntegers){
            sorted[a++] = big.toString();
        }

        return sorted;
    }

    public static void main(String[] args) {
        String[] stringArray = {"6",
                "31415926535897932384626433832795",
                "1",
                "3",
                "10",
                "3",
               "5"};
        stringArray = bigSorting(stringArray);
        System.out.println(stringArray);
    }

}
