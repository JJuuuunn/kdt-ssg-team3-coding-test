package 이인서;

import java.util.Scanner;

public class Jungol9074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] count = new int[10]; //각 인덱스 0~9는 1~10까진의 개수를 count
        //초기 count = [0,0,0,0,0,0,0,0,0,0]

        while(true){
            int num = sc.nextInt();
            if (num<1 || num>11){ // 범위 밖의 값 입력시 반복문 탈출
                break;
            }
            count[num-1]+=1; // num에 4 입력시 count[3]에 +1
        }
        for (int i=0; i< count.length; i++){
            if (count[i]==0){ //개수가 0인 경우는 그냥 패스하기 위한 조건문
                continue;
            }
            System.out.println(i+1+ " : "+count[i]+"개");
        }
    }
}
