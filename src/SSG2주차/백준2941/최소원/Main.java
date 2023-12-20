package SSG2주차.백준2941.최소원;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};


        for (int i = 0; i < alphabet.length; i++) {
            str = str.replaceAll(alphabet[i],"a");
        }

        System.out.println(str.length());
    }

}

