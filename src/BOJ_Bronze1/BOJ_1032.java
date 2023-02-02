package BOJ_Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        for(int i=0; i<N-1; i++){
            char[] file = br.readLine().toCharArray();
            for(int j=0; j<arr.length; j++){
                if(arr[j] != file[j]){
                    arr[j] = '?';
                }
            }
        }
        System.out.println(arr);
    }
}
