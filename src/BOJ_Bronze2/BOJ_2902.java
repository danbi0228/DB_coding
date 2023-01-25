package BOJ_Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2902 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("-");

        for(int i=0; i<s.length; i++){
            s[i] = s[i].substring(0, 1);
            System.out.print(s[i]);
        }
    }
}
