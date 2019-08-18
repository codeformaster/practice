package io.codeformaster.practice.hackerrank;

public class RepeatedString {
    public static void main(String args[]) {
        System.out.println(repeatedStringForSolution("aba", 10));
//        System.out.println(repeatedStringForSolution("a", 1000000000000L));
    }

    // Complete the repeatedString function below.
    // terminated due to timeout
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

    // another solution
    // for loop with char, string, stringbuffer, stringbuilder.
    static long repeatedStringForSolution(String s, long n) {
        char[] ch=s.toCharArray();
        int count=0,chLen=0,stLen=ch.length;
        long mod=(n%stLen);

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'){
                chLen++;
            }
        }

        for(int i=0;i<mod;i++){
            if(ch[i]=='a')
                count++;
        }

        System.out.println("n%stLen: " + n%stLen);
        System.out.println("n/stLen: " + n/stLen);
        System.out.println("chLen: " + chLen);
        System.out.println("count: " + count);

        return (n/stLen)*chLen+count;
    }
}
