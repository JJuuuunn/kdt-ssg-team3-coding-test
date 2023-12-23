package SSG2주차.백준2566.김소진;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numArray = new int[9][9];
        int max = 0;
        int indexI = 0;
        int indexJ = 0;
        for (int i = 0; i < numArray.length; i++) {
            for (int j = 0; j < numArray[i].length; j++) {
                numArray[i][j] = sc.nextInt();
                if (numArray[i][j] > max) {
                    max = numArray[i][j];
                    indexI = i;
                    indexJ = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", (indexI + 1), (indexJ + 1));
    }
}
