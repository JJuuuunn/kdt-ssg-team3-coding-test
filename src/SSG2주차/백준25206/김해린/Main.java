package SSG2주차.백준25206.김해린;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //전공평점 ---> 전공과목별 (학점 × 과목평점)의 합 / 학점의 총합
        float[] grade = new float[20]; //길이가 20인 학점 배열
        String[] degree = new String[20]; //길이가 20인 등급 배열
        float gradeTotal = 0.0f; //학점의 총합을 저장해줄 변수
        float GPA = 0.0f; //결과값이 전공평점을 저장해줄 변수


        for(int i = 0; i < 20; i++) {
            String subInfo = in.nextLine(); //문자열 한줄씩 입력 받음

            String[] splitSubInfo = subInfo.split(" "); //한줄로 입력받은 문자열을 띄어쓰기를 기준으로 자른 후 문자열 배열에 넣어줌
            //ex) Database 3.0 C+ ---> splitSubInfo[1] => 3.0, splitSubInfo[2] => C+

            grade[i] = Float.parseFloat(splitSubInfo[1]);
            degree[i] = splitSubInfo[2];

            if(!degree[i].equals("P")) gradeTotal += grade[i]; //학점의 총합 구하기(등급이 P인 과목은 계산에서 제외)
        }

        GPA = calcGradeToTal(grade, degree); //전공과목별 (학점*과목평점)합

        GPA /= gradeTotal; //전공평점 구하기
        System.out.println(GPA);

    }

    public static float calcGradePoint(String d) { //등급에 따른 과목 평점 구하는 메서드
//        float degreePoint = switch (d) { //원래 람다식으로 구현했는데 백준은 java11버전을 사용해서 사용 불가(람다식 사용 이유? 불필요힌 코드를 줄여 가독성을 높일 수 있고 break문을 사용하지 않아도 돼서 실수할 일이 줄어듬)
//            case "A+" -> 4.5f;
//            case "A0" -> 4.0f;
//            case "B+" -> 3.5f;
//            case "B0" -> 3.0f;
//            case "C+" -> 2.5f;
//            case "C0" -> 2.0f;
//            case "D+" -> 1.5f;
//            case "D0" -> 1.0f;
//            default -> 0.0f;
//        };

        float degreePoint = 0.0f;

        switch (d) {
            case "A+":
                degreePoint = 4.5f;
                break;
            case "A0":
                degreePoint = 4.0f;
                break;
            case "B+":
                degreePoint = 3.5f;
                break;
            case "B0":
                degreePoint = 3.0f;
                break;
            case "C+":
                degreePoint = 2.5f;
                break;
            case "C0":
                degreePoint = 2.0f;
                break;
            case "D+":
                degreePoint = 1.5f;
                break;
            case "D0":
                degreePoint = 1.0f;
                break;
            default:
                return 0.0f;
        }

        return degreePoint;
    }

    public static float calcGradeToTal(float[] grade, String[] degree) { //전공과목별 (학점*과목평점)합 구하는 메서드
        float GPA = 0.0f;
        for(int i = 0; i < grade.length; i++) {
            GPA += grade[i] * calcGradePoint(degree[i]);
        }
        return GPA;
    }
}
