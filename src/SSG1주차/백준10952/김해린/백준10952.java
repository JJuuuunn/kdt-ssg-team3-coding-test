package SSG1주차.백준10952.김해린;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준10952 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Integer> resultArr = new ArrayList<>(); //sum함수의 결과값을 넣어주는 ArrayList
        //배열을 사용하지 않은 이유?
        //배열은 크기가 고정이라 한번 크기를 정하면 바꿀 수 없음. 하지만 해당 문제는 0이 입력되기 전까지 계속 입력을 받아야 하기 때문에 크기를 고정하면 안됨.
        //ArrayList는 동적으로 크기를 변경 가능

        while(true) {
            int A = in.nextInt(); //정수 A 입력
            int B = in.nextInt(); //정수 B 입력

            if(A == 0 && B == 0) break; //만약 A와 B모두 0이 입력 된다면 while문에서 빠져나옴.

            resultArr.add(sum(A, B)); //sum() 함수를 실행하여 나온 결과값 ArrayList인 resultArr에 넣음.
        }

        for(int i : resultArr) System.out.println(i); //resultArr에 있는 값들 하나씩 출력
    }

    public static int sum(int n1, int n2) { //A와 B를 더하는 sum 함수
        return n1 + n2;
    }
}
