package SSG3주차.가상_대선_당선_시뮬레이션_프로그램.윤여빈;

import java.util.Random;

public class 대선시뮬레이션 {
    public static void main(String[] args) {
        String[] candidates = {"이재명", "윤석열", "심상정", "안철수"};
        int[] votes = new int[4];
        int totalVotes = 10000;
        Random rand = new Random();
        int count = 0;

        for(int i = 0; i < totalVotes; ++i) {
            int vote = rand.nextInt(4);
            votes[vote]++;
            count++;
        }

        System.out.println("[투표진행율]: "+(count/100.00)+"%, "+ count+"명 투표");
        for(int i = 0; i < votes.length; i++) {
            double votePercentage = (double)votes[i] / totalVotes * 100;
            System.out.println("[기호:"+(i+1)+"] " + candidates[i] + ": " + String.format("%.2f", votePercentage) + "%, "+ "(투표수: "+votes[i]+")");
        }
        int max = 0;
        for (int i = 0; i < 4; i++) {
            if (votes[i] > max) {
                max = votes[i];
            }
        }
        if (max == votes[0]) {
            System.out.println("[투표결과] 당선인: 이재명");
        } else if (max == votes[1]) {
            System.out.println("[투표결과] 당선인: 윤석열");
        } else if (max == votes[2]) {
            System.out.println("[투표결과] 당선인: 심상정");
        } else if (max == votes[3]) {
            System.out.println("[투표결과] 당선인: 안철수");
        }

    }
}
