package SSG4주차.가상_대선_당선_시뮬레이션_프로그램.김해린;

import java.util.*;

public class Main {
    static Random rd = new Random();
    static List<String> candidate = new ArrayList<>();
    static Map<Integer, Integer> candidateVote = new HashMap<>();

    static final int TOTALVOTE = 100000; //총 투표수 --> 변하지 않는 값이기 때문에 상수로 선언
    public static void main(String[] args) {
        int vote = 0;
        double totalVoteRate = 0;
        candidateInit();

        for(int i = 0; i < TOTALVOTE; i++) {
            vote = rd.nextInt(4); //0~3 사이의 난수 생성
            candidateVote.put(vote, candidateVote.getOrDefault(vote, 0)+1);
            totalVoteRate = (double) i / TOTALVOTE * 100;
        }

        printVoteResult(candidateVote, vote, totalVoteRate);
    }

    public static void candidateInit() { //후보자 초기화 함수
        candidate.add("이재명");
        candidate.add("윤석열");
        candidate.add("심상정");
        candidate.add("안철수");
    }

    public static void printVoteResult(Map<Integer, Integer> candidateMap, int v, double totalVoteRate){
        System.out.printf("[투표진행률]: %.2f%%, %d명 투표 => %s\n", totalVoteRate, TOTALVOTE, candidate.get(v));
        int presidentMax = Collections.max(candidateMap.values());
        int presidentMaxIndex = 0; //투표수가 최대값인 후보자의 위치를 넣기 위한 변수

        for(int i = 0; i < candidateMap.size(); i++) {
            System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", i+1, candidate.get(i), (double)candidateMap.get(i) / TOTALVOTE * 100, candidateMap.get(i)); //각 후보자의 투표율 출력
            if(candidateMap.get(i) == presidentMax) presidentMaxIndex = i;
        }

        System.out.printf("[투표결과] 당선인: %s", candidate.get(presidentMaxIndex)); //최종 당선인의 이름을 출력
    }

}
