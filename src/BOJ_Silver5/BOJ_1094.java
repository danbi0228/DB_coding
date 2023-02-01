package BOJ_Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int cnt = 0;
        int rod = 64;

        while (X > 0) {
            if(rod > X) {
                rod /= 2;
            }else {
                cnt++;
                X -= rod;
            }
        }
        System.out.println(cnt);
    }
}
