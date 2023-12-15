package 김소진;

import java.util.Scanner;

public class 백준10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            //A와 B가 하나라도 0일 경우 while 탈출
            if (A <= 0 || B <= 0) {
                break;
            }
            System.out.println(A + B);
        }
    }
}
