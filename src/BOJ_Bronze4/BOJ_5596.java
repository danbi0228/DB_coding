package BOJ_Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] min = new int[4];
        int[] man = new int[4];
        int sumA = 0;
        int sumB = 0;

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<min.length; i++){
            min[i] = Integer.parseInt(st.nextToken());
            sumA += min[i];
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<man.length; i++){
            man[i] = Integer.parseInt(st.nextToken());
            sumB += man[i];
        }

        if(sumA > sumB){
            System.out.println(sumA);
        }else if(sumA == sumB){
            System.out.println(sumA);
        }else{
            System.out.println(sumB);
        }
    }
}
