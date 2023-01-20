package BOJ_Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for(int i=0; i<8; i++){
            String s = br.readLine();
            for(int j=0; j<8; j++){
                if(s.charAt(j) == 'F' && (i+j) % 2 == 0){
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

//        String[][] arr = new String[8][8];
//
//        for(int i=0; i<arr.length; i++){
//            String[] str = br.readLine().split("");
//            for(int j=0; j<arr[0].length; j++){
//                arr[i][j] = str[j];
//            }
//        }
//
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                if((i+j) % 2 == 0 && arr[i][j].equals("F")){
//                    cnt++;
//                }
//            }
//        }
//        System.out.println(cnt);
    }
}
