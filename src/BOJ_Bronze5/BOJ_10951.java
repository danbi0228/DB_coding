package BOJ_Bronze5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
        }

        sc.close();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        StringTokenizer st;
//        String str;
//
//        while( (str=br.readLine()) != null ){
//            st = new StringTokenizer(str, " ");
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//            sb.append(a+b).append("\n");
//        }
//        System.out.println(sb);
    }
}
