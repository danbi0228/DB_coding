package BOJ_Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1932 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] num = new int[N][];

        for(int i=0; i<N; i++) {
            num[i] = new int[i + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            for(int j=0; j<=i; j++) {
                num[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=N-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                num[i - 1][j] += Math.max(num[i][j], num[i][j + 1]);
            }
        }

        System.out.println(num[0][0]);
    }
}
