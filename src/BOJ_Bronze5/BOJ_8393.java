package BOJ_Bronze5;

import java.util.Scanner;

public class BOJ_8393 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += i; // sum = sum+i;
        }
        System.out.println(sum);
    }
}
