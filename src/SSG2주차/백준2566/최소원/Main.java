package SSG2주차.백준2566.최소원;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[9][9];
        int row = 0;
        int col = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                array[i][j] = sc.nextInt();
                if(max<=array[i][j]){
                    row = (i+1);
                    col = (j+1);
                }

                max = Math.max(max, array[i][j]);
            }
        }

        System.out.println(max);
        System.out.println(row+" " + col);

    }
}
