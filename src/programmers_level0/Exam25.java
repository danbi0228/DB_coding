package programmers_level0;

import java.util.Arrays;

public class Exam25 {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);

        for(int i=0; i<sides.length; i++){
            if(sides[2] >= sides[0] + sides[1]){
                answer = 2;
            }else{
                answer = 1;
            }
        }

        return answer;
    }
}
