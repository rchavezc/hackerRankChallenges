package com;

public class SuperReducedString {

    static String super_reduced_string(String s){
        int length = s.length();
        int i = 0;
        while (i < length - 1){
            if (s.charAt(i) == s.charAt(i + 1)) {
                if ((i + 2)  < length)
                    s = s.substring(0, i) + s.substring(i + 2, s.length());
                else
                    s = s.substring(0, i);
                i = 0;
                length = s.length();
            } else
                i++;
        }
        return s.isEmpty() ? "Empty String" : s;
    }

    public static void main( String[] args ) {
        System.out.println(super_reduced_string("aa"));
    }
}
