package programmers_level0;

public class Exam72 {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        for(int i=0; i<=max; i++){
            if(i + min > max){
                answer++;
            }
        }

        for(int i=max+1; i<=1999; i++){
            if(i < min + max){
                answer++;
            }
        }
        return answer;
    }
}
