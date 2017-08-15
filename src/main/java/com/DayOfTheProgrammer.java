package com;

import java.util.Calendar;

public class DayOfTheProgrammer {

    static String solve(int year){
        if (year == 1918)
            return "26.09.1918";

        int[] normalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
        int sum = 0, numMonth = 0;

        if ((year > 1917 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) || (year <= 1917 && year % 4 == 0))
            normalYear[1] = 29;

        for (int month : normalYear){
            sum += month;
            numMonth++;
            if (sum > 256) {
                sum -= month;
                break;
            }
        }

        int day = 256 - sum;

        return String.format("%d.%02d.%s", day,numMonth, year);
    }

    private static boolean isInteger(double num){
        try{
            if (num==(int)num){
                return true;
            }
        }catch(Exception e){
            System.out.println("not number");
        }
        return false;
    }

    public static void main( String[] args ) {
        System.out.println(solve(2000));
    }
}
