package io.codeformaster.practice.hackerrank;

import java.util.Arrays;

public class MarkAndToys {
    public static void main(String args[]) {

    }

    static int maximumToys(int[] prices, int k) {

        return k;
    }

    static int maximumToysForSolution(int[] prices, int k) {
        int numberOfItems = 0;
        int total_bill = 0;

        if (k > 0) {

            // first sort the arrays
            Arrays.sort(prices);

            for (int i = 0; i < prices.length; i++) {
                int single_toy_price = prices[i];
                if (k > single_toy_price) {
                    numberOfItems = numberOfItems + 1;
                    total_bill = total_bill + single_toy_price;

                    // decrement k
                    k = k - single_toy_price;

                }
            }
        }
        return numberOfItems;
    }
}
