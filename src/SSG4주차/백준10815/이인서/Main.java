package SSG4주차.백준10815.이인서;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main { //시간초과
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); //숫자 카드의 개수
        String nums = bf.readLine();
        List<String> cardList1 = new ArrayList<>(List.of(nums.split(" "))); //카드에 적힌 정수 입력

        int M = Integer.parseInt(bf.readLine()); //상근이가 가진 숫자 카드의 개수
        String nums2 = bf.readLine();
        List<String> cardList2 = new ArrayList<>(List.of(nums2.split(" "))); //카드에 적힌 정수 입력

        for (String i : cardList2) {
            if (cardList1.contains(i)) { //list1에 list2에 있는게 있으면 1출력
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        bf.close();
    }
}