package programmers_level0;

public class Exam10 {
    public int solution(int n, int k) {
        int answer = 0;
        int k2 = k - (n / 10);
        answer = (n * 12000) + (Math.abs(k2) * 2000);
        return answer;
    }
}
