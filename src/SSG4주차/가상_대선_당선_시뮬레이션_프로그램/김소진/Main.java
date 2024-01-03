package SSG4주차.가상_대선_당선_시뮬레이션_프로그램.김소진;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] candidate = {"이재명", "윤석열", "심상정", "안철수"};
        int[] votes = new int[4];

        final int MAX_VOTES = 10000; //상수 선언
        //표 입력받기
        int j = 1;
        while (j <= MAX_VOTES) {
            int vote = (int) (Math.random() * 4 + 1);
            switch (vote) {
                case 1 -> votes[0] += 1;
                case 2 -> votes[1] += 1;
                case 3 -> votes[2] += 1;
                case 4 -> votes[3] += 1;

            }
            j++;
        }

//        for (int i = 1; i <= 10000; i++) {
//            //random함수 투표
//            int vote = (int)(Math.random()*4+1);
//            if(vote == 1){
//                votes[0] += 1;
//            } else if (vote == 2) {
//                votes[1] += 1;
//            } else if (vote == 3) {
//                votes[2] += 1;
//            } else if (vote == 4) {
//                votes[3] += 1;
//            }
//        }}

        int max = 0;
        int index = 0;

        //출력for문
        for (int i = 0; i < candidate.length; i++) {
            //투표율
            double ratio = (double) votes[i] / (MAX_VOTES/100); //비율 유지
            System.out.printf("[기호 : %d] %s: %.2f%%, (투표수: %d)", (i + 1), candidate[i], ratio, votes[i]);
            System.out.println();
            //당선인
            if(votes[i] > max){
                max = votes[i];
                index = i;
            }

            //Stream은...
            //max = Arrays.stream(votes).max().getAsInt();
        }

        System.out.printf("[투표결과] 당선인: %s", candidate[index]);
    }
}
