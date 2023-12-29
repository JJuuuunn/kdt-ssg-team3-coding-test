package SSG4주차.가상_대선_당선_시뮬레이션_프로그램.김소진;

public class Main {
    public static void main(String[] args) {
        String[] candidate = {"이재명", "윤석열", "심상정", "안철수"};
        int[] votes = new int[4];
        //10000번 반복
        for (int i = 1; i <= 10000; i++) {
            //random함수 투표
            int vote = (int)(Math.random()*4+1);
            if(vote == 1){
                votes[0] += 1;
            } else if (vote == 2) {
                votes[1] += 1;
            } else if (vote == 3) {
                votes[2] += 1;
            } else if (vote == 4) {
                votes[3] += 1;
            }
        }

        int max = 0;
        int index = 0;
        //출력for문
        for(int i = 0; i < candidate.length; i++){
            //투표율
            double ratio = (double) votes[i] / 100;
            System.out.printf("[기호 : %d] %s: %.2f%%, (투표수: %d)", (i + 1), candidate[i], ratio, votes[i]);
            System.out.println();
            //당선인
            if(votes[i] > max){
                max = votes[i];
                index = i;
            }
        }
        System.out.printf("[투표결과] 당선인: %s", candidate[index]);
    }
}
