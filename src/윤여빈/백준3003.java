package 윤여빈;

import java.util.Scanner;

public class 백준3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] realChess = {1, 1, 2, 2, 2, 8};
        int[] resultChess = new int[6];
        int result = 0;
        for (int i = 0; i < 6; i++) {
            int donghyeokChess = sc.nextInt();
            resultChess[i] = realChess[i]-donghyeokChess;

        }
        for (int i = 0; i < 6; i++) {
            System.out.print(resultChess[i]+" ");

        }
    }
}
