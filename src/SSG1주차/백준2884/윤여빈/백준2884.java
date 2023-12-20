package SSG1주차.백준2884.윤여빈;

import java.util.Scanner;

public class 백준2884 {
    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        int a = time.nextByte();
        int b = time.nextByte();
        int c;
        int d;
        d = b - 45;
        c = a;
        if (d < 0){
            d = b - 45 + 60;
            c = a - 1;
        }
        System.out.print(c+" ");
        System.out.println(d);

    }
}
