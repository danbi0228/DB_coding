package programmers_level1;

import java.util.ArrayList;
import java.util.List;

public class Exam25 {
    public int[] solution(int[] arr) {
        int num = -1;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(num != arr[i]){
                num = arr[i];
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}
