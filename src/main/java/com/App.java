package com;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int[] grades = {38,12,67};
        int[] result = solve(grades);
        for (int grade : result){
            System.out.println(grade);
        }
    }

    static int[] solve(int[] grades){
        int[] result = new int[grades.length];
        int a = 0;
        for(int grade : grades){
            if (grade < 38)
                result[a++] = grade;
            else {
                for (int next5 = grade;;next5++){
                    if (next5 % 5 == 0){
                        if (next5 - grade < 3) {
                            result[a++] = next5;
                            break;
                        }
                        else {
                            result[a++] = grade;
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }
}
