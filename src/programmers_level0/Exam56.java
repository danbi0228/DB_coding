package programmers_level0;

import java.util.Arrays;

public class Exam56 {
    public int solution(String before, String after) {
        int answer = 0;
        char[] chbefore = before.toCharArray();
        char[] chafter = after.toCharArray();

        Arrays.sort(chbefore);
        Arrays.sort(chafter);

        String strbefore = new String(chbefore);
        String strafter = new String(chafter);

        if(strbefore.equals(strafter)){
            answer = 1;
        }else{
            answer = 0;
        }

        return answer;
    }
}
