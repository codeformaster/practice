package io.codeformaster.practice.hackerrank;

public class CaesarCipher {
    public static void main(String args[]) {
        System.out.println(encrypt("www.abc.xy", 87));
//        System.out.println(caesarCipher("abcdefghijklmnopqrstuvwxyz",3));
    }

    static String caesarCipher(String s, int k) {

        return "";
    }

    static String caesarCipherForSolution(String s, int k) {
        StringBuffer result = new StringBuffer();

        String[] sArray = s.split("");

        for (int i=0; i<sArray.length; i++) {
            String currentString = sArray[i];

            int currentAsciiCode = (int) currentString.charAt(0);

            if (currentAsciiCode > 64 && currentAsciiCode < 91) {
                currentAsciiCode += k;

                if (currentAsciiCode > 90) {
                    currentAsciiCode = currentString.charAt(0) - 26;
                    currentAsciiCode += k;
                }

                currentString = Character.toString((char) currentAsciiCode);
            } else if (currentAsciiCode > 96 && currentAsciiCode < 123) {
                currentAsciiCode += k;

                if (currentAsciiCode > 122) {
                    currentAsciiCode = currentString.charAt(0) - 26;
                    currentAsciiCode += k;
                }

                currentString = Character.toString((char) currentAsciiCode);
            }

            result.append(currentString);
        }

        return result.toString();
    }

    static String encrypt(String s, int k)
    {
        StringBuffer result= new StringBuffer();

        for (int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if (ch > 64 && ch < 91)
            {
                ch = (char)((((int)s.charAt(i) + k) - 65) % 26 + 65);
            }
            else if (ch > 96 && ch < 123)
            {
                ch = (char)((((int)s.charAt(i) + k) - 97) % 26 + 97);
            }

            result.append(ch);
        }
        return result.toString();
    }
}
