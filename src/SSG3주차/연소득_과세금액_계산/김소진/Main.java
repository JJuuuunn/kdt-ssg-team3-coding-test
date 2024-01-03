package SSG3주차.연소득_과세금액_계산.김소진;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("[과세금액 계산 프로그램]");
        Scanner sc = new Scanner(System.in);
        System.out.print("연소득을 입력해 주세요. : ");
        int income = sc.nextInt(); //연수입
        int tax = 0; //세금계산

        int repeat = 0;
        if(income <= 12000000){
            repeat = 1;
        } else if (income <= 46000000) {
            repeat = 2;
        } else if (income <= 88000000) {
            repeat = 3;
        } else if (income <= 150000000) {
            repeat = 4;
        } else if (income <= 300000000) {
            repeat = 5;
        } else if(income <= 500000000){
            repeat = 6;
        } else if (income <= 1000000000) {
            repeat = 7;
        } else {
            repeat = 8;
        }


        //누진공제
        int[] deduction = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
        //과세표준은 차이
        int[] taxBase = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000, 1000000000};
        //세율
        Double[] tariff = {0.06, 0.15, 0.24, 0.35, 0.38, 0.4, 0.42, 0.45};
//        int[] tariff = {6, 15, 24, 35, 38, 40, 42, 45};


        for(int i = 0; i < repeat; i++){

            System.out.printf("%d * %d%% = %d", taxBase[i], (int) (tariff[i] * 100), (int) (taxBase[i] * tariff[i]));
            System.out.println();
        }

        if(repeat != 1){
            tax = (int) (income * 0.06);
        } else {

        }

        System.out.println(tax);
        //누진공제 계산에 의한 세금 출력
    }
}
/*

 class didid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연 소득을 입력해 주세요.:");
        int income = sc.nextInt();
        int tax =0;
        int index=0;

        if (income<=12000000){index=0;}
        else if (income<=46000000) {index=1;}
        else if (income<=88000000) {index=2;}
        else if (income<=150000000) {index=3;}
        else if (income<=300000000) {index=4;}
        else if (income<=500000000) {index=5;}
        else if (income<=1000000000) {index=6;}
        else {index=7;}

        float[] taxArr = new float[]{0.06F, 0.15F, 0.24F, 0.35F, 0.38F, 0.40F, 0.42F, 0.45F};
        int[] taxChart = new int[]{12000000, 34000000, 42000000, 62000000, 15000000, 200000000, 500000000,1000000000};
        int[] deduction = new int[]{0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};

        if (income>=12000000){ //누적 공제 계산
            tax = (int) (income*taxArr[index])-deduction[index];
        } else {
            tax = (int) (income*0.06);
        }

        int sum=0, taxSum=0;
        //print
        for (int i=0; i<index; i++){
            System.out.printf("%10d * %2d%% = %10d\n", taxChart[i], (int)(taxArr[i]*100), (int)(taxChart[i]*taxArr[i]));
            sum+=taxChart[i];
            taxSum+= (int) (taxChart[i]*taxArr[i]);
        }
        System.out.printf("%10d * %2d%% = %10d\n\n",income-sum, (int)(taxArr[index]*100), (int)((income-sum)*taxArr[index]));
        taxSum+=(int)((income-sum)*taxArr[index]);

        System.out.printf("[세율에 의한 세금]: %10d\n",taxSum);
        System.out.printf("[누진공제 계산에 의한 세금]: %10d",tax);
    }
}
 */