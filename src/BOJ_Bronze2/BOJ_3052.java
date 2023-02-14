package BOJ_Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();
        // HashSet<> : 중복되는 경우 하나만 저장, 순서 개념이 없다

        for(int i=0; i<10; i++){
            hs.add(Integer.parseInt(br.readLine()) % 42);
        }

        System.out.println(hs.size());

    }
}
