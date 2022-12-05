package programmers_level0;

public class Exam32 {
    public int solution(int n) {
        int answer = 0;
        while(n != 0){
            answer += n%10;
            n /= 10;
        }

        return answer;
    }
}
