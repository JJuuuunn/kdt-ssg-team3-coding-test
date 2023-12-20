package SSG1주차.백준2884.조정우;

import java.util.Scanner;

public class 백준2884 {
    public static void main(String[] args) {
        // Scanner 객체 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        // 시 분 입력 받기
        int hourEntered = sc.nextInt();
        int minuteEntered = sc.nextInt();

        // 45분 전의 시 분 계산
        int valueSubtractedMinute = minuteEntered - 45;
        if(valueSubtractedMinute < 0) {
            hourEntered--;
        }
        minuteEntered = valueSubtractedMinute < 0 ? (60 + valueSubtractedMinute) : valueSubtractedMinute;
        hourEntered = hourEntered == -1 ? 23 : hourEntered;

        // 시 분 출력
        System.out.printf("%d %d", hourEntered, minuteEntered);

        // Scanner 객체 리소스 해제
        sc.close();
    }
}
