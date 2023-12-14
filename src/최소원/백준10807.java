package 최소원;
import java.util.*;

public class 백준10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<1||n>100) {
            System.out.println("1이상, 100이하의 정수를 입력하세요");
            System.exit(0);
        }

        int[] array = new int[n];
        int count = 0;

        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
            if(array[i]<-100||array[i]>100) {
                System.out.println("-100이상 100 이하의 정수를 입력해주세요.");
                System.exit(0);
            }

        }

        int find = sc.nextInt();

        for(int i=0; i<array.length; i++) {
            if(find==array[i])
                count++;
        }
        System.out.println(count);



    }
}
