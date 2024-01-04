package SSG4주차.가상_대선_당선_시뮬레이션_프로그램.이인서;

import java.util.Random;

public class Main { //method 분리
    public static void voting(int MAX_VOTE, int[] voteCount){
        Random random = new Random();
        int vote;
        for (int i=0; i<MAX_VOTE; i++){
            vote= random.nextInt(4);
            voteCount[vote]++; //if문 제거
        }
    }
    public static void printResult(String[] name, int[] voteCount){
        String nameFinal=name[0];
        int big=voteCount[0];
        //27번 줄 big 이라는 변수 초기값을 voteCount 0번 인덱스로 초기화했는데 반복문을 0번부터 할 필요가 없어보여요
        //출력 4번 하려고 0번부터 한거라 1부터 시작하면 3줄만 출력돼요.
        for (int i=0; i<4; i++){
            if (big<voteCount[i]){
                big=voteCount[i];
                nameFinal=name[i];
            }
            System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", i+1, name[i],(float) voteCount[i]/100,voteCount[i]);
        }
        System.out.println("투표결과 당선인: "+nameFinal);
    }
    public static void main(String[] args) {

        String[] name = new String[]{"이재명", "윤석열", "심상정", "안철수"};
        int MAX_VOTE = 10000;
        int[] voteCount = new int[4];

        voting(MAX_VOTE, voteCount);
        printResult(name, voteCount);
    }
}






