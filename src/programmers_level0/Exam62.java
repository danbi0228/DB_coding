package programmers_level0;

import java.util.Arrays;

public class Exam62 {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] numbers = emergency.clone();

        Arrays.sort(numbers);

        for(int i=0; i<emergency.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(emergency[i] == numbers[j]){
                    answer[i] = emergency.length - j;
                }
            }
        }

//        int[] answer = new int[emergency.length];
//        for(int i=0; i<emergency.length; i++){
//            answer[i]++;
//            for(int j=0; j<emergency.length; j++){
//                if(emergency[i]<emergency[j])
//                    answer[i]++;
//            }
//        }

        return answer;
    }
}
