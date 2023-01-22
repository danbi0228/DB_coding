package BOJ_Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int max = arr[0];
        int idx = 0;

        for(int i=0; i<arr.length; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                arr[i] += Integer.parseInt(st.nextToken());
            }
            if(arr[i] > max){
                max = arr[i];
                idx = i+1;
            }
        }

        System.out.println(idx + " " + max);
    }
}
