package BOJ_Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] stair = new int[N + 1];
        int[] arr = new int[N + 1];

        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        stair[1] = arr[1];

        if (N >= 2) {
            stair[2] = arr[1] + arr[2];
        }

        for(int i=3; i<=N; i++) {
            stair[i] = Math.max(stair[i-2], stair[i-3] + arr[i-1]) + arr[i];
        }
        System.out.println(stair[N]);
    }
}
