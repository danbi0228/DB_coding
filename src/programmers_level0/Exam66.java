package programmers_level0;

import java.util.*;

public class Exam66 {
    public Integer[] solution(int n) {
        HashSet<Integer> set = new HashSet<>();

        for(int i=2; i<=n; i++){
            while(n % i == 0){
                n /= i;
                set.add(i);
            }
        }

        Integer[] answer = set.toArray(new Integer[set.size()]);
        Arrays.sort(answer);

        return answer;
    }
}
