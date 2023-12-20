package SSG2주차.백준3003.김소진;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] mychess = new int[chess.length];

        for (int i = 0; i < chess.length; i++) {
            int myPeace = sc.nextInt();
            mychess[i] = myPeace;
        }

        for (int i = 0; i < mychess.length; i++) {
            chess[i] -= mychess[i];
            System.out.print(chess[i] + " ");
        }
    }
}

