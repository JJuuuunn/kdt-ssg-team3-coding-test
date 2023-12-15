package 조정우;

import java.util.Scanner;

public class 백준1330 {
    public static void main(String[] args) {
        // Scanner 객체 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        // 두 수의 대소에 따라 결과를 출력
        int valueSubtractedEach = sc.nextInt() - sc.nextInt();
        System.out.print(valueSubtractedEach > 0 ? ">" : valueSubtractedEach == 0 ? "==" : "<");

        // Scanner 객체 리소스 해제
        sc.close();
    }
}
