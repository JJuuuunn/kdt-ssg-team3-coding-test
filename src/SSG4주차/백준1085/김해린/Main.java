package SSG4주차.백준1085.김해린;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //이진 탐색: 정렬되어 있는 리스트에서 탐색 범위를 절반씩 좁혀가며 데이터를 탐색하는 방법
        int N = in.nextInt();
        int[] cardN_arr = new int[N];
        for(int i = 0; i < N; i++) {
            cardN_arr[i] = in.nextInt();
        }
        sort(cardN_arr); //이진 탐색을 하기 위해선 오름차순 정렬 필수!


        int M = in.nextInt();
        int[] cardM_arr = new int[M];
        for(int i = 0; i < M; i++) {
            cardM_arr[i] = in.nextInt();
        }

        for(int i = 0; i < cardM_arr.length; i++) {
            System.out.print(binarySearch(cardN_arr, cardM_arr[i], 0, cardN_arr.length-1) + " ");
        }
    }

    public static int binarySearch(int[] nArr, int key, int low, int high){ //재귀함수를 이용해 이진 탐색 구현
        if(low > high) return 0; //값을 찾지 못하면 0리턴
        int mid = (low + high) / 2; //중간값

        if(nArr[mid] == key) return 1; //값을 찾으면 1리턴
        else if(nArr[mid] > key) return binarySearch(nArr, key, low, mid-1); //만약 찾으려는 key값이 중간에 있는 값보다 작다면 배열 뒷쪽 탐색할 필요X
        else return binarySearch(nArr, key, mid+1, high); //만약 찾으려는 key값이 중간에 있는 값보다 크다면 배열 앞쪽 탐색할 필요X

    }
}
