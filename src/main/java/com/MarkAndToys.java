package com;

import java.util.Arrays;

public class MarkAndToys {

    static int maxiumumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int sum = 0;

        for (int i = 0; i < prices.length; i++){
            if (sum + prices[i] <= k) {
                sum += prices[i];
            } else {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] input = {1,12,5,111,200,1000,10};
        System.out.println(maxiumumToys(input, 50));
    }
}
