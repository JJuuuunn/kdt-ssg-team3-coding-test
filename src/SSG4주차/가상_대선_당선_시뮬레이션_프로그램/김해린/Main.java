package SSG4주차.가상_대선_당선_시뮬레이션_프로그램.김해린;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Main {
    static Random rd = new Random();
    static HashMap<Integer, String> candidate = new HashMap<>(); //후보자를 넣을 map
    static final int TOTALVOTE = 100000; //총 투표수 --> 변하지 않는 값이기 때문에 상수로 선언
    public static void main(String[] args) {
        int[] presidentArr = new int[5]; //각 후보자의 투표수 배열 (기호 1번부터 시작이라 길이 5로 지정)
        int vote = 0;
        candidateInit();

        for(int i = 0; i < TOTALVOTE; i++) {
            vote = rd.nextInt(4)+1; //1~4 사이의 난수 생성
            presidentArr[vote]++; //생성된 난수를 후보자 배열의 인덱스로 넣고 해당 하는 위치의 값(투표수)을 1증가 해줌. 즉, 생성한 난수에 해당하는 후보자의 투표수를 1증가 시키는 것
        }

        printVoteResult(presidentArr, vote); //vote --> 마지막으로 생성된 난수 매개변수로 보냄
    }

    public static void candidateInit() { //후보자 초기화 함수
        candidate.put(1, "이재명");
        candidate.put(2, "윤석열");
        candidate.put(3, "심상정");
        candidate.put(4, "안철수");
    }

    public static void printVoteResult(int[] arr, int v){
        System.out.printf("[투표진행률]: %.2f%%, %d명 투표 => %s\n", TOTALVOTE * 0.001, TOTALVOTE, candidate.get(v));
        int presidentElect = Arrays.stream(arr).max().getAsInt(); //투표수 중 최대값 구하기
        int presidentElectIndex = 0; //투표수가 최대값인 후보자의 위치를 넣기 위한 변수

        for(int i = 1; i < arr.length; i++) {
            System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", i, candidate.get(i), arr[i] * 0.001, arr[i]); //각 후보자의 투표율 출력
            if(arr[i] == presidentElect) presidentElectIndex = i; //후보자의 투표수를 나타내는 배열에서 값이 투표수 최대값과 같을 때 해당 위치를 얻음
        }


        System.out.printf("[투표결과] 당선인: %s", candidate.get(presidentElectIndex)); //최종 당선인의 이름을 출력
    }
}
