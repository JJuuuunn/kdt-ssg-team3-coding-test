package SSG2주차.백준3003.김해린;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int[] corretPieceArr = {1, 1, 2, 2, 2, 8}; //6개의 피스 각 개수 배열로 나타냄

        for(int i = 0; i < corretPieceArr.length; i++) {
            System.out.println(corretPieceArr[i] - in.nextInt()); //원래 피스의 개수에서 찾은 피스의 개수를 빼서 더 찾아야 하는 피스와 빼야 하는 피스를 출력
        }

    }
}
