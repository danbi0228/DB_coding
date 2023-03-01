package BOJ_Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BOJ_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new LinkedList<>();

        int X = 0;

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push_front" : {
                    X = Integer.parseInt(st.nextToken());
                    deque.addFirst(X);
                    break;
                }

                case "push_back" : {
                    X = Integer.parseInt(st.nextToken());
                    deque.addLast(X);
                    break;
                }

                case "pop_front" : {
                    if(deque.isEmpty()) {
                        sb.append(-1 + "\n");
                    }else {
                        sb.append(deque.pollFirst() + "\n");
                    }
                    break;
                }

                case "pop_back" : {
                    if(deque.isEmpty()) {
                        sb.append(-1 + "\n");
                    }else {
                        sb.append(deque.pollLast() + "\n");
                    }
                    break;
                }

                case "size" : {
                    sb.append(deque.size() + "\n");
                    break;
                }

                case "empty" : {
                    if(deque.isEmpty()) {
                        sb.append(1 + "\n");
                    }else {
                        sb.append(0 + "\n");
                    }
                    break;
                }

                case "front" : {
                    if(deque.isEmpty()) {
                        sb.append(-1 + "\n");
                    }else {
                        sb.append(deque.peekFirst() + "\n");
                    }
                    break;
                }

                case "back" : {
                    if(deque.isEmpty()) {
                        sb.append(-1 + "\n");
                    }else {
                        sb.append(deque.peekLast() + "\n");
                    }
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
