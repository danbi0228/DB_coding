package java_BOJ_level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine().toUpperCase();
        int[] arr = new int[26];
        int max = 0;
        char ch = '?';

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                arr[s.charAt(i) - 65]++;
            }
        }

        for(int i=0; i<26; i++){
            if(arr[i] > max){
                max = arr[i];
                ch = (char)(i + 65);
            }else if(arr[i] == max){
                ch = '?';
            }
        }

        System.out.println(ch);
    }
}
