package programmers_level1;

public class Exam50 {
    public String solution(int a, int b) {
        String answer = "";
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        String[] yoil = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

        int days = 0;

        for(int i=0; i<a-1; i++){
            days += month[i];
        }

        days += b;
        answer = yoil[days % 7];

//        if(days % 7 == 1) {
//            answer = "FRI";
//        }else if(days % 7 == 2) {
//            answer = "SAT";
//        }else if(days % 7 == 3) {
//            answer = "SUN";
//        }else if(days % 7 == 4) {
//            answer = "MON";
//        }else if(days % 7 == 5) {
//            answer = "TUE";
//        }else if(days % 7 == 6) {
//            answer = "WED";
//        }else if(days % 7 == 0) {
//            answer = "THU";
//        }

        return answer;
    }
}
