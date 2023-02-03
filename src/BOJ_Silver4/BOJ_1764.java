package BOJ_Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int D = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        HashSet<String> hs = new HashSet<>();
        List<String> list = new ArrayList<>();

        for(int i=0; i<D; i++){
            hs.add(br.readLine());
        }
        for(int i=0; i<B; i++){
            String s = br.readLine();
            if(hs.contains(s)){
                list.add(s);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
