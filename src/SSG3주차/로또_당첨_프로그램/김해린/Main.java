package SSG3주차.로또_당첨_프로그램.김해린;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rd = new Random();
    static final int LOTTO = 6;
    static ArrayList<Integer> LOTTOINIT = new ArrayList<>();

    public static void main(String[] args) {
        int[] winLotto = new int[LOTTO];
        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요.(숫자 1 ~10):");

        int amount = in.nextInt(); //로또 개수
        int[][] myLotto = new int[amount][LOTTO]; //로또 여러개를 살 수 있으니 2차원 배열로 만듬

        for(int i = 0; i < amount; i++) {
            System.out.printf("%-4c", 65 + i);
            myLotto[i] = createLottoNum(myLotto[i]);
            //만약 amount가 3이면 로또 3개 산 것 ---> 첫번째로 산 로또번호 5개 ~ 세번째로 산 로또번호 5개
            printLotto(myLotto[i]);
        }


        System.out.println("\n[로또 발표]");
        System.out.print("\t");
        winLotto = createLottoNum(winLotto);
        sort(winLotto);
        printLotto(winLotto);


        System.out.println("\n[내 로또 결과]");
        for(int i = 0; i < amount; i++) {
            int count = 0;
            System.out.printf("%-4c", 65 + i);
            for(int j = 0; j < LOTTO; j++) {
                for(int k = 0; k < LOTTO; k++) {
                    if(myLotto[i][j] == winLotto[k]) count++;
                }

                System.out.printf("%02d", myLotto[i][j]);
                if(j == myLotto[i].length - 1) System.out.print(" ");
                else System.out.print(",");
            }
            System.out.printf("=> %d개 일치\n", count);
        }

    }

    public static int[] createLottoNum(int[] lottoArr){
        lottoInit();
        for(int i = 0; i < LOTTO; i++) {
            lottoArr[i] = LOTTOINIT.remove(rd.nextInt(LOTTOINIT.size())); //난수를 생성할 때 로또의 모든 번호가 담긴 박스에서 해당 난수의 위치에 있는 값 제거. 제거한 값이 로또 번호로 들어감
            //ex) 난수 1 생성 -> 로또번호 박스[1, 2, 3, ... 45]의 첫번째 위치에 있는 1이 제거되고, 로또 번호는 1번으로 생성된 것
            //따라서, 로또 번호 박스는 [2, 3, ... 45]가 됨
            //이렇게 하여 로또 1번은 중복해서 나올 수가 없음

//            for(int j = 0; j < i; j++) {
//                if(lottoArr[i] == lottoArr[j]) {
//                    i--;
//                    break;
//                }
//            }
        }
        return lottoArr;
    }

    public static void printLotto(int[] lottoArr) {
        for(int i = 0; i < LOTTO; i++) {
            System.out.printf("%02d", lottoArr[i]);
            if(i == lottoArr.length - 1) System.out.print("\n");
            else System.out.print(",");
        }
    }

    public static void lottoInit(){ //로또의 모든 번호가 담긴 박스 초기화
        LOTTOINIT.clear(); //로또 번호 생성할 때 마다 새로운 박스를 만들어 줘야 해서 원래 있던 박스는 없애줌 --> 이렇게 하지 않으면 45개의 박스 계속 추가됨
        for(int i = 1; i <= 45; i++) LOTTOINIT.add(i);
    }
}
