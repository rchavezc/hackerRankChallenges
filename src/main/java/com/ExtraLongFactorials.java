package com;

import java.math.BigInteger;

public class ExtraLongFactorials {

    private static BigInteger factorial(BigInteger num){
        if (num.equals(BigInteger.valueOf(1)))
            return BigInteger.valueOf(1);
        return num.multiply(factorial(num.add(BigInteger.valueOf(-1))));
    }

    public static void main( String[] args ) {
        System.out.println(factorial(BigInteger.valueOf(25)));
    }
}
