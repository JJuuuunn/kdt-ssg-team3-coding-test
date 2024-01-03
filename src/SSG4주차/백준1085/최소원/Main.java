package SSG4주차.백준1085.최소원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int ownNum;
    static HashSet<Integer> set = new HashSet<>();

    public static void inputOwnNum()throws IOException {

        ownNum = Integer.parseInt(br.readLine());
        //스트림으로부터 한 줄을 읽어 문자열로 리턴한 후 int형으로 파싱
        //+예외처리 해주어야 한다.

        st = new StringTokenizer(br.readLine());
        //공백 단위로 읽어들일 수 있는 라인 추가

        for(int i=0; i<ownNum; i++) {
            int number = Integer.parseInt(st.nextToken());
            //공백단위로 number을 읽음
            set.add(number);
        }
    }

    public static void cardNum()throws IOException {
        int compareCard = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<compareCard; i++) {
            int result = 0;
            int inputNum = Integer.parseInt(st.nextToken());
            if(set.contains(inputNum))  //HashSet에서 inputNum 요소를 가졌다면 결과에 1 할당
                result = 1;
            System.out.print(result+" ");
        }
    }


    public static void main(String[] args) throws Exception {

        inputOwnNum();
        cardNum();

    }
}
