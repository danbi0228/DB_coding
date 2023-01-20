package BOJ_Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());

        int kor = 0;
        int math = 0;

        if(A % C != 0){
            kor = A / C + 1;
        }else{
            kor = A / C;
        }
        if(B % D != 0){
            math = B / D + 1;
        }else{
            math = B / D;
        }

        System.out.println(L - Math.max(kor, math));
    }
}
