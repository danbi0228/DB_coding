package programmers_level1;

public class Exam26 {
    public int[] solution(int[] arr) {
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int index = 0;

        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            }
            answer[index++] = arr[i];
        }

        return answer;
    }
}