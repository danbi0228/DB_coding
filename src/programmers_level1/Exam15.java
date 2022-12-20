package programmers_level1;

import java.util.*;

public class Exam15 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }

        if(list.size() == 0) {
            return new int[] {-1};
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }

}