package io.codeformaster.practice.hackerrank;

import java.util.ArrayList;

public class EqualStacks {
    public static void main(String args[]) {
        int[] h1 = {3, 2, 1, 1, 1};
        int[] h2 = {4, 3, 2};
        int[] h3 = {1, 1, 4, 1};

        System.out.println(equalStacks(h1, h2, h3));
    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        ArrayList<Integer> h1ArrayList = new ArrayList<>();
        ArrayList<Integer> h2ArrayList = new ArrayList<>();
        ArrayList<Integer> h3ArrayList = new ArrayList<>();

        for (int i=0; i<h1.length; i++) {
            int sum = 0;
            int currentPos = 0;

            for (int j=h1.length-1; j<0; j--) {
                sum += h1[j];
            }

            currentPos += h1[i];
            sum -= currentPos;

            h1ArrayList.add(sum);
        }

        // h1ArrayList
        // {5, 3, 2, 1, 0}

        // h2ArrayList
        // {5, 2, 0}

        // h3ArrayList
        // {6, 5, 1, 0}

        return 0;
    }
}
