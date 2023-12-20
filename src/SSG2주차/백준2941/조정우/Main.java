package SSG2주차.백준2941.조정우;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final List<String> listAlphabets = List.of(
                "dz=",
                "c=",
                "c-",
                "d-",
                "lj",
                "nj",
                "s=",
                "z="
        );
        String stringRaw = sc.nextLine();
        int counterMatched = 0;
        for (String alphabetCurrent : listAlphabets) {
            while (true) {
                int lenStringPrevReplaced = stringRaw.length();
                stringRaw = stringRaw.replaceFirst(alphabetCurrent, "A");
                if (stringRaw.length() != lenStringPrevReplaced) {
                    counterMatched++;
                } else {
                    break;
                }
            }
        }
        stringRaw = stringRaw.replaceAll("A", "");
        System.out.print(counterMatched + stringRaw.length());
        sc.close();
    }
}