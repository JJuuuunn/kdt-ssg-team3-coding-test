package SSG3주차.연소득_과세금액_계산.양성준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static final int[] AMOUNT_RANGE = { 0, 12_000_000, 46_000_000, 88_000_000, 150_000_000, 300_000_000, 500_000_000, 1_000_000_000 };
    public static final int[] RATE = { 6, 15, 24, 35, 38, 40, 42, 45 };
    public static final int[] PROGRESSIVE = { 0, 1_080_000, 5_220_000, 14_900_000, 19_400_000, 19_400_000, 25_400_000, 35_400_000, 65_400_000 };

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("[과세금액 계산 프로그램]");
        System.out.print("연소득을 입력해 주세요.:");
        long annualIncome = Long.parseLong(br.readLine());

        long rateResult = getTax(annualIncome);
        long progressive = getProgressive(annualIncome);

        System.out.printf("[세율에 의한 세금]:\t\t %15d\n", rateResult);
        System.out.printf("[누진공제 계산에 의한 세금]:\t %15d", progressive);
    }

    // 세율에 의한 세금 계산
    public static long getTax (long annualIncome) {
        long totalTax = 0L;

        for(int i = 0; annualIncome > 0 ; i++) {
            long taxBase;

            if(i == AMOUNT_RANGE.length - 1) { // 최종 과세 표준 금액인 1,000,000,000원을 초과하는 경우
                taxBase = annualIncome;
            } else {
                int taxationRange = AMOUNT_RANGE[i + 1] - AMOUNT_RANGE[i]; // 과세 금액 범위
                taxBase = annualIncome > taxationRange ? taxationRange : annualIncome;
            }
            annualIncome -= taxBase;

            System.out.printf("%10d * %2d%% = %10d\n", taxBase , RATE[i] , taxBase / 100 * RATE[i]);
            totalTax += taxBase / 100 * RATE[i];
        }

        return totalTax;
    }

    // 누진 공세에 의한 세금 계산
    public static Long getProgressive(long yearAmount) {
        if(yearAmount <= AMOUNT_RANGE[1]) return calculate(yearAmount, 0);
        else if ( yearAmount <= AMOUNT_RANGE[2]) return calculate(yearAmount, 1);
        else if ( yearAmount <= AMOUNT_RANGE[3]) return calculate(yearAmount, 2);
        else if ( yearAmount <= AMOUNT_RANGE[4]) return calculate(yearAmount, 3);
        else if ( yearAmount <= AMOUNT_RANGE[5]) return calculate(yearAmount, 4);
        else if ( yearAmount <= AMOUNT_RANGE[6]) return calculate(yearAmount, 5);
        else if ( yearAmount <= AMOUNT_RANGE[7]) return calculate(yearAmount, 6);
        else return calculate(yearAmount, 7);
    }

    private static long calculate(long yearAmount, int idx) {
        return yearAmount / 100 * RATE[idx] - PROGRESSIVE[idx];
    }

}

