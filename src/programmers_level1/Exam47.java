package programmers_level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exam47 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<score.length; i++){
            if(list.size() < k){
                list.add(score[i]);
            }else{
                if(list.get(0) < score[i]){
                    list.set(0, score[i]);
                }
            }
            Collections.sort(list);
            answer[i] = list.get(0);
        }

        return answer;
    }
}