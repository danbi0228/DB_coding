package programmers_level2;

public class Exam04 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zero = 0;
        int cnt = 0;

        while(!s.equals("1")){
            String str = s.replaceAll("0", "");

            int zeroCnt = s.length() - str.length();
            zero += zeroCnt;

            s = Integer.toBinaryString(str.length());
            cnt++;
        }
        answer[0] = cnt;
        answer[1] = zero;

        return answer;
    }
}
