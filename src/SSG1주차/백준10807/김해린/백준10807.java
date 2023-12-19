package SSG1주차.백준10807.김해린;

import java.util.Scanner;

public class 백준10807 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int N = in.nextInt(); //정수 개수 N 입력 받음.
        int v = 0;
        int[] numArr = new int[N]; //길이가 N인 배열 numArr 생성
        int count = 0;

        for(int i = 0; i < N; i++) numArr[i] = in.nextInt(); //정수를 입력받고 배열 numArr에 넣어줌

        v = in.nextInt(); // 찾으려고 하는 정수 v 입력 받음.

        for(int i : numArr) { //만약 numArr 배열에 있는 요소가 v와 같다면 count를 +1 해줌
            if(i == v) count++;
        }

        System.out.println(count);
    }
}
