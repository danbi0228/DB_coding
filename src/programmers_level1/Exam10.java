package programmers_level1;

public class Exam10 {
    public int solution(long num) {
        // testcase3 때문에 int num에서 long num으로 형변환 long n = (long)num;
        int answer = 0;

        while(num != 1){
            if(num%2 == 0){
                num /= 2;
            }else{
                num = num * 3 + 1;
            }
            answer++;

            if(answer > 500){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}