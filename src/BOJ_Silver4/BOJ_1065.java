package BOJ_Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=1; i<=N; i++) {
            if(i < 100) {
                cnt++;
            }else {
                int a = i / 100;
                int b = (i % 100) / 10;
                int c = (i % 100) % 10;

                if(a - b == b - c) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
