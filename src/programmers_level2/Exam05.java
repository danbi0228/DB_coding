package programmers_level2;

public class Exam05 {
    public int solution(int n) {
        int answer = 0;
        String n2 = Integer.toBinaryString(n).replace("0", "");

        for(int i=n+1; i<=1000000; i++){
            String i2 = Integer.toBinaryString(i).replace("0", "");

            if(n2.equals(i2)){
                answer = i;
                break;
            }
        }
        return answer;
    }
}
