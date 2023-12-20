package SSG2주차.백준25206.최소원;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalMajorScore = 0.0; //전공과목별 합(학점 x 과목평점)
        double totalCredit = 0.0; //학점의 총합
        double avgScore = 0.0; //전공평점

        for(int i = 0; i<20; i++) {
            String majorName = sc.next();
            double credit = sc.nextDouble();
            String grade = sc.next();
            double subGrade=0.0;

            switch(grade) {
                case "A+" : {subGrade = 4.5; break;}
                case "A0" : {subGrade = 4.0; break;}
                case "B+" : {subGrade = 3.5; break;}
                case "B0" : {subGrade = 3.0; break;}
                case "C+" : {subGrade = 2.5; break;}
                case "C0" : {subGrade = 2.0; break;}
                case "D+" : {subGrade = 1.5; break;}
                case "D0" : {subGrade = 1.0; break;}
                case "F" : {subGrade = 0.0; break;}
                default : {credit = 0; }
            }
            totalMajorScore += (credit*subGrade);
            totalCredit += credit;
        }

        avgScore = totalMajorScore/totalCredit;
        System.out.println(String.format("%.6f", avgScore));
    }
}
