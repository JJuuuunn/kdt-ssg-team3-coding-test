package SSG2주차.백준25206.양성준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 20;

        double total = 0;
        double creditSum = 0;
        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subjectName = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            double grade = ratingBasedOnGrade(st.nextToken());

            if (grade < 0) {
                continue;
            }

            double gpa = credit * grade;
            total += gpa;
            creditSum += credit;
        }

        double totalGpa = Math.round(total / creditSum * 1000000) / 1000000.0;
        System.out.println(totalGpa);
    }

    private static double ratingBasedOnGrade(String credit) {
        switch (credit) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return -1.0; // P 인 과목
        }
    }
}
