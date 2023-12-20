package SSG1주차.백준10952.조정우;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 백준10952 {
    public static void main(String[] args) {
        // Scanner 객체 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        // 결과 값을 저장해줄 List 컬렉션 선언
        List<Integer> listResult = new ArrayList<>();

        // while 문을 통해 반복문 순회
        while(true) {

            // 정수 2개 입력 받기
            int numberEnteredA = sc.nextInt();
            int numberEnteredB = sc.nextInt();

            // 종료 조건 : 입력 받은 정수 2개가 모두 0인 경우
            if(numberEnteredA == 0 && numberEnteredB == 0) {
                break;
            }

            // 두 정수의 합을 List 컬렉션에 저장
            listResult.add(numberEnteredA + numberEnteredB);
        }

        // IntStream 을 활용하여 결과 값들이 저장된 List 컬렉션의 요소들을 출력
        int lenListResult = listResult.size();
        IntStream.range(0, lenListResult).forEach(i -> {
            int el = listResult.get(i);
            System.out.print(el);

            // 마지막 요소에서는 띄어쓰기 안 하도록
            if(i < lenListResult - 1) {
                System.out.println();
            }
        });

        // Scanner 객체 리소스 해제
        sc.close();
    }
}
