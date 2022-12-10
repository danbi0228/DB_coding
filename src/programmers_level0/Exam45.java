package programmers_level0;

import java.util.ArrayList;

public class Exam45 {
    public ArrayList solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int num : numlist) {
            if(num % n == 0){
                answer.add(num);
            }
        }

//        int cnt = 0;
//        int[] arr = new int[numlist.length];
//
//        for(int i=0; i<numlist.length; i++){
//            if(numlist[i] % n == 0){
//                arr[cnt] = numlist[i];
//                cnt++;
//            }
//        }
//
//        int[] answer = new int[cnt];
//        for(int i=0; i<cnt; i++){
//            answer[i] = arr[i];
//        }
//
        return answer;
    }
}
