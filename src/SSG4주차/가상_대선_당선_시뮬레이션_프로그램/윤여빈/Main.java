package SSG4주차.가상_대선_당선_시뮬레이션_프로그램.윤여빈;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        double totalVotes = 10000;
        int[] candidates = new int[4];
        String[] candiName = {"이재묭", "융석열", "상심정", "안찰스"};
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            candidates[(random.nextInt(4) + 0)] += 1;
        }
        int max = 0;
        int maxman = 0;
        for (int i = 0; i < 4; i++) {
            System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", i + 1, candiName[i], candidates[i] / totalVotes * 100.0, candidates[i]);
            if (candidates[i] > max) {
                max = candidates[i];
                maxman = i;
            }
        }

        System.out.println("[투표결과] 당선인: " + candiName[maxman]);

    }
}
