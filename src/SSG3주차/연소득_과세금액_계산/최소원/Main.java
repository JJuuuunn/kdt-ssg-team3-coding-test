package SSG3주차.연소득_과세금액_계산.최소원;
import java.util.*;

public class Main {
    static List<int[]> list = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax = 0;
        /*int[] taxStandard = {0,12000000,46000000,88000000,150000000,300000000,500000000};
        int[] taxStandard2 = {12000000,46000000,88000000,150000000,300000000,500000000,1000000000};
        int[] taxDeduction = {0, 1080000,5220000,14900000,19400000,25400000,35400000,65400000};*/
        int[] taxStandard3 = {0,12000000,46000000,88000000,150000000,300000000,500000000,1000000000};


        //index8까지
        double[] taxRate = {0.06,0.15,0.24,0.35,0.38,0.40,0.42,0.45};

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        int yearEarn = sc.nextInt();
        int calcYearEarn = yearEarn;
        int totaltax = 0;   //세금총합
        int deduction=0; //누진공제

        for(int i=0; i<taxStandard3.length-1; i++) {
            if(yearEarn>=taxStandard3[i+1]) {
                int sub = taxStandard3[i+1] - taxStandard3[i];
                calcYearEarn -= sub;
                totaltax += (int)(sub*taxRate[i]);
                System.out.printf("%10d * %3d%% = \t%11d\n",sub,(int)(taxRate[i]*100),(int)(sub*taxRate[i+1]));

                if((i==taxStandard3.length-2)&&yearEarn >= taxStandard3[taxStandard3.length-1]) {
                    totaltax += (int)(calcYearEarn*taxRate[i+1]);
                    System.out.printf("%10d * %3d%% = \t%11d\n",calcYearEarn, (int)(taxRate[i+1]*100), (int)(calcYearEarn*taxRate[i+1]));
                    break;
                }

            }else{
                totaltax += (int)(calcYearEarn*taxRate[i]);
                System.out.printf("%10d * %3d%% = \t%11d\n",calcYearEarn, (int)(taxRate[i]*100), (int)(calcYearEarn*taxRate[i]));
                break;
            }

        }



        /*for(int i=0; i<taxStandard.length; i++) {
            if(yearEarn>=taxStandard2[i]) {
                int sub = taxStandard2[i] - taxStandard[i];
                calcYearEarn -= sub;
                totaltax += (int)(sub*taxRate[i]);
                System.out.printf("%10d * %3d%% = \t%11d\n",sub,(int)(taxRate[i]*100),(int)(sub*taxRate[i]));
            }else {
                totaltax += (int)(calcYearEarn*taxRate[i]);
                System.out.printf("%10d * %3d%% = \t%11d\n",calcYearEarn, (int)(taxRate[i]*100), (int)(calcYearEarn*taxRate[i]));
                break;
            }
        }*/

      /*  for(int i=0; i<taxStandard.length; i++) {
            if(yearEarn>=taxStandard[i]&&yearEarn<=taxStandard2[i])
        }*/

        System.out.printf("\n[세율에 의한 세금]:\t\t\t%d",totaltax);
        System.out.println();
    }

}
