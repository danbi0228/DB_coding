package BOJ_Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int cnt = 1;
        int num = 10;

        for(int i=1; i<=N; i++) {
            if(i % num == 0) {
                cnt++;
                num *= 10;
            }
            result += cnt;
        }
        System.out.println(result);
    }
}
