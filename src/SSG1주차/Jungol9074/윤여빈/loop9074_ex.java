package SSG1주차.Jungol9074.윤여빈;

import java.util.Scanner;

public class loop9074_ex {
    public static void main(String[] args) {
        //1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면 
        // 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int[] b = new int[10];
        while(true) {
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            b[a] += 1;
        }
        for (int i=0; i<10; i++){
            if(b[i]<1|| b[i]>10){
                continue;
            }
            System.out.println(i + " : "+b[i]+"개");
        }

    }
}
