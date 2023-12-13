package 윤여빈;

import java.util.Scanner;

public class 백준10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        int max = 0;
        int min = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            b[i] = a;
            if(i == 0) {
                max = b[i];
                min = b[i];
            }
            if(min>b[i]){
                min=b[i];

            }
            if(max<b[i]){
                max=b[i];
            }
        }
        System.out.print(min+" ");
        System.out.print(max);

    }
}
