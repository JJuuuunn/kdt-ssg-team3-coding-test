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

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<ownNum; i++) {
            int number = Integer.parseInt(st.nextToken());
            set.add(number);
        }
    }

    public static void cardNum()throws IOException {
        int compareCard = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<compareCard; i++) {
            int result = 0;
            int inputNum = Integer.parseInt(st.nextToken());
            if(set.contains(inputNum))
                result = 1;
            System.out.print(result+" ");
        }
    }


    public static void main(String[] args) throws Exception {

        inputOwnNum();
        cardNum();

    }
}
