package 이인서;

import java.util.Scanner;

public class 백준8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0; //sum 선언, 0으로 초기화

        for (int i=0; i<n; i++){ //받은 수 n만큼 반복문 돌려서 sum에 더해줌.
            sum+=i+1; //i는 0부터니까 i+1
        }
        System.out.println(sum);
    }
}
