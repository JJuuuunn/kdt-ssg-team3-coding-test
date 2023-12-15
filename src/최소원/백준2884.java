package 최소원;
import java.util.*;

public class 백준2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        if(m-45>=0) {
            m -= 45;
        } else {
            if(h==0)
                h = 23;
            else
                h -= 1;
            m += 15;
        }
        System.out.println(h + " " + m);
    }
}
