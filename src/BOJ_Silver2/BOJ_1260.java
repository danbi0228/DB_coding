package BOJ_Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1260 {
    static StringBuilder sb = new StringBuilder();
    static int N, M, V;
    static boolean[] visit;
    static int[][] arr;
    static StringTokenizer st;
    static Queue<Integer> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr = new int[N + 1][N + 1];
        visit = new boolean[N + 1];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            arr[A][B] = arr[B][A] = 1;
        }
        dfs(V);
        sb.append("\n");
        visit = new boolean[N + 1];

        bfs(V);
        System.out.println(sb);
    }

    public static void dfs(int start) {
        visit[start] = true;
        sb.append(start + " ");

        for(int i=0; i<=N; i++) {
            if (arr[start][i] == 1 && !visit[i]) {
                dfs(i);
            }
        }
    }
    public static void bfs(int V) {
        queue.add(V);
        visit[V] = true;

        while (!queue.isEmpty()) {
            V = queue.poll();
            sb.append(V + " ");

            for(int i=1; i<=N; i++) {
                if (arr[V][i] == 1 && !visit[i]) {
                    queue.add(i);
                    visit[i] = true;
                }
            }
        }
    }
}
