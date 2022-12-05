package programmers_level0;

import java.util.Arrays;

public class Exam39 {
    public int[] solution(String my_string) {

        String[] strArr = my_string.replaceAll("[a-z]", "").split("");

        int[] answer = new int[strArr.length];

        for(int i=0; i<strArr.length; i++){
            answer[i] = Integer.parseInt(strArr[i]);
        }

        Arrays.sort(answer);

        return answer;
    }
}
