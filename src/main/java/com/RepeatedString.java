package com;

public class RepeatedString {
    private static long repeatedChar(String s, long n){
        long count = 0;

        for (Character c : s.toCharArray()){
            if (n > 0 && c == 'a') {
                count++;
            }
            n--;
        }

        long left = n / s.length();
        n -= left * s.length();
        count += count * left;

        for (int i = 0; n > 0 ; n--, i++){
            if (s.charAt(i) == 'a') {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]){
        System.out.println(repeatedChar("a", 1000000000000L));
        //System.out.println(repeatedChar("aba", 10L));
        //System.out.println(repeatedChar("abcac", 10L));
    }
}
