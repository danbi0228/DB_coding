package programmers_level1;

public class Exam16 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for(int i=0; i<absolutes.length; i++){
            if(signs[i] == true){
                answer += absolutes[i];
            }else if(signs[i] == false){
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
