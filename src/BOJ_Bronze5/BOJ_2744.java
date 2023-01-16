package BOJ_Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String st = "";

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLowerCase(c)){
                st += Character.toUpperCase(c);
            }else {
                st += Character.toLowerCase(c);
            }
        }
        System.out.println(st);
    }
}
