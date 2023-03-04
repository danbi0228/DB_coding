package BOJ_Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2480 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 같은 눈 3개
        if ((a == b) && (b == c)) {
            System.out.println(10000 + a * 1000);
            // 같은 눈 2개
        } else if ((a == b && a != c) || (a == c && a != b)) {
            System.out.println(1000 + a * 100);
        } else if (b == c && a != b) {
            System.out.println(1000 + b * 100);
            // 모두 다른 눈
        } else {
            int max = a;
            if (max < b) {
                max = b;
            }
            if (max < c) {
                max = c;
            }
            System.out.println(max * 100);
        }
    }
}
