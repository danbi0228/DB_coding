package BOJ_Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N+1];
        arr[0] = true;
        arr[1] = true;

        for(int i=2; i<=N; i++) {
            if(arr[i] == false) {
                if(i >= M) {
                    System.out.println(i);
                }
                for(int j=i+i; j<=N; j+=i) {
                    arr[j] = true;
                }
            }
        }
    }
}
