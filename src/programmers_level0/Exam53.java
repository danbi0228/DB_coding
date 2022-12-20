package programmers_level0;

import java.util.Arrays;

public class Exam53 {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = my_string.toLowerCase().split("");
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }

//        char[] c = my_string.toLowerCase().toCharArray();
//        Arrays.sort(c);
//        String answer = new String(c);

        return answer;
    }
}
