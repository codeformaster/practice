package io.codeformaster.practice.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class HackerRankInAString {
    public static void main(String args[]) {
        System.out.println(hackerrankInString("hereiamstackerrank"));
        System.out.println(hackerrankInString("hackerworld"));
    }

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
        String result = "NO";
        String findWord = "hackerrank";

        String[] findWordArray = findWord.split("");
        ArrayList<String> compareWordList = new ArrayList<String>();
        compareWordList.addAll(Arrays.asList(s.split("")));

        int count = 0;
        Iterator<String> iterator = compareWordList.iterator();

        for (int i=0; i<findWordArray.length; i++) {
            while (iterator.hasNext()) {
                String next = iterator.next();

                if (findWordArray[i].equals(next)) {
                    iterator.remove();
                    count++;
                    break;
                }
            }

            if (count == (findWordArray.length - 1)) {
                result = "YES";
                break;
            }
        }

        return result;
    }
}
