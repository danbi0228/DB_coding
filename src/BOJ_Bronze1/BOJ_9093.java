package BOJ_Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            while (st.hasMoreTokens()){
                sb.append(new StringBuilder(st.nextToken()).reverse().toString()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
