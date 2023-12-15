package 김소진;

import java.util.Arrays;
import java.util.Scanner;

public class Jungol9074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1부터 10까지의 정수라는 범위가 지정되어 있으므로 해당 범위만큼 배열을 선언해준다.
        int[] array = new int[10];
        //입력받은 number의 횟수를 1씩 추가하여 배열에 저장
        for (int i = 0; i < array.length; i++) {
            int number = sc.nextInt();
            //입력받은 값이 0이면 멈춤
            if(number == 0){
                break;
            }
            //배열은 0 부터 9까지 존재하기 때문에 number-1한 인덱스값에 1씩 더해준다.
            array[number - 1] += 1;
        }

        //출력
        for (int i = 0; i < array.length; i++) {
            //배열에 1이상인 수만 출력
            if (array[i] != 0) {
                System.out.println((i + 1) + " : " + array[i] + "개");
            }
        }

    }
}
