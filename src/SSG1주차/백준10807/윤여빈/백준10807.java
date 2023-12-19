package SSG1주차.백준10807.윤여빈;

import java.util.Scanner;

public class 백준10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int count = 0;
        int v = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            a[i] = c;
            if (a[i]==v){
                count++;
            }
        }
        System.out.println(count);

    }
}
