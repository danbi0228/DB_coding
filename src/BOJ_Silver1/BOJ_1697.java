package BOJ_Silver1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1697 {
    static int[] visit;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        visit = new int[100001];

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println("0");
            return;
        }

        bfs(N, K);
        System.out.println(visit[K]);
    }

    public static void bfs(int A, int K) {
        Queue<Integer> queue = new LinkedList<>();
        visit[A] = 0;
        queue.offer(A);

        while (!queue.isEmpty()) {
            int X = queue.poll();
            if (visit[K] != 0) {
                break;
            }

            if (X - 1 >= 0 && visit[X - 1] == 0) {
                queue.offer(X - 1);
                visit[X - 1] = visit[X] + 1;
            }
            if ((X < visit.length - 1) && visit[X + 1] == 0) {
                queue.offer(X + 1);
                visit[X + 1] = visit[X] + 1;
            }
            if ((X * 2 < visit.length) && visit[2 * X] == 0) {
                queue.offer(2 * X);
                visit[2 * X] = visit[X] + 1;
            }
        }
    }
}
