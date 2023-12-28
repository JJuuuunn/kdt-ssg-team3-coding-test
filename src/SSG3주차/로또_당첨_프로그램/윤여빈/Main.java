package SSG3주차.로또_당첨_프로그램.윤여빈;

import java.util.*;
import java.util.ArrayList;

public class Main {
    static List<int[]> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("로또 구매 수량을 입력하세요.(숫자 1-10) : ");
        int buy = sc.nextInt();
        char abc = 'A';
        for (int i = 0; i < buy; i++) {
        int[] lotto = new int[6];
        Random random = new Random();
            for (int j = 0; j < 6; j++) { //중복제거
                lotto[j] = (random.nextInt(45) + 1);
                for (int k = 0; k < j; k++) {
                    if (lotto[j] ==lotto[k]){
                        j--;
                    }
                }
            }
            list.add(lotto);
        }
        for (int i = 0; i < list.size(); i++) {
            int[] myLotto = list.get(i);
            System.out.print(abc + "  ");
            abc++;
            for (int j = 0; j < 6; j++) {
                System.out.print(myLotto[j] + " ");
            }
            System.out.println();
        }
        System.out.println("[로또 발표]");
        int[] realLotto = new int[6];
        Arrays.sort(realLotto);
        for (int i = 0; i < 6; i++) {
            Random rd = new Random();
            realLotto[i] = (rd.nextInt(45) + 1);
            System.out.print(realLotto[i] + " ");
        }
        System.out.println();
        System.out.println();
        int count = 0;
        System.out.println("[내 로또 결과]");
        for (int i = 0; i < 6; i++) { //여기서 중첩 for문을 만들어서 두개의 배열을 비교하려고 했는데...안되넹
            int[] myLotto = list.get(i);
            for (int j = 0; j < 6; j++) {
                if (myLotto[i] == realLotto[j]) {
                    count++;
                }
            }
            for (int j = 0; j < 6; j++) {

                System.out.print(myLotto[j] + " ");
            }
            System.out.println(" => " + count + "개 일치");
        }

    }
}
