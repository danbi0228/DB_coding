package java_BOJ;

import java.util.Scanner;

public class BOJ_2558 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();		// (1)
        int b = sc.nextInt();		// (2)

        System.out.println(a * (b % 10)); 			// b % 10 = 5
        System.out.println(a * (b % 100 / 10));		// b % 100 / 10 = 8
        System.out.println(a * (b / 100));			// b / 100 = 3
        System.out.println(a * b);

//		int a = sc.nextInt();
//		String b = sc.next();
//
//		System.out.println(a * (b.charAt(2) - '0'));
//		System.out.println(a * (b.charAt(1) - '0'));
//		System.out.println(a * (b.charAt(0) - '0'));
//		System.out.println(a * Integer.parseInt(b));

        sc.close();
    }
}
