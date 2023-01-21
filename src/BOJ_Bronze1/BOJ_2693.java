package BOJ_Bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] arr = new int[T][10];

        StringTokenizer st;
        for(int i=0; i< arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr[i]);
            System.out.println(arr[i][7]);
        }
    }
}
