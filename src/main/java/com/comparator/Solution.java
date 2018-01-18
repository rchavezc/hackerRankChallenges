package com.comparator;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        /*Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }*/

        Player[] player = new Player[10];
        Checker checker = new Checker();

        player[0] = new Player("ab", 6);
        player[1] = new Player("ade", 5);
        player[2] = new Player("c", 5);
        player[3] = new Player("bda",2);
        player[4] = new Player("cab",2);
        player[5] = new Player("db",2);
        player[6] = new Player("a",1);
        player[7] = new Player("cbb", 1);
        player[8] = new Player("bcc", 0);
        player[9] = new Player("dee",0);

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
