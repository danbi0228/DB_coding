package programmers_level1;

public class Exam06 {
    public int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n%10;
            n /= 10;
        }

//        String str = Integer.toString(n);
//        for(int i=0; i<str.length(); i++){
//            answer += Integer.parseInt("" + str.charAt(i));
//        }

        return answer;
    }
}
