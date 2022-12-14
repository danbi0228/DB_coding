package programmers_level1;

import java.util.Arrays;
import java.util.HashSet;

public class Exam39 {
    public Integer[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }

        Integer[] answer = set.toArray(new Integer[set.size()]);
        Arrays.sort(answer);

        return answer;
    }
}
