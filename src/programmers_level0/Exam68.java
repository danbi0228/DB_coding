package programmers_level0;

public class Exam68 {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for(int i=0; i<db.length; i++){
            if(db[i][0].equals(id_pw[0])){
                if(db[i][1].equals(id_pw[1])){
                    answer = "login";
                }else{
                    answer = "wrong pw";
                    break;
                }
            }else{
                answer = "fail";
            }
        }
        return answer;
    }
}
