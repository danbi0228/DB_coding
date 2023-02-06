package BOJ_Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int multi = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        String s = String.valueOf(multi);

        for(int i=0; i<s.length(); i++){
            arr[(s.charAt(i)-48)]++;
        }

        for(int a : arr){
            System.out.println(a);
        }
    }
}
