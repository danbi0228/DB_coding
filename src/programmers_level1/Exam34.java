package programmers_level1;

import java.util.Arrays;

public class Exam34 {
    public String[] solution(String[] strings, int n) {
        for(int i=0; i< strings.length; i++){
            strings[i] = strings[i].charAt(n) + strings[i];
        }

        Arrays.sort(strings);

        for(int i=0; i<strings.length; i++){
            strings[i] = strings[i].substring(1);
        }

        String[] answer = strings.clone();

        return answer;
    }
}
