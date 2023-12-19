package SSG1주차.백준1330.김소진;

import java.util.Scanner;

public class 백준1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        //A가 B보다 큰 경우
        if(A > B){
            System.out.println(">");
        }
        //A가 B보다 작은 경우
        else if (A < B) {
            System.out.println("<");
        }
        //A와 B가 같은 경우
        else if (A == B) {
            System.out.println("==");
        }
    }
}
