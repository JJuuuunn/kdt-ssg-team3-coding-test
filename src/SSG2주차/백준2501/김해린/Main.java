package SSG2주차.백준2501.김해린;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int N = in.nextInt();
        int K = in.nextInt();
        int count = 0; int divisor = 0;

        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                count++;
                divisor = i;
                if(count == K) break;
            }
        }

        if(count < K) divisor = 0;
        System.out.println(divisor);
    }
}
