package com;

public class FindThePoint {

    static int[] findPoint(int px, int py, int qx, int qy) {
        int[] a = new int[2];
        a[0] = qx + (qx - px);
        a[1] = qy + (qy - py);
        return a;
    }

    public static void main(String[] args) {
        System.out.println(findPoint(0, 0, 1, 1));
        System.out.println(findPoint(1, 1, 2, 2));
    }
}
