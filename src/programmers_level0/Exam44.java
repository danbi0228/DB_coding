package programmers_level0;

public class Exam44 {
    public String solution(String cipher, int code) {
        String answer = "";

        for(int i=code-1; i<cipher.length(); i+=code){
            answer += cipher.substring(i, i+1);
        }
//        String[] arr = cipher.split("");
//
//        for(int i=0; i<arr.length; i++){
//            if((i+1)%code == 0){
//                answer += arr[i];
//            }
//        }
        return answer;
    }
}
