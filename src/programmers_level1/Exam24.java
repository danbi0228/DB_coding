package programmers_level1;

public class Exam24 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");

        for(int i=0; i<arr.length; i++){
            if(arr.length % 2 != 0){
                answer = arr[arr.length / 2];
            }else{
                answer = arr[arr.length / 2 - 1] + arr[arr.length / 2];
            }
        }

        return answer;
    }
}
