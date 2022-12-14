package programmers_level1;

import javax.swing.*;

public class Exam14 {
    public String solution(String phone_number) {
        String answer = "";
        for(int i=0; i<phone_number.length()-4; i++){
            answer += "*";
        }
        answer += phone_number.substring(phone_number.length() - 4);

//        String star = phone_number.substring(0, phone_number.length()-4);
//        star = star.replaceAll(".", "*");
//
//        String number = phone_number.substring(phone_number.length() - 4);
//
//        answer = star + number;

        return answer;
    }
}
