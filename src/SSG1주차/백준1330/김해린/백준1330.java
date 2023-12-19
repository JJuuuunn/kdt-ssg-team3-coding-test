package SSG1주차.백준1330.김해린;

import java.util.Scanner;

public class 백준1330 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int A = in.nextInt(); //정수 A 입력
        int B = in.nextInt(); //정수 B 입력

        if(A > B) System.out.println(">"); //A가 B보다 크다면 ">" 출력
        else if(A < B) System.out.println("<"); //A가 B보다 작다면 "<" 출력
        else System.out.println("=="); //위의 조건들 모두 맞지 않다면 "==" 출력
    }
}
