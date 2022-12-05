package programmers_level0;

public class Exam31 {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];

        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                answer[i/2] = i;
            }
        }
        return answer;
    }
}
