package programmers_level1;

import java.util.ArrayList;
import java.util.List;

public class Exam43 {
    public int solution(String t, String p) {
        int answer = 0;
        List<Long> list = new ArrayList<>();
        for(int i=0; i<t.length()-p.length()+1; i++){
            list.add(Long.valueOf(t.substring(i, i+(p.length()))));
        }

        long[] arr = new long[list.size()];

        for(int i=0; i<arr.length; i++){
            arr[i] = list.get(i);

            if(arr[i] <= Long.parseLong(p)){
                answer++;
            }
        }

        return answer;
    }
}
