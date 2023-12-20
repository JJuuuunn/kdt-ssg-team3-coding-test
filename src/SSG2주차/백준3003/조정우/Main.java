package SSG2주차.백준3003.조정우;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int[] FORM_CHESS = {1, 1, 2, 2, 2, 8};
        final int LEN_FORM_CHESS = FORM_CHESS.length;
        Scanner sc = new Scanner(System.in);
        int[] formChessCurrent = new int[LEN_FORM_CHESS];
        for (int idxSequenceChess = 0; idxSequenceChess < LEN_FORM_CHESS; idxSequenceChess++) {
            formChessCurrent[idxSequenceChess] = sc.nextInt();
        }
        for (int idxSequenceChess = 0; idxSequenceChess < LEN_FORM_CHESS; idxSequenceChess++) {
            System.out.printf("%d", FORM_CHESS[idxSequenceChess] - formChessCurrent[idxSequenceChess]);
            if (idxSequenceChess < LEN_FORM_CHESS - 1) {
                System.out.print(" ");
            }
        }
        sc.close();
    }
}
