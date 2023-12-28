package SSG3주차.가상_대선_당선_시뮬레이션_프로그램.이인서;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] name = new String[]{"이재명", "윤석열", "심상정", "안철수"};
        int vote;
        int[] voteCount = new int[4];
        for (int i=0; i<10000; i++){
            vote= random.nextInt(4);
            if (vote==0) {
                voteCount[0]+=1;
            } else if (vote==1) {
                voteCount[1]+=1;
            } else if (vote==2) {
                voteCount[2]+=1;
            } else if (vote==3) {
                voteCount[3]+=1;
            }
        }

        String nameFinal=name[0];
        int big=voteCount[0];
        for (int i=0; i<4; i++){
            if (big<voteCount[i]){
                big=voteCount[i];
                nameFinal=name[i];
            }
            System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", i+1, name[i],(float) voteCount[i]/100,voteCount[i]);
        }
        System.out.println("투표결과 당선인: "+nameFinal);
    }
}






