package SSG3주차.로또_당첨_프로그램.양성준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static List<Integer> lottoNums = new ArrayList<>();
    static List<List<Integer>> lottos;
    static int lottoCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("로또 개수를 입력해 주세요. (숫자 1 ~ 10): ");
        lottoCount = Integer.parseInt(br.readLine()); // 로또 개수

        lottos = new ArrayList<>(); // 마지막 로또는 당첨 번호를 담을 예정

        Random rm = new Random();
        for (int i = 0; i < lottoCount + 1; i++) {
            resetLottoNums(); // 1 ~ 45까지 담기

            List<Integer> lotto = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                lotto.add(lottoNums.remove(rm.nextInt(lottoNums.size())));
            }
            Collections.sort(lotto);
            lottos.add(lotto);

            printLotto(i, lotto);
        }

        compareLotto(); // 로또 당첨 결과 출력하는 메소드
    }

    private static void compareLotto() {
        System.out.println("[내 로또 결과]");
        for (int j = 0; j < lottoCount; j++) {
            List<Integer> lotto = lottos.get(j);
            System.out.printf("%s\t%02d,%02d,%02d,%02d,%02d,%02d => ", (char) (j + 65), lotto.get(0), lotto.get(1), lotto.get(2), lotto.get(3), lotto.get(4), lotto.get(5));

            lotto.retainAll(lottos.get(lottos.size() - 1));
            int cnt = lotto.size();
            System.out.printf("%d개 일치\n", cnt);
        }
    }

    private static void printLotto(int i, List<Integer> lotto) {
        if (i == lottoCount) {
            System.out.println("[로또 발표]");
            System.out.printf("\t%02d,%02d,%02d,%02d,%02d,%02d\n\n", lotto.get(0), lotto.get(1), lotto.get(2), lotto.get(3), lotto.get(4), lotto.get(5));
        } else {
            System.out.printf("%s\t%02d,%02d,%02d,%02d,%02d,%02d\n", (char) (i + 65), lotto.get(0), lotto.get(1), lotto.get(2), lotto.get(3), lotto.get(4), lotto.get(5));
        }
    }

    private static void resetLottoNums() {
        lottoNums.clear();
        for (int j = 1; j <= 45; j++) {
            lottoNums.add(j);
        }
    }
}

