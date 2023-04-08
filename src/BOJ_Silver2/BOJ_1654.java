package BOJ_Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];

        for(int i=0; i<K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        long high = arr[K-1];
        long low = 1;
        long cnt, mid;

        while (high >= low) {
            cnt = 0;
            mid = (low + high) / 2;

            for(int i=0; i<K; i++) {
                cnt += arr[i] / mid;
            }

            if (N > cnt) {
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }
        System.out.println(high);
    }
}
