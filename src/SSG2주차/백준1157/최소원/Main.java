package SSG2주차.백준1157.최소원;
import java.util.*;

public class Main {

    public static char printResult(String str) {
        char result = ' ';
        int max = Integer.MIN_VALUE;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()) {

            if(ch>=97)
                ch = (char)(ch-32);

            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(int i: map.values()) {
            max = Math.max(max, i);
        }

        for(char ch: map.keySet()) {
            if(map.get(ch)==max) {
                if(count!=0)
                    result = '?';
                else
                    result = ch;
                count++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(printResult(str));

    }
}
