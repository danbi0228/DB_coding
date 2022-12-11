package programmers_level1;

public class Exam07 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i=0; i<n; i++){
            answer[i] = (long)x * (i+1);    // x는 -10000000 이상, 10000000 이하인 정수
        }

        return answer;
    }
}
