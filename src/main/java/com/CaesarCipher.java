package com;

import java.util.Scanner;

public class CaesarCipher {

    private static String caesarCipher(String input, Integer sum) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
                int charAscii = input.charAt(i) + sum;
                while (charAscii > 90) {
                    charAscii = 64 + (charAscii - 90);
                }
                result.append((char) charAscii);
            } else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
                int charAscii = input.charAt(i) + sum;
                while (charAscii > 122) {
                    charAscii = 96 + (charAscii - 122);
                }
                result.append((char) charAscii);
            } else {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();*/
        System.out.println(caesarCipher("6DWV95HzxTCHP85dvv3NY2crzt1aO8j6g2zSDvFUiJj6XWDlZvNNr", 87));
    }
}
