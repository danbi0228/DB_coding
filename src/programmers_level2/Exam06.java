package programmers_level2;

public class Exam06 {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        if(s.charAt(0) == ')') answer = false;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                cnt++;
            }else{
                cnt--;
            }
            if(cnt < 0){
                break;
            }
        }

        if(cnt != 0){
            answer = false;
        }

        return answer;

    }
}
