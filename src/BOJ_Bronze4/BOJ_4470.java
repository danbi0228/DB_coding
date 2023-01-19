package BOJ_Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_4470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for(int i=0; i<arr.length; i++){
            arr[i] = br.readLine();
            System.out.println(i+1 + ". " + arr[i]);
        }
    }
}
