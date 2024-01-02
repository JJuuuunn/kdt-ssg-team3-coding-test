package SSG4주차.로또_당첨_프로그램.김해린;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rd = new Random();
    static final int LOTTO = 6;
    static ArrayList<Integer> LOTTOINIT = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> winLotto = new ArrayList<>();
        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~10):");

        int amount = in.nextInt(); //로또 개수
        ArrayList<ArrayList<Integer>> myLotto = new ArrayList<>();

        for(int i = 0; i < amount; i++) {
            ArrayList<Integer> lottoList = new ArrayList<>();
            System.out.printf("%-4c", 65 + i);
            myLotto.add(createLottoNum(lottoList));
            //만약 amount가 3이면 로또 3개 산 것 ---> 첫번째로 산 로또번호 5개 ~ 세번째로 산 로또번호 5개
            printLotto(myLotto.get(i));
        }


        System.out.println("\n[로또 발표]");
        System.out.print("\t");
        winLotto = createLottoNum(winLotto);
        printLotto(winLotto);


        System.out.println("\n[내 로또 결과]");
        for(int i = 0; i < amount; i++) {
            System.out.printf("%-4c", 65 + i);
            lottoResult(myLotto.get(i), winLotto);
        }

    }

    public static ArrayList<Integer> createLottoNum(ArrayList<Integer> lottoList){
        lottoInit();
        for(int i = 0; i < LOTTO; i++) {
            lottoList.add(LOTTOINIT.remove(rd.nextInt(LOTTOINIT.size()))); //난수를 생성할 때 로또의 모든 번호가 담긴 박스에서 해당 난수의 위치에 있는 값 제거. 제거한 값이 로또 번호로 들어감
            //ex) 난수 1 생성 -> 로또번호 박스[1, 2, 3, ... 45]의 첫번째 위치에 있는 1이 제거되고, 로또 번호는 1번으로 생성된 것
            //따라서, 로또 번호 박스는 [2, 3, ... 45]가 됨
            //이렇게 하여 로또 1번은 중복해서 나올 수가 없음
        }
        Collections.sort(lottoList);
        return lottoList;
    }

    public static void printLotto(ArrayList<Integer> lottoList) {
        for(int i = 0; i < LOTTO; i++) {
            System.out.printf("%02d", lottoList.get(i));
            if(i == lottoList.size() - 1) System.out.print("\n");
            else System.out.print(",");
        }
    }

    public static void lottoResult(ArrayList<Integer> my, ArrayList<Integer> win) {

        for(int i = 0; i < LOTTO; i++) {

            System.out.printf("%02d", my.get(i));
            if(i == my.size() - 1) System.out.print(" ");
            else System.out.print(",");
        }

        my.retainAll(win);
        System.out.printf("=> %d개 일치\n", my.size());
    }

    public static void lottoInit(){ //로또의 모든 번호가 담긴 박스 초기화
        LOTTOINIT.clear(); //로또 번호 생성할 때 마다 새로운 박스를 만들어 줘야 해서 원래 있던 박스는 없애줌 --> 이렇게 하지 않으면 45개의 박스 계속 추가됨
        for(int i = 1; i <= 45; i++) LOTTOINIT.add(i);
    }
}
