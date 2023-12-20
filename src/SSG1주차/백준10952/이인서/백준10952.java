package SSG1주차.백준10952.이인서;

import java.util.Scanner;

public class 백준10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A==0 && B==0){ // A=0, B=0 입력 받은 경우 반복문 탈출
                break;
            }
            System.out.println(A+B);
        }
    }
}
