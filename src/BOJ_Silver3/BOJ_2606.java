package BOJ_Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2606 {
    static int map[][];
    static boolean visit[];
    static int N, M, V;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        V = 1;
        map = new int[N+1][N+1];
        visit = new boolean[N+1];

        for(int i=0; i<M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            map[A][B] = map[B][A] = 1;
        }
        System.out.println(dfs(1));
    }

    public static int dfs(int i) {
        visit[i] = true;

        for(int j=1; j<=N; j++) {
            if (map[i][j] == 1 && visit[j] == false) {
                cnt++;
                dfs(j);
            }
        }
        return cnt;
    }
}
