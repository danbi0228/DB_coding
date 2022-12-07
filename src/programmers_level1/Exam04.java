package programmers_level1;

public class Exam04 {
    public long solution(long n) {
        long answer = 0;
        Double sqrt = Math.sqrt(n);

        if(sqrt == sqrt.intValue()){
            answer = (long)Math.pow(Math.sqrt(n)+1, 2);
        }else{
            answer = -1;
        }

        return answer;
    }
}
