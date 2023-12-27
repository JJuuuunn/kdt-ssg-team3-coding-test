package SSG3주차.가상_대선_당선_시뮬레이션_프로그램.윤여빈;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int vote;
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        for (int i = 0; i < 10000; i++) {

            Random random = new Random();
            vote = (random.nextInt(4)+1);
            if (vote == 1) {
                c1 += 1;
            } else if (vote == 2) {
                c2 += 1;
            } else if (vote == 3) {
                c3 += 1;
            } else if (vote == 4) {
                c4 += 1;
            }
        }
        double voteC1 = (c1 / 100.00);
        double voteC2 = (c2 / 100.00);
        double voteC3 = (c3 / 100.00);
        double voteC4 = (c4 / 100.00);
        System.out.printf("[기호:1] 이재명: %.2f, (투표수: %d)\n", voteC1, c1);
        System.out.printf("[기호:2] 윤석열: %.2f, (투표수: %d)\n", voteC2, c2);
        System.out.printf("[기호:3] 심상정: %.2f, (투표수: %d)\n", voteC3, c3);
        System.out.printf("[기호:4] 안철수: %.2f, (투표수: %d)\n", voteC4, c4);
        int max = 0;
        int[] array = {c1, c2, c3, c4};
        for (int i = 0; i < 4; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        if (max == c1) {
            System.out.println("[투표결과] 당선인: 이재명");
        } else if (max == c2) {
            System.out.println("[투표결과] 당선인: 윤석열");
        } else if (max == c3) {
            System.out.println("[투표결과] 당선인: 심상정");
        } else if (max == c4) {
            System.out.println("[투표결과] 당선인: 안철수");
        }
    }
}
