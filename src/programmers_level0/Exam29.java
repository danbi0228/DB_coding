package programmers_level0;

public class Exam29 {
    public int solution(int[] numbers) {
        int answer = 0;
        int max = 0;

        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i != j && numbers[i] * numbers[j] > max){
                    max = numbers[i] * numbers[j];
                }
            }
        }
        answer = max;
        return answer;
    }
}
