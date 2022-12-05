package programmers_level0;

import java.util.Arrays;

public class Exam35 {
    public int solution(int[] array) {
        int answer = 0;
        int i = 0;
        Arrays.sort(array);

        i = (array.length) / 2;
        answer = array[i];

        return answer;
    }
}
