package SSG1주차.백준8393.김해린;

import java.util.Scanner;

public class 백준8393 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n = in.nextInt(); //정수 n을 입력 받음
        int total = 0;

        for(int i = 1; i <= n; i++) { //1부터 입력 받은 n까지 반복
            total += i; // <- total = total + i (1~n까지의 합을 변수 total에 넣음)
        }

        System.out.println(total);
    }
}
