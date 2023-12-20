package SSG2주차.백준1157.양성준;

import java.io.*;
import java.util.*;

public class Main {
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

