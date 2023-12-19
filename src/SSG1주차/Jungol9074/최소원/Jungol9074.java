package SSG1주차.Jungol9074.최소원;
import java.util.*;

public class Jungol9074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        //1부터 10까지의 정수를 입력받을 예정이다.
        //받을 수 있는 수가 1부터 10 총 10개이므로 배열의 크기를 10으로 설정해준다.

        while(true) {   //1부터 10까지의 정수에서 벗어나기 전까지 계속 입력받아줘야하므로 while문 사용.
            int input = sc.nextInt();

            if(input<1||input>10) //입력값이 범위 밖의 값일경우 while문에서 벗어나도록 조건문과 break 사용
                break;

            array[input-1] +=1;
            //배열의 인덱스는 0부터 시작하므로 배열의 크기가 10일 경우 인덱스는 0-9이다.
            //입력받은 1부터 10의 값에서 1을 빼준 값을 배열의 인덱스에 넣어주고
            //배열의 초기 값은 0이고 정수를 입력받을때마다 해당 정수를 인덱스로 넣은 배열의 값을 1씩 더해줘서 개수를 구해준다.
        }

        for(int i=0; i<array.length; i++){
            if(array[i]!=0) //배열의 값(정수의 개수)이 0이 아닌 입력값들을 출력해주고 그에 해당하는 개수를 출력해준다.
                System.out.println((i+1) + " : " + array[i] + "개");
        }



    }
}
