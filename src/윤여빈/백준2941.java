package 윤여빈;

import java.util.Scanner;

public class 백준2941 {
    public static void main(String[] args) {
        //이 문제를 보자마자, 주어지는 문자열에서, 크로아티아 문자가 있는지 확인해서, 있으면 해당 크로아티아 문자를
        //한글자 짜리로 대체해줘서 다시 length를 세면 되겠다고 생각이 들었어요.

        Scanner sc = new Scanner(System.in);
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" }; //주어진 문자들을 배열로 만듦.
        String oldstr = sc.nextLine();
        String newstr = ""; //바꿔줄 생각이라 바꿔줄 새로운 문자열 초기화.
        for (int i = 0; i < croatia.length; i++) {
            if (oldstr.contains(croatia[i])) {
                newstr = oldstr.replace(croatia[i], "a");
            }
        }
        if (newstr.isEmpty()) {
            newstr = oldstr;
        }
        System.out.println(newstr.length());

    }
}
