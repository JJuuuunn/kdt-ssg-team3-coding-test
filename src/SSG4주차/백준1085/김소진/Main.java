package SSG4주차.백준1085.김소진;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = 0;
        N = sc.nextInt();
        List<Integer> listN = new ArrayList<>();
        cardNumberAdd(listN, N);

        int M = 0;
        M = sc.nextInt();
        List<Integer> listM = new ArrayList<>();
        cardNumberAdd(listM, M);

        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < listM.size(); i++) {
            int result = 0;
            for (int j = 0; j < listN.size(); j++) {
                if (listM.get(i).equals(listN.get(j))) {
                    result = 1;
                }
            }
            resultList.add(i, result);
        }
        System.out.println(resultList);

    }

    public static List<Integer> cardNumberAdd(List<Integer> list, int number) {
        for (int i = 0; i < number; i++) {
            list.add(sc.nextInt());
        }
        return list;
    }
}
