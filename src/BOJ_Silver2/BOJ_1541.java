package BOJ_Silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("-");
        int answer = 0;

        for(int i=0; i<arr.length; i++) {
            int sum = 0;
            String[] arr2 = arr[i].split("\\+");
            for(int j=0; j<arr2.length; j++) {
                sum += Integer.parseInt(arr2[j]);
            }
            if(i == 0) {
                answer += sum;
            }else {
                answer -= sum;
            }
        }
        System.out.println(answer);
    }
}
