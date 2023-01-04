package programmers_level0;

public class Exam70 {
    public int solution(int n) {
        int answer = 0;
        int j = 1;

        for(int i=1; i<=10; i++){
            j *= i;
            if(n==j){
                answer = i;
            }else if(n<j){
                answer = i-1;
                break;
            }
        }

        return answer;
    }
}
