package BOJ_Silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("");
        int sum = 0;
        boolean isZero = false;
        Arrays.sort(N);

        for(String num : N) {
            sum += Integer.parseInt(num);
            if(num.equals("0")) {
                isZero = true;
            }
        }

        if(isZero && sum % 3 == 0) {
            for(int i=N.length-1; i>=0; i--) {
                System.out.print(N[i]);
            }
        }else {
            System.out.println(-1);
        }
    }
}
