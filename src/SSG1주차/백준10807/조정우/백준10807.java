package SSG1주차.백준10807.조정우;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 백준10807 {
    public static void main(String[] args) {
        // Scanner 객체 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        // 입력 받을 정수의 개수 입력 받기
        int limitMaxRange = Integer.parseInt(sc.nextLine());

        // 위에서 입력 받은 정수의 개수만큼 정수 입력 받기
        List<Integer> listInput = new ArrayList<>();
        IntStream.range(0, limitMaxRange).forEach(i -> {
            listInput.add(sc.nextInt());
        });

        // 개수를 셀 정수 입력 받기
        int valueFiltered = sc.nextInt();

        // 입력 받은 정수의 개수를 Collection stream 활용하여 출력
        System.out.print(listInput.stream().filter(el -> el == valueFiltered).count());

        // Scanner 객체 리소스 해제
        sc.close();
    }
}
