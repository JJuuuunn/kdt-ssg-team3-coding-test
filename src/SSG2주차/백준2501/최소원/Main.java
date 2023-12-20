package SSG2주차.백준2501.최소원;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        for(int i=1; i<=n; i++) {
            if(n%i==0) {
                count++;
                if(count==k) {
                    result = i;
                }
            }
        }

        System.out.println(result);
    }
}
