package BOJ_Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2293 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        int[] dp = new int[K + 1];

        dp[0] = 1;

        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            for(int j=arr[i]; j<=K; j++) {
                dp[j] = dp[j] + dp[j - arr[i]];
            }
        }
        System.out.println(dp[K]);
    }
}
