package programmers_level1;

import java.util.*;

public class Exam21 {
    public long solution(long n) {
        long answer = 0;
//        String[] arr = Long.toString(n).split("");
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
//        answer = Long.paresLong(sb.toString())

        return Long.parseLong(sb.toString());
    }
}
