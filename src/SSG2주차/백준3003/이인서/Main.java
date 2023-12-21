package SSG2주차.백준3003.이인서;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] blackChess = new int[]{1,1,2,2,2,8}; //기준 체스 말 개수
        int[] whiteChess = new int[6]; //흰색 말 개수 입력받을 배열 선언

        for (int i=0; i< whiteChess.length; i++){
            whiteChess[i] = sc.nextInt(); //배열 채우기
            System.out.print((blackChess[i]-whiteChess[i])+" "); //개수 차이 출력
        }
    }
}
