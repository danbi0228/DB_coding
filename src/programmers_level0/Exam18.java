package programmers_level0;

public class Exam18 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        for(int i=0; i<numbers.length; i++){
            numbers[i] *= 2;
        }

        answer = numbers;

        return answer;
    }
}
