package SSG1주차.Jungol9074.양성준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Array9074_연습문제1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) break;
            arr[num - 1]++;
        }

        for (int i = 0; i < 10; i++) {
            if (arr[i] != 0) System.out.printf("%d : %d개\n", i + 1, arr[i]);
        };
    }
}