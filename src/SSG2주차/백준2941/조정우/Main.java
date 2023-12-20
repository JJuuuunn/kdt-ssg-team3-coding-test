package SSG2주차.백준2941.조정우;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] alphabets = {
                "c=",
                "c-",
                "dz=",
                "d-",
                "lj",
                "nj",
                "s=",
                "z="
        };
        final int lenAlphabets = alphabets.length;
        String stringRaw = sc.nextLine();
        int counterAnswer = 0;
        for (int idxAlphabets = 0; idxAlphabets < lenAlphabets; idxAlphabets++) {
            String alphabetCurrent = alphabets[idxAlphabets];
            if (stringRaw.contains(alphabetCurrent)) {
                counterAnswer++;
            }
        }
        for (int idxAlphabets = 0; idxAlphabets < lenAlphabets; idxAlphabets++) {
            stringRaw = stringRaw.replace(alphabets[idxAlphabets], "");
        }
        System.out.print(counterAnswer + stringRaw.length());
        sc.close();
    }
}