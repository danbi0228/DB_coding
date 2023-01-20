package BOJ_Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int zero, one;
        for(int i=0; i<3; i++){
            zero = 0; one = 0;
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num == 0) zero++;
            }

            if(zero==1){
                System.out.println('A');
            } else if (zero==2){
                System.out.println('B');
            } else if (zero==3) {
                System.out.println('C');
            } else if (zero==4) {
                System.out.println('D');
            } else {
                System.out.println('E');
            }
        }
    }
}
