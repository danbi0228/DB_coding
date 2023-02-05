package BOJ_Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10797 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int day = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<5; i++){
            int num = Integer.parseInt(st.nextToken());
            if(day == num){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
