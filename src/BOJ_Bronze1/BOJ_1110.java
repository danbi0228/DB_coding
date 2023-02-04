package BOJ_Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int copyN = n;

        while(true){
            n = ((n%10) * 10 + ((n/10) + (n%10)) % 10);
            cnt++;
            if(copyN == n){
                break;
            }
        }

        System.out.println(cnt);
    }
}
