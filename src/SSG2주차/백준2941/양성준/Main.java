package SSG2주차.백준2941.양성준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z=", " ");

        System.out.println(str.length());
    }
}
