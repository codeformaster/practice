package io.codeformaster.practice.hackerrank;

public class AlternatingCharacters {
    public static void main(String args[]) {
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("BABABA"));
        System.out.println(alternatingCharacters("AAABBB"));
    }

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        char[] sCharArray = s.toCharArray();
        int count = 0;

        for (int i=0; i<sCharArray.length; i++) {

            if (i == sCharArray.length - 1) {
                break;
            } else {
                char prev = sCharArray[i];
                char next = sCharArray[i+1];

                if (prev == next) {
                    count++;
                }
            }
        }

        return count;
    }
}
