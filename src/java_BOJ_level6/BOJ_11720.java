package java_BOJ_level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String b = sc.next();
        sc.close();

        int sum = 0;

        for(int i=0; i<a; i++){
            sum += b.charAt(i)-'0';
        }
        System.out.println(sum);

    }
}
