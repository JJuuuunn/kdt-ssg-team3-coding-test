package SSG4주차.가상_대선_당선_시뮬레이션_프로그램.윤여빈;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double totalVotes = 10000;  //총투표수 변수
        int[] candidates = new int[4]; //후보자(candidates)별 득표수 배열
        String[] candiName = {"이재묭", "융석열", "상심정", "안찰스"};
        Random random = new Random();

        //후보자별 득표수 배열의 인덱스에 랜덤함수를 넣어주었고, 한번 뽑힐(?)때마다 해당 배열 값에 +=1씩 넣어주었다.
        for (int i = 0; i < 10000; i++) {
            candidates[(random.nextInt(4) + 0)] += 1;
        }

        //최대값을 뽑기 위해 max 변수와
        //최대값일때의 배열 인덱스를 넣어주려고 maxman 변수를 선언해주었다.
        int max = 0;
        int maxman = 0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", i + 1, candiName[i], candidates[i] / totalVotes * 100.0, candidates[i]);
            if (candidates[i] > max) {
                max = candidates[i];
                maxman = i;
            }
        }

        // 이제 maxman은 candidates[] 가 최대값일때의 인덱스이다.
        // 그걸 후보자 이름인 candiName[]에 인덱스로 넣어주면 조건문을 안걸구도 바로 출력할 수 있다.
        System.out.println("[투표결과] 당선인: " + candiName[maxman]);

    }
}
