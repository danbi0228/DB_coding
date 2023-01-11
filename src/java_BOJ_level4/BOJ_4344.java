package java_BOJ_level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());
        int[] arr;
        StringTokenizer st;

        for(int i=0; i<C; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            arr = new int[n];
            double sum = 0;

            for(int j=0; j<n; j++){
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;
            }

            double avg = (sum / n);
            double cnt = 0;

            for(int j=0; j<n; j++){
                if(arr[j] > avg){
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n", (cnt/n) * 100);
        }

    }
}
