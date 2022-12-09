package programmers_level0;

public class Exam42 {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-z, A-Z]", "").split("");

        for(int i=0; i<str.length; i++){
            answer += Integer.parseInt(str[i]);
        }

        return answer;
    }
}
