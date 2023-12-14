package 최소원;
import java.util.*;

public class 백준10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
            min = Math.min(min,array[i]);
            max = Math.max(max,array[i]);
        }
        System.out.print(min + " " + max);
    }
}
