package programmers_level0;

public class Exam60 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for(int l=i; l<=j; l++) {
            int num = l;
            while (num > 0) {
                if(num % 10 == k){
                    answer++;
                    num/=10;
                }else{
                    num/=10;
                }
            }
        }
        return answer;
    }
}
