package BOJ_Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        int last = 0;

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push" :
                    last = Integer.parseInt(st.nextToken());
                    queue.offer(last);
                    break;
                case "pop" :
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    }else {
                        sb.append(queue.poll() + "\n");
                    }
                    break;
                case "size" :
                    sb.append(queue.size() + "\n");
                    break;
                case "empty" :
                    if(queue.isEmpty()) {
                        sb.append(1 + "\n");
                    }else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "front" :
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    }else {
                        sb.append(queue.peek() + "\n");
                    }
                    break;
                case "back" :
                    if(queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    }else {
                        sb.append(last + "\n");
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}