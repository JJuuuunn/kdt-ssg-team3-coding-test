package SSG2주차.백준2501.윤여빈;

import java.util.Scanner;

public class 백준2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int result = 0;
        int[] divisor = new int[n];
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                divisor[i] = (i + 1);
                count++;
                if (count == k) {
                    result += i + 1;
                }
            }
        }
        System.out.println(result);
    }
    }

