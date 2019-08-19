package io.codeformaster.practice.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class MinimumDistances {
    public static void main(String args[]) {
        int[] arr = {3, 2, 1, 2, 3};
        int[] arr2 = {7, 1, 3, 4, 1, 7};

        System.out.println(minimumDistances(arr));
        System.out.println(minimumDistances(arr2));
    }

    // Complete the minimumDistances function below.
    // Comment: long code, how to optimize code? or better way.
    static int minimumDistances(int[] a) {
        List<Integer> aList = new ArrayList<>();

        for (int i=0; i<a.length; i++) {
            aList.add(a[i]);
        }

        // https://www.baeldung.com/java-remove-duplicates-from-list
        // not supported in hackerrank??
        // List<Integer> removeDuplicatedList = aList.stream().distinct().collect(Collectors.toList());

        List<Integer> removeDuplicatedList = new ArrayList<>();

        for (int i = 0; i < aList.size(); i++) {
            if (!removeDuplicatedList.contains(aList.get(i))) {
                removeDuplicatedList.add(aList.get(i));
            }
        }

        List<Integer> matchedPairAbs = new ArrayList<>();

        for (int i=0; i<removeDuplicatedList.size(); i++) {
            int onePairPos = -1;
            int twoPairPos = -1;
            int matchedCount = 0;

            for (int j=0; j<a.length; j++) {
                if (removeDuplicatedList.get(i) == a[j]) {

                    if (matchedCount == 0) {
                        onePairPos = j;
                    } else {
                        twoPairPos = j;
                    }

                    matchedCount++;

                    if (matchedCount == 2) {
                        int minusNum = onePairPos - twoPairPos;
                        int abs = Math.abs(minusNum);
                        matchedPairAbs.add(abs);
                    }
                }
            }
        }

        int denotingNum = -1;

        if (matchedPairAbs.size() > 0) {
            // ArrayList Ascending.
            Collections.sort(matchedPairAbs);
            denotingNum = matchedPairAbs.get(0);
        }

        return denotingNum;
    }
}
