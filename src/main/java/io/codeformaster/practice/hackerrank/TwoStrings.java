package io.codeformaster.practice.hackerrank;

import java.util.*;

public class TwoStrings {
    public static void main(String args[]) {
        System.out.println(twoStrings("hello", "world"));
        System.out.println(twoStrings("hi", "world"));
        System.out.println(twoStrings("wouldyoulikefries", "abcabcabcabcabcabc"));
        System.out.println(twoStrings("hackerrankcommunity", "cdecdecdecde"));
        System.out.println(twoStrings("jackandjill", "wentupthehill"));
        System.out.println(twoStrings("writetoyourparents", "fghmqzldbc"));
    }

    static String twoStrings(String s1, String s2) {
        String message = "NO";

        Set<Character> s1Chars = new HashSet<>();

        for (char c : s1.toCharArray()) {
            s1Chars.add(c);
        }

        for (char c: s2.toCharArray()) {
            if (s1Chars.contains(c)) {
                return "YES";
            }
        }

        // try 1
//        String message = "NO";
//
//        String[] splitS1 = s1.split("");
//        String[] splitS2 = s2.split("");
//
//        Collection splitArrayList1 = new ArrayList(Arrays.asList(splitS1));
//        Collection splitArrayList2 = new ArrayList(Arrays.asList(splitS2));
//
//        splitArrayList1.retainAll(splitArrayList2);
//
//        if (splitArrayList1.size() > 0) {
//            message = "YES";
//        }

        // try 2
//        int startNum = 0;
//        int lastNum = 0;
//        String[] startNumArray;
//        String[] endNumArray;
//
//        if (splitS1.length > splitS2.length) {
//            startNum = splitS2.length;
//            lastNum = splitS1.length;
//
//            startNumArray = splitS2;
//            endNumArray = splitS1;
//        } else {
//            startNum = splitS1.length;
//            lastNum = splitS2.length;
//
//            startNumArray = splitS1;
//            endNumArray = splitS2;
//        }
//
//        for (int i=0; i<startNum; i++) {
//            for (int j=0; j<lastNum; j++) {
//                if (startNumArray[i].equals(endNumArray[j])) {
//                    message = "YES";
//                    break;
//                }
//            }
//        }

        return message;
    }
}
