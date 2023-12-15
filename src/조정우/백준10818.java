package 조정우;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class 백준10818 {
    public static void main(String[] args) {
        // Scanner 객체 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        // 입력 받을 개수 입력 받기
        int limitMaxLoop = Integer.parseInt(sc.nextLine());

        // IntStream 내에서 동시성 문제를 해결해주는 AtomicInteger Wrapping 클래스를 활용하여
        // 최소값 최대값을 추적하는 변수 선언
        AtomicInteger trackerMin = new AtomicInteger(-1);
        AtomicInteger trackerMax = new AtomicInteger(-1);

        // 개수에 따라 IntStream 을 활용하여 정수들을 입력받고 최소값과 최대값을 저장
        IntStream.range(0, limitMaxLoop).forEach(i -> {
            int numberEntered = sc.nextInt();
            int minCurrent = trackerMin.get();
            int maxCurrent = trackerMax.get();
            trackerMin.set(minCurrent == -1 ? numberEntered : Math.min(minCurrent, numberEntered));
            trackerMax.set(maxCurrent == -1 ? numberEntered : Math.max(maxCurrent, numberEntered));
        });

        // 저장된 최소값과 최대값을 출력
        System.out.printf("%d %d", trackerMin.get(), trackerMax.get());

        // Scanner 객체 리소스 해제
        sc.close();
    }
}
