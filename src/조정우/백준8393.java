package 조정우;

import java.util.Scanner;
import java.util.stream.IntStream;

public class 백준8393 {
    public static void main(String[] args) {
        // Scanner 객체 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        // IntStream 을 이용하여 합 출력
        System.out.print(IntStream.rangeClosed(1, sc.nextInt()).sum());

        // Scanner 객체 리소스 해제
        sc.close();
    }
}
