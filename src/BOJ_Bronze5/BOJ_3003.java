package BOJ_Bronze5;

import java.util.Scanner;

public class BOJ_3003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int A = 1, B = 1, C = 2, D = 2, E = 2, F = 8;   // 킹,퀸,룩,비숍,나이트,폰

        System.out.print(A - a +" ");
        System.out.print(B - b +" ");
        System.out.print(C - c +" ");
        System.out.print(D - d +" ");
        System.out.print(E - e +" ");
        System.out.print(F - f);

//		int a[] = { 1, 1, 2, 2, 2, 8 }; // 체스-킹,퀸,룩,비숍,나이트,폰
//		int b[] = new int[6]; // 발견한 체스
//
//		for (int i = 0; i < a.length; i++) {
//			b[i] = sc.nextInt();
//		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i] - b[i] + " ");
//		}

    }
}
