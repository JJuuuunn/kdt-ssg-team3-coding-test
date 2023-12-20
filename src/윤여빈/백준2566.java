package 윤여빈;

import java.util.Scanner;

public class 백준2566 {
    public static void main(String[] args) {
        int[][] number = new int[9][9];
        Scanner sc = new Scanner(System.in);
        int max =0;
        int maxi=0;
        int maxj=0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = sc.nextInt();
                number[i][j] = num;
                if (number[i][j] > max) {
                    max = number[i][j];
                    maxi = i;
                    maxj = j;
                }
            }

        }
        System.out.println(max);
        System.out.println((maxi+1)+" "+(maxj+1));

    }
}
