package 이인서;

import java.util.Scanner;

public class 백준1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A B 입력 받음
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A>B) {
            System.out.println(">");
        }  else if (A<B) {
            System.out.println("<");
        } else if (A==B) {
            System.out.println("==");
        }
    }
}
