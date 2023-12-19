package SSG1주차.백준8393.김소진;

import java.util.Scanner;

public class 백준8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n의 값을 입력받음
        int n = sc.nextInt();
        //합을 구하는 변수 선언
        int total = 0;
        //n만큼 for문을 돌림
        for(int i = 1; i <= n; i++){
            //total에 1부터 n까지 저장
            total += i;
        }
        System.out.println(total);
    }
}
