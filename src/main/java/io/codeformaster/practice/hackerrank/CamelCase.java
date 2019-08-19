package io.codeformaster.practice.hackerrank;

public class CamelCase {
    public static void main(String args[]) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    // Complete the camelcase function below.
    static int camelcase(String s) {
        int count = 1;

        char[] sArray = s.toCharArray();

        for (int i=0; i<sArray.length; i++) {
            int asciiNum = sArray[i];

            if (asciiNum >= 65 && asciiNum <= 90) {
                count++;
            }
        }

        return count;
    }

}
