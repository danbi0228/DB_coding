package BOJ_Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int nums;

        for(int i=0; i<N; i++){
            nums = Integer.parseInt(st.nextToken());
            for(int j=2; j<=nums; j++){
                if(j == nums){
                    cnt++;
                }
                if(nums % j == 0){
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
