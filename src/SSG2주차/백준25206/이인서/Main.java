package SSG2주차.백준25206.이인서;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double finalGrade=0, midGrade=0, sumGrade=0, classPoint=0;

        for (int i=0; i<20; i++) {
            String className = sc.next(); //사용X
            double point = sc.nextDouble();//2번째 값 입력
            String grade = sc.next(); //학점 입력

            if (grade.equals("A+")) {//등급당 과목평점 midGrade에 저장
                midGrade = point * 4.5;
            } else if (grade.equals("A0")) {
                midGrade = point * 4.0;
            } else if (grade.equals("B+")) {
                midGrade = point * 3.5;
            } else if (grade.equals("B0")) {
                midGrade = point * 3.0;
            } else if (grade.equals("C+")) {
                midGrade = point * 2.5;
            } else if (grade.equals("C0")) {
                midGrade = point * 2.0;
            } else if (grade.equals("D+")) {
                midGrade = point * 1.5;
            } else if (grade.equals("D0")) {
                midGrade = point * 1.0;
            } else if (grade.equals("F")) {
                midGrade = point * 0.0;
            } else if (grade.equals("P")) {
                continue;
            }

            sumGrade += midGrade;
            classPoint+=point;
        }
        finalGrade = sumGrade/classPoint;
        System.out.println(finalGrade);
    }
}
