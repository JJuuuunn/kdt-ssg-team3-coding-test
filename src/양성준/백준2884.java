package 양성준;

import java.io.*;
import java.util.*;

public class 백준2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if (m - 45 < 0) { // 45를 뺀 값이 음수인 경우
            m = Math.abs(60 - (45 - m));
            if (h - 1 < 0) h = 23; // h가 0인경우 전날로 돌아가야해서 조건 확인
            else h--;
        } else m -= 45;
        System.out.printf("%d %d", h, m);
    }
}
