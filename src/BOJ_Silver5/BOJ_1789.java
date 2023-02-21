package BOJ_Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long sum = 0;
        int i = 0;

        while (true) {
            sum += i;
            if(sum > S) {
                break;
            }
            i++;
        }
        System.out.println(i - 1);
    }
}
