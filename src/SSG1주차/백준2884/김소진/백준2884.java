package SSG1주차.백준2884.김소진;

import java.util.Scanner;

public class 백준2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        minute -= 45;
        //분이 0 보다 작은 경우
        if(minute < 0){
            //시간에서 1시간 제외
            hour-=1;
            //시간에서 제외한 1시간을 분에 더해줌
            minute += 60;
        }
        //시간이 0보다 작은 경우
        if(hour < 0){
            //시간을 23으로 맞춰줌
            hour = 23;
        }
        System.out.println(hour + " " + minute);
    }
}
