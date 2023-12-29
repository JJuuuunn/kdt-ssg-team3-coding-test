package SSG4주차.백준1085.양성준;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 사실상 필요 없음

        // 상근이 숫자 카드 담기 위해서 Set 사용
        Set<Integer> set = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toSet());

        int M = Integer.parseInt(br.readLine()); // 사실상 필요 없음
        StringBuilder sb = new StringBuilder(); // 출력할 0과 1을 담기 위해 사용
        for (String num : br.readLine().split(" ")) { // split으로 공백 기준으로 끊어서 foreach 실행
            sb.append(set.remove(Integer.parseInt(num)) ? 1 : 0).append(" "); // 값이 있으면 지우고 1을 담고 없으면 0을 담음
        }

        System.out.println(sb);
    }
}