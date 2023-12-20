package SSG2주차.백준10988.김해린;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String str = in.next();
        int result = 1;

        for (int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                result = 0;
            }
        }

        System.out.println(result);

    }
}
