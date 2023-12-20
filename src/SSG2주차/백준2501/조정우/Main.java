package SSG2주차.백준2501.조정우;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> listDivisor = new ArrayList<>();
        listDivisor.add(N);
        while (true) {
            boolean canDividedBy2 = N % 2 == 0;
            boolean canDividedBy3 = N % 3 == 0;
            if (canDividedBy2) {
                N = N / 2;
                listDivisor.add(N);
            } else if (canDividedBy3) {
                N = N / 3;
                listDivisor.add(N);
            } else {
                N = 1;
                listDivisor.add(N);
                break;
            }
        }
        listDivisor.sort(Comparator.comparingInt(a -> a));
        int sizeListDivisor = listDivisor.size();
        System.out.print((K - 1) <= sizeListDivisor ? listDivisor.get(K - 1) : 0);
        sc.close();
    }
}
