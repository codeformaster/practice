package io.codeformaster.practice.hackerrank;

public class LeftRotation {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 4;

        System.out.println(rotLeft(a, d));
    }

    static int[] rotLeft(int[] a, int d) {

        return a;
    }

    static int[] rotLeftForSolution(int[] a, int d) {
        int len = a.length;

        int[] ordenado = new int[len];

        for(int i=0;i<len;i++){

            int dez = len+i-d;

            if(dez>=len){

                dez-=len;

            }

            ordenado[dez]=a[i];

        }

        return ordenado;
    }
}
