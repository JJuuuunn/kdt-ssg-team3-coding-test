package 김소진;

import java.util.Scanner;

public class 백준10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n개의 정수를 입력받음
        int n = sc.nextInt();
        //n개만큼의 배열 선언
        int[] array = new int[n];
        //n만큼의 정수를 입력 받기 위해 for문 사용
        for(int i = 0; i < n; i++){
            int number = sc.nextInt();
            //입력받은 정수를 배열에 저장
            array[i] = number;
        }
        //중복 입력될 count 변수 선언
        int count = 0;
        //중복값을 확인할 변수 v 입력받음
        int v = sc.nextInt();
        //n만큼의 for문을 돌림
        for(int i = 0; i < n; i++){
            //입력값인 v와 중복 된 배열의 값이 있으면 count 증가
            if(v == array[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
