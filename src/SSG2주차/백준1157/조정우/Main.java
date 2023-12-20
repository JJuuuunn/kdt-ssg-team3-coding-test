package SSG2주차.백준1157.조정우;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> objMapLookup = new HashMap<>();
        String stringEntered = sc.nextLine();
        for (int idxStringEntered = 0; idxStringEntered < stringEntered.length(); idxStringEntered++) {
            char elRaw = stringEntered.charAt(idxStringEntered);
            char el = Character.toUpperCase(elRaw);
            objMapLookup.put(el, objMapLookup.getOrDefault(el, 0) + 1);
        }
        List<Character> listAnswer = new ArrayList<>();
        int trackerValueMax = -1;
        for (char keyObjMapLookup : objMapLookup.keySet()) {
            int value = objMapLookup.get(keyObjMapLookup);
            trackerValueMax = Math.max(trackerValueMax, value);
        }
        for (char keyObjMapLookup : objMapLookup.keySet()) {
            int value = objMapLookup.get(keyObjMapLookup);
            if (value == trackerValueMax) {
                listAnswer.add(keyObjMapLookup);
            }
        }
        int sizeListAnswer = listAnswer.size();
        if (sizeListAnswer > 1) {
            System.out.print("?");
        } else {
            if (sizeListAnswer != 0) {
                System.out.printf("%c", listAnswer.get(0));
            }
        }
        sc.close();
    }
}