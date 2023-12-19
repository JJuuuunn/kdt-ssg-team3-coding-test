package SSG2주차.백준3003.양성준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static List<Integer> chess = new ArrayList<>(List.of(1, 1, 2, 2, 2, 8));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(chess.remove(0) - Integer.parseInt(st.nextToken())).append(" ");
        }

        System.out.println(sb);
    }
}
