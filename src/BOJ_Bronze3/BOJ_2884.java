package BOJ_Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2884 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int h = Integer.parseInt(st.nextToken()); // 시, [0, 23]
        int m = Integer.parseInt(st.nextToken()); // 분, [0, 59]

        if (m < 45) { // 45분보다 작을 때 (10:10 - 0:45)
            h--;
            m = 60 - (45 - m);
            if (h < 0) {
                h = 23;
            }
            System.out.println(h + " " + m);
        } else { // 45분보다 클 때
            System.out.println(h + " " + (m - 45));
        }

//		Scanner sc = new Scanner(System.in);
//
//		int a = sc.nextInt(); // 시
//		int b = sc.nextInt(); // 분
//
//		if (b < 45) {
//			a--;
//			b = 60 - (45 - b);
//			if (a < 0) {
//				a = 23;
//			}
//			System.out.println(a + " " + b);
//		} else {
//			System.out.println(a + " " + (b - 45));
//		}
//
//		sc.close();
    }
}
