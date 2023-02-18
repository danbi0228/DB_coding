package BOJ_Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int first = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N; i++) {
            int ring = Integer.parseInt(st.nextToken());
            int gcd = gcd(first, ring);
            System.out.println((first/gcd) + "/" + (ring/gcd));
        }
    }

    static int gcd(int a, int b) {
        int r;

        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
