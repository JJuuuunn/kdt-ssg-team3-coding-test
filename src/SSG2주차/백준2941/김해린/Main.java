package SSG2주차.백준2941.김해린;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = in.nextLine(); //문자열 입력 받음

        for(int i = 0; i < alpha.length; i++) {

            str = str.replaceAll(alpha[i], "a");
            //str에서 alpha배열에 있는 단어 모두 a로 교체
            //만약 str이 nljj이라면 배열에 lj라는 단어가 존재하기 때문에 naj가 되는 것
        }

        System.out.println(str.length()); //str의 길이를 출력
    }
}
