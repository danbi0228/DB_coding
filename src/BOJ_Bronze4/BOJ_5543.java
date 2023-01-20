package BOJ_Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int a = arr[0];
        int b = Math.min(arr[3], arr[4]);

        for(int i=0; i<3; i++){
            if(arr[i] < a){
                a = arr[i];
            }
        }
        System.out.println(a + b - 50);
    }
}
