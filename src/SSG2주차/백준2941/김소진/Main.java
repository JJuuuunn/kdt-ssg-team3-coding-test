package SSG2주차.백준2941.김소진;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String alphabet = word.replace("c-","0").replace("c=", "0").replace("dz=", "0")
                .replace("d-", "0").replace("lj", "0").replace("nj", "0")
                .replace("s=", "0").replace("z=", "0");
        System.out.println(alphabet.length());

    }
}
