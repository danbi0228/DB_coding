package programmers_level1;

import java.util.ArrayList;

public class Exam13 {
    public int[] solution(long n) {
        ArrayList<Integer> array = new ArrayList<>();

        while (n!=0){
            array.add((int)(n % 10));
            n /= 10;
        }

        int[] answer = new int[array.size()];
        for(int i=0; i<array.size(); i++){
            answer[i] = array.get(i);
        }
        return answer;
    }
}
