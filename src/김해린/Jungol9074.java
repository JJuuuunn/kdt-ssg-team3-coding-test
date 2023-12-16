package 김해린;

import java.util.Scanner;

public class Jungol9074 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int[] numArr = new int[10];
        //1~10까지의 정수를 입력받기 때문에 배열의 크기는 10
        //따라서 입력받은 정수를 담아줄 크기가 10인 배열 numArr생성

        while(true) {
            int num = in.nextInt(); //정수 입력 받음

            if(num <= 0 || num > 10) break; //입력 받은 정수가 0보다 작거나 큰 수 혹은 10보다 큰 수라면 범위(1~10)를 벗어나기 때문에 while문을 빠져나옴

            numArr[num-1]++;
            //numArr은 현재 모두 0으로 초기화 되어있음. 따라서 입력받은 num을 인덱스로 넣어주고 배열에서 num의 위치에 있는 요소를 +1 해줌
            //num-1을 한 이유? 인덱스는 0부터 시작인데 입력받는 값은 1~10이기 떄문에 -1을 해준것

        }

        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] > 0) System.out.printf("%d : %d개\n", i+1, numArr[i]); //1번 이상 입력된 값들을 출력해야 하기 때문에 numArr의 요소들 중 0보다 큰 값만 얻을 수 있도록 조건문 사용
            //i+1을 한 이유? 위에서 말한것 처럼 배열은 0부터 시작 하지만 출력은 1~10 범위 안의 값으로 해야하기 때문에 +1을 한 것
        }

    }
}
