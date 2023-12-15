package 조정우;

import java.util.*;
import java.util.stream.IntStream;

public class jungol9074 {
    public static void main(String[] args) {
        // Scanner 객체 선언 및 초기화
        Scanner sc = new Scanner(System.in);

        // 입력된 숫자의 빈도수를 체크해주는 Lookup Map 컬렉션
        Map<Integer, Integer> objMapLookup = new HashMap<>();
        while(true) {
            int keyEntered = sc.nextInt();

            // 종료 조건 : 1 이상 10 미만이 아닌 수가 입력되었을 때
            if(!(keyEntered >= 1 && keyEntered <= 10)) {
                break;
            }

            // Lookup Map 컬렉션에 빈도수 저장
            int countByKey = objMapLookup.getOrDefault(keyEntered, 0);
            objMapLookup.put(keyEntered, ++countByKey);
        }

        // Lookup Map 컬렉션의 키를 배열로 바꾸고 오름차순 정렬
        Object[] arrKey = objMapLookup.keySet().toArray();
        Arrays.sort(arrKey);

        // Lookup Map 컬렉션의 빈도수를 루프를 순회하며 출력
        int lenArrKey = arrKey.length;
        IntStream.range(0, lenArrKey).forEach(i -> {
            int key = (int) arrKey[i];
            System.out.printf("%d : %d개", key, objMapLookup.get(key));
            if(i < lenArrKey - 1) {
                System.out.println();
            }
        });

        // Scanner 객체 리소스 해제
        sc.close();
    }
}
