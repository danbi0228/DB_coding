package BOJ_Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        String[] dial = br.readLine().split("");

        for(int i=0; i<dial.length; i++){
            if(dial[i].equals("A") || dial[i].equals("B") || dial[i].equals("C")){
                num += 3;
            } else if (dial[i].equals("D") || dial[i].equals("E") || dial[i].equals("F")) {
                num += 4;
            } else if (dial[i].equals("G") || dial[i].equals("H") || dial[i].equals("I")) {
                num += 5;
            } else if (dial[i].equals("J") || dial[i].equals("K") || dial[i].equals("L")) {
                num += 6;
            } else if (dial[i].equals("M") || dial[i].equals("N") || dial[i].equals("O")) {
                num += 7;
            } else if (dial[i].equals("P") || dial[i].equals("Q") || dial[i].equals("R") || dial[i].equals("S")) {
                num += 8;
            } else if (dial[i].equals("T") || dial[i].equals("U") || dial[i].equals("V")) {
                num += 9;
            } else if (dial[i].equals("W") || dial[i].equals("X") || dial[i].equals("Y") || dial[i].equals("Z")) {
                num += 10;
            }
        }
        System.out.println(num);
    }
}
