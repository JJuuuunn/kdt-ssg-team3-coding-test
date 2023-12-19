package SSG1주차.백준10952.양성준;

import java.io.*;
import java.util.*;

public class 백준10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a == 0 || b == 0) break;
            System.out.printf("%d\n", a + b);;
        }
    }
}
