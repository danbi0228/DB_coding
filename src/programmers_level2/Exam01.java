package programmers_level2;

import java.util.Arrays;

public class Exam01 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        int[] intarr = new int[arr.length];

        for(int i=0; i<intarr.length; i++){
            intarr[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(intarr);

        answer = intarr[0] + " " + intarr[intarr.length - 1];

//        int[] arr = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
//
//        int max = arr[0];
//        int min = arr[0];
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//
//        answer = min + " " + max;

        return answer;
    }
}
