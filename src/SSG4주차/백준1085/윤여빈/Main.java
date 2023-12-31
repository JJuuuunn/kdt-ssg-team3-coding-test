package SSG4주차.백준1085.윤여빈;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        //그냥 두뇌풀가동해서 if문을 엄청 돌려주었다.... 이게 내 한계..?
        if (w-x>x && h-y>y){
            if(x>y){
                System.out.println(y);
            }else {
                System.out.println(x);
            }
        }
        else if (w-x<x && h-y<y){
            if(w-x>h-y){
                System.out.println(h-y);
            }else{
                System.out.println(w-x);
            }
        }
        else if(w-x>x && h-y<y){
            System.out.println(h-y);
        }else if (w-x<x && h-y>y){
            if (w-x>y){
                System.out.println(y);
            }else{
                System.out.println(w-x);
            }
        }

    }
}
