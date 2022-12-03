package programmers_level0;

public class Exam17 {
    public int solution(int n) {
        int answer = 0;

        if(n <= 7){
            answer = 1;
        }else if(n > 7){
            if(n%7 == 0){
                answer = n / 7;
            }else{
                answer = n / 7 + 1;
            }
        }
        return answer;
    }
}
