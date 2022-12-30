package programmers_level1;

public class Exam42 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int cnt = 0;

        while(n >= a){
            cnt = (n / a) * b;
            answer += cnt;
            n = (n % a) + cnt;
        }

        return answer;
    }
}
