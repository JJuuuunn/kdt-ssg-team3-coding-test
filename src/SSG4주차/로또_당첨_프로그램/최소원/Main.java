package SSG4주차.로또_당첨_프로그램.최소원;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();
    static ArrayList<Integer> lotto; // 로또 한 개
    static ArrayList<ArrayList<Integer>> lottoArray = new ArrayList<>();    //이차원 로또 배열
    static ArrayList<Integer> arrayList;    //1-45까지의 수를 집어넣는 로또 배열 선언

    static int randomNum = 0;

    public static void inputLotto() {
        arrayList = new ArrayList<>();
        for(int i=1; i<=45; i++) {
            arrayList.add(i);   //arrayList에 1부터 45까지의 로또 번호를 삽입해준다.
        }
    }

    public static void drawLotto(){

        lotto = new ArrayList<>();

        for(int lottoIndex = 0; lottoIndex < 6; lottoIndex++) {
            randomNum = random.nextInt(arrayList.size());
            lotto.add(arrayList.get(randomNum));
            arrayList.remove(randomNum);
        }
        Collections.sort(lotto);
        lottoArray.add(lotto);
    }

    public static void printLotto() {
        for(int i=0; i<6; i++) {
            System.out.printf("%02d ",lotto.get(i));
        }
    }


    public static void compareLotto(int lottoCount) {
        System.out.println("\n\n[내 로또 결과]");

        for(int lottoRow = 0; lottoRow<lottoCount; lottoRow++) {
            System.out.print((char)(65+lottoRow)+"\t");

            for(int i: lottoArray.get(lottoRow))
                System.out.printf("%02d ",i);

            lottoArray.get(lottoRow).retainAll(lottoArray.get(lottoCount));
            System.out.println("=> " + lottoArray.get(lottoRow).size()+ "개 일치");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10):");
        int lottoCount = sc.nextInt();

        System.out.println();
        for (int lotto = 0; lotto < lottoCount; lotto++) {
            System.out.print((char) (65 + lotto) + "\t");
            inputLotto();               //사용자 로또
            drawLotto();
            printLotto();
            System.out.println();
        }

        System.out.println("\n[로또 발표]");
        System.out.print("\t");
        inputLotto();       //로또 생성
        drawLotto();  //로또 발표
        printLotto();

        compareLotto(lottoCount);   //내 로또 결과 출력
    }
}
