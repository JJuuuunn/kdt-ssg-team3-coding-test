package SSG1주차.백준2884.김해린;

import java.util.Scanner;

public class 백준2884 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int H = in.nextInt(); //정수 H(시) 입력 받음
        int M = in.nextInt(); //정수 M(분) 입력 받음
        M -= 45; //45분 일찍 알람을 설정해야 하기 떄문 입력받은 M에서 - 45를 해줌

        if(M < 0)  { //만약 M이 0보단 작다면
            M = Math.abs(M); //M은 절대값으로 만들어줌
            M = 60 - M;

            H -= 1; //한시간을 빼줘야 해서 H - 1
            if(H < 0) H = 23;

        }

        System.out.printf("%d %d", H, M);

    }
}
