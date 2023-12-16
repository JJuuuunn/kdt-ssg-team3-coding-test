package 김해린;

import java.util.Scanner;
import static java.util.Arrays.sort;

public class 백준10818 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int N = in.nextInt(); //정수 N 입력받음
        int[] numArr = new int[N]; //길이가 N인 배열 numArr 생성

        for(int i = 0; i < N; i++) {
            numArr[i] = in.nextInt(); //N개의 정수를 입력 받아 numArr에 넣음
        }

        sort(numArr); //numArr을 오름차순으로 정렬
        //따라서 numArr의 0번째 인덱스에는 최소값, numArr의 마지막 인덱스에는 최대값이 있는 것

        System.out.printf("%d %d", numArr[0], numArr[N-1]);
        //numArr[N-1] -> N-1을 한 이유는?
        //배열은 0번째 인덱스부터 시작하기 때문에 마지막 인덱스는 N이 아닌 N-1임
    }
}
