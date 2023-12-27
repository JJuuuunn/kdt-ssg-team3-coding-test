package SSG3주차.가상_대선_당선_시뮬레이션_프로그램.최소원;
import java.util.*;

public class Main {

    static Map<Integer, Integer> map = new HashMap<>();
    static String[] candidates = {"이재명", "윤석열", "심상정", "안철수"};

    static int percentage = 0;
    //percentage = (double)map.value()/100

    public static void main(String[] args) {

        int count = 0;
        int random=0;
        int max = Integer.MIN_VALUE;
        double voteRate=0.0;
        int presidentIndex = 0;

        while(count<10000) {
            random = (int)(Math.random()*4);
            map.put(random, map.getOrDefault(random,0)+1);  //map의 value값의 default를 0으로 할당해주고 1씩 더해줌.
            //map.put(random.nextInt(4), map.getOrDefault(random,0)+1);
            count++;
        }

        for(int i=0; i<candidates.length; i++) {
            max = Math.max(max, (int)map.get(i));
        }

        for(int i=0; i<map.size(); i++) {
            if((int)map.get(i) == max)
                presidentIndex = i;
        }


        printResult(map, count, random, presidentIndex);
    }

    public static void printResult(Map map, int count, int random, int presidentIndex) {
        int max = Integer.MIN_VALUE;
        System.out.printf("[투표진행율]: %.2f%%, %d명 투표 ==> %s\n", (double)count/100, count, candidates[random]);

        for(int i=0; i<candidates.length; i++) {
            double voteRate = Double.parseDouble(String.valueOf(map.get(i)))/100;
            System.out.printf("[기호:%d] %s: %.2f%%, (투표수: %d)\n", i,candidates[i], voteRate, (int)map.get(i));
        }

        System.out.printf("[투표결과] 당선인: %s" , candidates[presidentIndex]);

    }


}
