package SSG1주차.백준10952.윤여빈;

import java.util.Scanner;

public class 백준10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0){
                break;
            }
            System.out.println(a+b);
        }

    }
}
