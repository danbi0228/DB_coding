package BOJ_Bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int young = 0;
        int min = 0;
        int call;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            call = Integer.parseInt(st.nextToken());

            young += ((call / 30) + 1) * 10;
            min += ((call / 60) + 1) * 15;
        }

        if(young == min){
            System.out.println("Y M " + young);
        }else if(young < min){
            System.out.println("Y " + young);
        }else{
            System.out.println("M " + min);
        }
    }
}
