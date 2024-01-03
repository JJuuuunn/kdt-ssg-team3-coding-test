package SSG4주차.로또_당첨_프로그램.김소진;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //내 로또 추출
        Scanner sc = new Scanner(System.in);
        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수룰 입력해주세요.(숫자 1 ~ 10) : ");
        int count = sc.nextInt(); //로또 개수 입력
//        int[][] mylotto = new int[count][6]; //나의 로또 배열 선언
        ArrayList<Integer>[] mylotto = new ArrayList[count];
        for (int i = 0; i < count; i++) {
            System.out.print((char) (i + 65) + "\t");
            mylotto[i] = lottoNumber();
            System.out.println();
        }

        //로또 발표
        System.out.println("\n[로또 발표]");
        ArrayList<Integer> lotto;
        System.out.print("\t");
        lotto = lottoNumber();
        System.out.println("\n");


        //로또 번호 비교
        System.out.println("[내 로또 결과]");
        for (int i = 0; i < count; i++) {
            System.out.print((char) (i + 65) + "\t");
            printLottoNumbers(mylotto[i]);
            mylotto[i].retainAll(lotto);
            System.out.print("-> " + mylotto[i].size() + "개");
            System.out.println();
        }
//        for (int i = 0; i < mylotto.length; i++) { //입력받은 개수만큼 for문 진행
//            System.out.print((char) (i + 65) + "\t");
//            int duplicationNumber = 0; //중복값 초기화
//            for (int j = 0; j < mylotto[i].length; j++) { //해당 행의 로또 번호 비교
//                System.out.printf("%2d", mylotto[i][j]);
//                for (int k = 0; k < 6; k++) { //기존 lotto의 값과 mylotto의 값을 비교
//                    if (lotto[k] == mylotto[i][j]) {
//                        duplicationNumber++;
//                    }
//                }
//                if(j < 5){
//                    System.out.print(", ");
//                }
//            }
//            System.out.printf(" => %d개 일치", duplicationNumber);
//            System.out.println();
//        }
    }

    //로또번호 추가 메서드
    static ArrayList<Integer> lottoNumber() {
        ArrayList<Integer> lottoNumber = new ArrayList<>();
        //ArrayList에 1부터 45까지 넣어줌
        for (int i = 1; i <= 45; i++) {
            lottoNumber.add(i);
        }
        //list의 순서 변경
        Collections.shuffle(lottoNumber);
        //6자리를 출력
        lottoNumber = new ArrayList<Integer>(lottoNumber.subList(0, 6));
        //오름차순 정렬
        Collections.sort(lottoNumber);

        //로또 번호를 출력해주는 for문
        printLottoNumbers(lottoNumber);

        return lottoNumber;
    }

    //로또 출력 메서드
    public static void printLottoNumbers(ArrayList<Integer> lottoNumber){
        for(int number : lottoNumber){
            System.out.printf("%2d ", number);
        }
    }
}
