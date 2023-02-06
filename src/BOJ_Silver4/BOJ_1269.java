package BOJ_Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        HashSet<Integer> hs = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<A; i++) {
            hs.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<B; i++) {
            int numB = Integer.parseInt(st.nextToken());
            if(hs.contains(numB)) {
                hs.remove(numB);
            } else {
                hs.add(numB);
            }
        }
        System.out.println(hs.size());
    }
}