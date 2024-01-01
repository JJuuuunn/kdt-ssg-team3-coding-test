package SSG4주차.백준1085.최소원;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Map<Integer, Integer> map = new HashMap<>();
    static ArrayList<Integer> cardNumber = new ArrayList<>();

    public static void inputOwnNum() {
        int ownNum = sc.nextInt();

        for(int i=0; i<ownNum; i++) {
            int number = sc.nextInt();
            map.put(i,number);
        }
    }

    public static void cardNum() {
        int compareCount = sc.nextInt();

        for(int compare = 0; compare<compareCount; compare++) {
            int num = sc.nextInt();
            cardNumber.add(num);
        }
    }

    //public static ArrayList<Integer> compareNum(){;}
    public static void compareNum() {
        int length = cardNumber.size();

        for(int i=0; i<length; i++) {
            if(map.containsValue(cardNumber.get(i)))
               cardNumber.set(i,1);
            else
                cardNumber.set(i,0);
        }

        for(int i=0; i<cardNumber.size(); i++) {
            System.out.print(cardNumber.get(i) + " ");
        }

/*        String[] result = cardNumber.toString().replace("["," ").replace("]"," ").split(",");
        System.out.println(Arrays.toString(result));
*/
        //괄호와 ,를 제외하고 한 번에 배열을 출력할 수 있는 방법을 찾아보자


    }



    public static void main(String[] args) {

        inputOwnNum();
        cardNum();
        compareNum();
    }
}
