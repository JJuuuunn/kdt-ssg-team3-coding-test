package SSG2주차.백준3003.최소원;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {1,1,2,2,2,8};

        for(int i = 0; i<array.length; i++) {
            int input = sc.nextInt();

            int result = array[i]-input;
            System.out.print(result+" ");
        }


        sc.close();
    }
}
