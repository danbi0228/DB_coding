package programmers_level0;

public class Exam61 {
    public String solution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            if(my_string.indexOf(my_string.charAt(i))==i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}
