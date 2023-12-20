package SSG2주차.백준2566.김해린;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] intArr = new int[9][9];
        int max = -1; int row = 0; int col = 0;
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                intArr[i][j] = in.nextInt();
                if(max < intArr[i][j]) {
                    max = intArr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", row+1, col+1);

    }

}
