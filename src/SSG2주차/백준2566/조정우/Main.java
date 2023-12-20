package SSG2주차.백준2566.조정우;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int RANGE_MATRIX = 9;
        Scanner sc = new Scanner(System.in);
        int trackerMax = -1;
        int idxRowMax = -1;
        int idxColMax = -1;
        for (int idxRow = 0; idxRow < RANGE_MATRIX; idxRow++) {
            for (int idxCol = 0; idxCol < RANGE_MATRIX; idxCol++) {
                int numberEntered = sc.nextInt();
                trackerMax = Math.max(trackerMax, numberEntered);
                if (numberEntered == trackerMax) {
                    idxRowMax = idxRow;
                    idxColMax = idxCol;
                }
            }
        }
        if (trackerMax != -1 && idxRowMax != -1 && idxColMax != -1) {
            System.out.println(trackerMax);
            System.out.print((idxRowMax + 1) + " " + (idxColMax + 1));
        }
        sc.close();
    }
}