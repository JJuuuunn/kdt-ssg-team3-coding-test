package SSG1주차.백준10818.이인서;

import java.util.Arrays;
import java.util.Scanner;

public class 백준10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            int num = sc.nextInt();
            arr[i]= num;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+ " "+ arr[arr.length-1]);
    }
}
