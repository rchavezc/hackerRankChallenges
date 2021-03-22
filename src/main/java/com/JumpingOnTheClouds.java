package com;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        int index = 0;
        int jumps = 0;

        while (true) {
            if (index + 2 <= c.length - 1 && c[index + 2] == 0) {
                jumps++;
                index += 2;
            } else if (index + 1 <= c.length -1 && c[index + 1] == 0) {
                index++;
                jumps++;
            } else if (index != c.length - 1){
                jumps++;
                break;
            } else {
                break;
            }
        }
        return jumps;
    }

    public static void main(String args[]){
        //int[] array = {0, 0, 1, 0, 0, 1, 0};
        //int[] array = {0, 0, 0, 1, 0, 0};
        //int[] array = {0, 0, 0, 0, 1, 0};
        int[] array = {0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0};
        System.out.println(jumpingOnClouds(array));
    }
}
