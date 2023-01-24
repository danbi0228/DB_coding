package BOJ_Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String email = br.readLine();

        for(int i=0; i<email.length(); i++){
            email = email.replaceAll("C", "")
                    .replaceAll("A", "")
                    .replaceAll("M", "")
                    .replaceAll("B", "")
                    .replaceAll("R", "")
                    .replaceAll("I", "")
                    .replaceAll("D", "")
                    .replaceAll("G", "")
                    .replaceAll("E", "");
        }
        System.out.println(email);
    }
}
