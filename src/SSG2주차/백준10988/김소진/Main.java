package SSG2주차.백준10988.김소진;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 1;
        String first = sc.next();
        for (int i = 0; i < first.length() / 2; i++) {
            if (!(first.charAt(i) == first.charAt(first.length() - (i + 1)))) {
                result = 0;
            }
        }
        System.out.println(result);
    }
}
