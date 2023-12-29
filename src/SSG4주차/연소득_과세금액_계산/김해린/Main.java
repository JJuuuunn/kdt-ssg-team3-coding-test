package SSG4주차.연소득_과세금액_계산.김해린;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static int[] taxBase = {12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000};
    static int[] taxBaseSection = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000}; //과세 표준 구간
    static int[] deduction = {0, 1080000, 5220000, 14900000, 19400000, 25400000, 35400000, 65400000};
    static int[] taxRate = {6, 15, 24, 35, 38, 40, 42, 45};
    static boolean flag = false;

    public static void main(String[] args) {
        int tax = 0;

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.: ");
        int annualIncome = in.nextInt();

        calcTax_Rate(annualIncome);
        calcTax_deduction(annualIncome);

    }

    public static void calcTax_Rate(int annualIncome) {
        int temp = annualIncome;
        ArrayList<Integer> taxList = new ArrayList<>();
        int index = 0; int taxResultTotal = 0;


        for(int i = 0; temp > 0; i++) {
            if(i >= 7){ //만약 i가 7보다 크다면 ---> 10억이상 일 때
                if(temp > 0) { //10억 이상일 때 temp 즉, 남아 있는 돈이 0보다 크다면
                    taxList.add(temp); //리스트에 현재 남아 있는 돈을 넣어줌
                    break;
                }
            }
            else if(temp > taxBaseSection[i]) { //입력 받은 값이 과세 표준 구간을 넘는 값이라면
                taxList.add(taxBaseSection[i]); //리스트에 해당 범위를 추가
                temp -= taxBaseSection[i]; //입력받은 값에서 해당 범위의 값을 빼줌
            }
            if(temp <= taxBase[0]) { //입력받은 값이 12000000보다 작거나 같다면
                taxList.add(temp); //리스트에 입력받은 값 넣어줌
                break;
            }
        }

        for(int i = 0; i < taxList.size(); i++) {
            int taxResult = taxList.get(i) / 100 * taxRate[i]; //리스트에 있는 값 하나씩 꺼내와 세율에 의한 세금 계산
            taxResultTotal += taxResult;
            System.out.printf("%10d * %3d%% = %10d\n", taxList.get(i), taxRate[i], taxResult);
        }
        System.out.printf("\n[세율에 의한 세금]: %18d\n", taxResultTotal);
    }

    public  static void calcTax_deduction(int annualIncome) {
        int deductionResult = 0;
        for(int i = 0; i < taxBase.length; i++) {
            if(annualIncome <= taxBase[i]) { //과세표준보다 입력받은 값이 작거나 같다면
                deductionResult = annualIncome / 100 * taxRate[i] - deduction[i];
                break;
            }
            else if (annualIncome > taxBase[6]) { //입력받은 값이 10억(과세표준)보다 크다면
                deductionResult = annualIncome / 100 * taxRate[7] - deduction[7];
                break;
            }
        }
        System.out.printf("[누진공제 계산에 의한 세금]: %11d\n", deductionResult);

    }
}
