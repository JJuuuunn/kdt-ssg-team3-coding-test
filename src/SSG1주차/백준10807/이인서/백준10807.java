package SSG1주차.백준10807.이인서;

import java.util.Scanner;

public class 백준10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int[] arr = new int[N]; //N개 크기의 배열 할당

        for (int i=0; i<N; i++){ //받은 숫자 전부 배열에 넣기
            int numbers = sc.nextInt();
            arr[i] = numbers;
        }

        int v = sc.nextInt(); //찾을 수 v
        int cnt=0; //v 개수 셀 cnt

        for (int i: arr){
            if (i==v){ //arr안에 v를 찾을때마다 cnt+1
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
