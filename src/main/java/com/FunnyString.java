package com;

import java.util.HashSet;
import java.util.Set;

public class FunnyString {

    static String funnyString(String s){
        for(int a=0, b = s.length() - 1; a < s.length() - 1; a++, b--){
            if (Math.abs((int)s.charAt(a + 1) - (int)s.charAt(a)) != Math.abs((int)s.charAt(b - 1) - (int)s.charAt(b)))
                return "Not Funny";
        }
        return "Funny";
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }*/

        System.out.println(funnyString("bcxz"));
    }
}
