package java_BOJ_level11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int num = 1;

        for (int i = N; i >= 1; i--) {
            num *= i;
        }
        System.out.println(num);
    }

//    다른 풀이 - 재귀귀
//   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//	    int N = Integer.parseInt(br.readLine());
//      int sum = factorial(N);
//		System.out.println(sum);
//
//	public static int factorial(int N) {
//		if(N <= 1) return 1;
//		return N * factorial(N - 1);
//	}
}
