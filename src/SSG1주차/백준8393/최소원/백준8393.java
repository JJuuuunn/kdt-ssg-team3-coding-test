package SSG1주차.백준8393.최소원;
import java.util.*;

public class 백준8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int total = 0;

        for(int i=1; i<=n; i++) {
            total +=i;
        }
        System.out.println(total);
    }
}
