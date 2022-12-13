package programmers_level1;

public class Exam12 {
    boolean solution(String s) {
        boolean answer = true;
        int pcnt = 0;
        int ycnt = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
                pcnt++;
            }else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
                ycnt++;
            }

            if(pcnt == ycnt || (pcnt == 0 && ycnt == 0)){
                answer = true;
            }else{
                answer = false;
            }

        }
        return answer;
    }
}
