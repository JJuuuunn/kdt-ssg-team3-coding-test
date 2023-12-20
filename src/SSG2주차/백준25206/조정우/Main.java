package SSG2주차.백준25206.조정우;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Map<String, Double> TABLE_SCORE_AVG_BY_GRADE = new HashMap<>(Map.of(
                "A+", 4.5,
                "A0", 4.0,
                "B+", 3.5,
                "B0", 3.0,
                "C+", 2.5,
                "C0", 2.0,
                "D+", 1.5,
                "D0", 1.0,
                "F", 0.0
        ));
        Scanner sc = new Scanner(System.in);
        Map<String, Map<Double, String>> objMapInfoScoreSubjectMajor = new HashMap<>();
        final int LIMIT_MAX_INPUT = 20;
        for (int idxLoop = 0; idxLoop < LIMIT_MAX_INPUT - 1; idxLoop++) {
            String subject = sc.next();
            Map<Double, String> objMapInfoScore = new HashMap<>();
            Double credit = sc.nextDouble();
            String grade = sc.next();
            objMapInfoScore.put(credit, grade);
            objMapInfoScoreSubjectMajor.put(subject, objMapInfoScore);
        }
        double counterCreditTotal = 0.0;
        double counterScoreTotal = 0.0;
        for (String key : objMapInfoScoreSubjectMajor.keySet()) {
            Map<Double, String> objMapInfoScore = objMapInfoScoreSubjectMajor.get(key);
            for (Double keyInner : objMapInfoScore.keySet()) {
                String gradeCurrent = objMapInfoScore.get(keyInner);
                if (!(gradeCurrent.equals("P") || gradeCurrent.equals("F"))) {
                    counterCreditTotal += keyInner;
                    counterScoreTotal += (keyInner * TABLE_SCORE_AVG_BY_GRADE.get(gradeCurrent));
                }
            }
        }
        System.out.printf("%7.6f", counterScoreTotal / counterCreditTotal);
        sc.close();
    }
}
