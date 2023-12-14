package 이인서;

import java.util.Scanner;

public class 백준2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //hour minute 입력 받음
        int hour = sc.nextInt();
        int minute = sc.nextInt();

        //minute이 45보다 작을 경우 hour에서 1 빼고 min+60-45= min+15
        if (minute<45){
            if (hour==0){
                hour=23;
            } else {
                hour-=1;}
            minute+=15;
            // 45이상일 경우 min-45
        } else if (minute>=45) {
            minute-=45;
        }

        System.out.println(hour+" "+minute);
    }
}
