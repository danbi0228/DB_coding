package programmers_level0;

public class Exam55 {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                        ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                            "...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] arr = letter.split("");

        for(String s : arr){
            for(int i=0; i< morse.length; i++){
                if(s.equals(morse[i])){
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer;
    }
}
