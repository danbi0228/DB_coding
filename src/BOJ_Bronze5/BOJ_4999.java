package BOJ_Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4999 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jh = br.readLine();
        String doctor = br.readLine();

        if(jh.length() >= doctor.length()){
            System.out.println("go");
        }else{
            System.out.println("no");
        }
    }
}
