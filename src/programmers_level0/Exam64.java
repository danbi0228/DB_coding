package programmers_level0;

import java.util.Arrays;

public class Exam64 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        Arrays.sort(str);

        for(int i=0; i<str.length; i++){
            int cnt = 0;
            for(int j=0; j<str.length; j++){
                if(str[i].equals(str[j])){
                    cnt++;
                }
            }
            if(cnt == 1){
                answer += str[i];
            }
        }

//        int[] arr = new int[26];
//        for(int i=0; i<s.length(); i++) {
//            arr[s.charAt(i)-97] += 1;
//        }
//
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i]==1) {
//                answer += (char)(i + 97);
//            }
//        }

        return answer;
    }
}
