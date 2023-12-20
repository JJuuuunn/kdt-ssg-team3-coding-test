package 윤여빈;

import java.util.Scanner;

public class 백준10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palindrome = sc.next();
        int palleng = palindrome.length();
        boolean bool=false;
        int result=0;
        for (int i = 0; i < palleng / 2; i++) {
            if (palleng % 2 == 0) {
                if (palindrome.charAt(i) == palindrome.charAt(palleng - i-1)) {
                    result = 1;
                } else {
                    result = 0;
                }

            } else {
                if (palindrome.charAt(i) == palindrome.charAt(palleng - i-1)) {
                    result = 1;
                } else {
                    result = 0;
                }
            }
        }
        System.out.println(result);

    }
}
