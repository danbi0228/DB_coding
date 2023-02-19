package BOJ_Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10871 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            if(a[i] < x) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
