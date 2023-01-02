package programmers_level1;

public class Exam46 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

//        int max = Math.max(n, m);
//        int min = Math.min(n, m);
//
//        while(min > 0){
//            int r = max % min;
//            max = min;
//            min = r;
//        }
//
//        answer[0] = max;
//        answer[1] = n * m / max;

        answer[0] = gcd(n, m);
        answer[1] = n * m / answer[0];

        return answer;
    }
    static int gcd(int num1, int num2){
        while(num2 > 0){
            int r = num1 % num2;
            num1 = num2;
            num2 = r;
        }
        return num1;
    }
}
