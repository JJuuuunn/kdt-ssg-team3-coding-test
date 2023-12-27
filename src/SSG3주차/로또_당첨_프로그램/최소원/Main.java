package SSG3주차.로또_당첨_프로그램.최소원;
import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public static void printLotto(int lottoCount) {
        int[][] lottoArray = new int[lottoCount][6];
        int[] lottoResult = new int[6];
        ArrayList<Integer> arrayList;
        Random random = new Random();
        int randomNum = 0;

        for (int lotto = 0; lotto < lottoCount; lotto++) {
            System.out.print((char) (65 + lotto) + "\t");
            arrayList = new ArrayList<>();
            for(int i=1; i<=45; i++) {
                arrayList.add(i);   //arrayList에 1부터 45까지의 로또 번호를 삽입해준다.
            }
            for(int lottoIndex = 0; lottoIndex < 6; lottoIndex++) {
                randomNum = random.nextInt(arrayList.size());
                lottoArray[lotto][lottoIndex] = arrayList.get(randomNum);
                arrayList.remove(randomNum);
            }

            Arrays.sort(lottoArray[lotto]);
            for(int i:lottoArray[lotto])
                System.out.print(i + " ");
            System.out.println();
        }

        System.out.println("\n[로또 발표]");
        System.out.print("\t");

        arrayList = new ArrayList<>();
        for(int i=1; i<=45; i++) {
            arrayList.add(i);
        }

        for (int lottoCol = 0; lottoCol < 6; lottoCol++) {
            randomNum = random.nextInt(arrayList.size());
            lottoResult[lottoCol] = arrayList.get(randomNum);
            arrayList.remove(randomNum);
        }

        Arrays.sort(lottoResult);

        for (int i : lottoResult) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n[내 로또 결과]");

        for(int lottoRow = 0; lottoRow<lottoCount; lottoRow++) {
            int count = 0; //일치한 개수를 할당할 변수 선언
            System.out.print((char)(65+lottoRow)+"\t");
            for(int lottoCol = 0; lottoCol<6; lottoCol++) {
                System.out.print(lottoArray[lottoRow][lottoCol]+" ");
                for(int i=0; i<6; i++) {
                    if(lottoResult[i] == lottoArray[lottoRow][lottoCol]) {
                        count++;
                    }
                }
            }
            System.out.printf(" => %d개 일치\n", count);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("로또 개수를 입력해 주세요.(숫자 1~10):");
        int lottoCount = sc.nextInt();
        printLotto(lottoCount);

    }
}
