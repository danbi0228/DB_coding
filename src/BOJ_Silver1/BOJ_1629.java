package BOJ_Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1629 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println(pow(A, B, C));
    }

    public static long pow(int A, int B, int C) {
        if (B == 0) {
            return 1;
        }

        long N = pow(A, B / 2, C);
        if (B % 2 == 0) {
            return N * N % C;
        }else {
            return (N * N % C) * A % C;
        }
    }
}
