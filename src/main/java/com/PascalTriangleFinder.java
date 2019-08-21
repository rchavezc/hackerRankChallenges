package com;

public class PascalTriangleFinder {
    public static void main(String[] args) {
        System.out.println(getNumber(8 ,17));
    }

    public static int getNumber(int positionX, int positionY){
        if (positionX > positionY || positionX < 1 || positionY < 1){
            return 0;
        } else if (positionX == 1 || positionX == positionY) {
            return 1;
        }

        return getNumber(positionX - 1, positionY - 1) + getNumber(positionX, positionY - 1);
    }
}
