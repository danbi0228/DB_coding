package BOJ_Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int max = 0;
        int idx = 0;
        int[] arr = new int[1001];

        for(int i=0; i<10; i++){
            int N = Integer.parseInt(br.readLine());
            sum += N;
            arr[N]++;
        }
        for(int i=0; i<1001; i++){
            if(max < arr[i]){
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(sum / 10);
        System.out.println(idx);
    }
}
