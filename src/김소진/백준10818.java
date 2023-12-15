package 김소진;

import java.util.Arrays;
import java.util.Scanner;

public class 백준10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수의 개수를 입력받을 n 변수 선언
        int n = sc.nextInt();
        //배열 선언
        int[] array = new int[n];
        //n번만큼 N개의 정수를 입력받음
        for(int i = 0; i < n; i++){
            int N = sc.nextInt();
            //입력받은 N의 정수를 배열에 저장
            array[i] = N;
        }
        //배열 오름차순 정렬
        Arrays.sort(array);
        //array[0] 부터 array[총 길이 - 1]값을 각각 출력
        System.out.println(array[0] + " " + array[array.length - 1]);
    }
}
