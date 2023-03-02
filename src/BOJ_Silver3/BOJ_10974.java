package BOJ_Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10974 {
    static int N;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N+1];

        String num;
        for(int i=1; i<=N; i++) {
            visited[i] = true;
            num = Integer.toString(i);
            dfs(num, i, 1);
            visited[i] = false;
        }
    }

    public static void dfs(String num, int start, int depth) {
        if(depth >= N) {
            System.out.println(num);
        }else {
            for(int i=1; i<=N; i++) {
                if(!visited[i]) {
                    visited[i] = true;
                    num += " " + i;
                    dfs(num, start, depth+1);
                    num = num.substring(0, num.length()-2);
                    visited[i] = false;
                }
            }
        }
    }
}
