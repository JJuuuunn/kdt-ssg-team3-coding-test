package SSG2주차.백준1157.김해린;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] alpha = new int[26]; //A~Z까지의 개수 25개라 크기가 26인 배열 만듬
        int max = 0; //가장 많이 사용된 알파벳이 몇번 사용 됐는지
        int maxIndex = 0; //가장 많이 사용된 알파벳의 위치
        int count = 0; //가장 많이 사용된 알파벳의 개수(여러개이면 ?를 출력하고 한개일때만 해당 알파벳 출력해야 해서 count사용)

        String str = in.next();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) < 97) alpha[str.charAt(i) - 65]++; //알파벳이 대문자라면 -65를 해줘야 함
            else alpha[str.charAt(i) - 97]++; //알파벳이 소문자라면 -97 해줘야 함
            //아스키코드에서 A는 65, a는 97부터 시작하여 a(A)~z(Z)까지의 수를 나타내기 위해서
        }

        max = alpha[0]; //우선 max alpha[0]으로 초기화

        for(int i = 1; i < alpha.length; i++) {
            if(max < alpha[i]) { //만약 max보다 alpha[i]가 크다면
                max = alpha[i]; //max에 alpha[i]의 값을 넣어줌
                maxIndex = i; //maxIndex는 max값이 존재하는 위치인 i를 넣어줌
            }
        }

        for(int i = 0; i < alpha.length; i++) {
            if(max == alpha[i]) count++; //max와 같은 값이 alpha배열에 존재할 때 마다 count 1 증가
        }

        if(count == 1) System.out.printf("%c", 65 + maxIndex); //만약 count가 1이라면 max값이 존재하는 인덱스, 즉 알파벳에 65를 더해 대문자로 출력
            // (A~Z까지를 나타내느 배열을 사용했기 때문에 인덱스로 어떤 알파벳인지 알 수 있음)
        else System.out.println("?"); //count가 1이 아니라면 즉, 가장 많이 사용된 알파벳이 여러개라면 "?" 출력
    }
}
