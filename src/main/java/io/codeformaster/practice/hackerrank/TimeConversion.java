package io.codeformaster.practice.hackerrank;

public class TimeConversion {
    public static void main(String args[]) {
        System.out.println(timeConversion("06:40:03AM"));
    }

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String[] time = s.split(":");

        int hour = Integer.valueOf(time[0]);

        if (time[2].contains("PM")) {
            if (Integer.valueOf(time[0]) != 12) {
                hour += 12;
            }
        } else {
            if (Integer.valueOf(time[0]) == 12) {
                hour = 00;
            }
        }

        String convertTime = String.format("%02d",hour) + ":" + time[1] + ":" + time[2].substring(0,2);

        return convertTime;
    }
}
