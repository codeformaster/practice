package io.codeformaster.practice;

public class RepeatedString {
    public static void main(String args[]) {
//        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("a", 1000000000000L));
    }

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] sCharArray = s.toCharArray();

        long allCount = (long) n / sCharArray.length;
        long remainCount = (long) n % sCharArray.length;

        if (allCount > 0) {
            for (int i=0; i<allCount; i++) {
                stringBuilder.append(s);
            }
        }

        if (remainCount > 0) {
            for (int i=0; i<remainCount; i++) {
                stringBuilder.append(sCharArray[i]);
            }
        }

        System.out.println(stringBuilder.toString());

        String[] finalString = stringBuilder.toString().split("");

        int matchedCount = 0;

        for (int i=0; i<finalString.length; i++) {
            if (finalString[i].equals("a")) {
                matchedCount++;
            }
        }

        return matchedCount;
    }
}
