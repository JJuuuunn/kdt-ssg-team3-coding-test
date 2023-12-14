package 양성준;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class 백준10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = IntStream.range(0, n).map(i -> Integer.parseInt(st.nextToken())).toArray();
        int v = Integer.parseInt(br.readLine());

        System.out.println(Arrays.stream(arr).filter(i -> i == v).count());

    }
}
