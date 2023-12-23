package SSG2주차.백준10988.조정우;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordEntered = sc.nextLine();
        int idxTrackerStart = 0;
        int idxTrackerEnd = wordEntered.length() - 1;
        int answer = 1;
        while (idxTrackerStart <= idxTrackerEnd) {
            if (wordEntered.charAt(idxTrackerStart++) != wordEntered.charAt(idxTrackerEnd--)) {
                answer = 0;
                break;
            }
        }
        System.out.print(answer);
        sc.close();
    }
}
