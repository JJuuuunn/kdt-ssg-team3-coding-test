package SSG3주차.로또_당첨_프로그램.이인서;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    ArrayList<Integer> lottoNum = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,22,23,24,25,26,27,28,29,
            30,31,32,33,34,35,36,37,38,39,
            40,41,42,43,44,45));

    public void compareNum(int num, int[][] numArr, int[] saveNum){
        for (int i=0; i<num; i++){
            for (int j=0; j<6; j++){
                if (numArr[i][j] == saveNum[j]);

            }
        }
    }
    public void myNum(int num){
        int[][] numArr = new int[num][7];
        int[] saveNum = new int[6];

        for (int i=1; i<=num; i++){
            Collections.shuffle(lottoNum);
            numArr[i-1][0]= 64+i;
            //System.out.print(ch+"    ");
            for (int j=0; j<6; j++){
                if (i==num){break;}
                numArr[i][j] = lottoNum.get(j);
//                if (j==5){
//                    System.out.print(lottoNum.get(j));
//                } else {
//                    System.out.print(lottoNum.get(j) +",");
//                }
            }
            System.out.println();
        }
        for (int i=0; i<num; i++){
            Collections.shuffle(lottoNum);
            saveNum[i] = lottoNum.get(i);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Main lottoMine = new Main();

        System.out.println("[로또 당첨 프로그램]");
        System.out.print("\n로또 개수를 입력해 주세요.(숫자 1~10):");
        int num = sc.nextInt();
        lottoMine.myNum(num);
        System.out.println("[로또 발표]");



    }
}
