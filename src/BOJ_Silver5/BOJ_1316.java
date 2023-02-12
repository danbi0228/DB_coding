package BOJ_Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = N;

        for(int i=0; i<N; i++) {
            String s = br.readLine();
            for(int j=1; j<s.length(); j++) {
                if(s.indexOf(s.charAt(j - 1)) > s.indexOf(s.charAt(j))) {
                    cnt--;
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
