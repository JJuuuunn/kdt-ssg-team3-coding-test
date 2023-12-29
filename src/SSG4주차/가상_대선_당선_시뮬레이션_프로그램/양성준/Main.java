package SSG4주차.가상_대선_당선_시뮬레이션_프로그램.양성준;

import java.util.*;

public class Main {
    static final int TOTAL_VOTE = 100000;
    static Map<Integer, Integer> map = new HashMap<>(); // 선거 투표수 넣기 위한 통
    static List<String> candidate = new ArrayList<>(); // 후보자 리스트

    public static void main(String[] args) {
        createCandidate(candidate); // 후보자 생성

        int i = 0; // 투표 수
        double totalRate = 0f; // 투표 진행률
        int vote = 0; // 마지막 투표자를 찾기 위해 선언

        Random rm = new Random();
        for (i = 1; i <= TOTAL_VOTE; i++) {
            vote = rm.nextInt(candidate.size());
            map.put(vote, map.getOrDefault(vote, 0) + 1);
            totalRate = (double) i / TOTAL_VOTE * 100;
        }

        print(i, totalRate, vote); // 출력하는
    }

    private static void print(int i, double totalRate, int vote) {
        System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => %s\n", totalRate, i, candidate.get(vote));
        for (int j = 0; j < candidate.size(); j++) {
            double rate = (double) map.get(j) / TOTAL_VOTE * 100; // 후보자 별 투표율
            System.out.printf("[기호:%d] %s: %02.02f%%, (투표수: %d)\n", j + 1, candidate.get(j), rate, map.get(j));
        }

        String elected = candidate.get(Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey());// 최대값 Value로 Key값 찾기
        System.out.printf("[투표결과] 당선인: %s", elected);
    }

    private static void createCandidate(List<String> candidate) {
        candidate.add("이재명");
        candidate.add("윤석열");
        candidate.add("심성정");
        candidate.add("안철수");
    }
}

