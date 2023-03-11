package BOJ_Silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_15657 {
    public static int N, M;
    public static int[] arr;
    public static int[] result;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb);
    }

    public static void dfs(int start, int depth) {
        if (M == depth) {
            for(int i=0; i<M; i++) {
                sb.append(result[i] + " ");
            }
            sb.append("\n");
            return;
        }
        for(int i=start; i<N; i++) {
            result[depth] = arr[i];
            dfs(i, depth + 1);
        }
    }
}
