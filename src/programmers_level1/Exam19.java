package programmers_level1;

public class Exam19 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for(int i=1; i<=count; i++){
            sum += (price * i);
        }

        answer = sum - money;

        if(sum < money){
            answer = 0;
        }else{
            answer = Math.abs(answer);
        }

        return answer;
    }
}
