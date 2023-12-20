package SSG1주차.백준8393.양성준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        while (n-- > 0) {
            sum += (n + 1);
        }

        System.out.println(sum);
    }
}
