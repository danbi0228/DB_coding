package programmers_level1;

public class Exam31 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;

        for(int i=0; i<str.length; i++) {
            if (str[i].equals(" ")) {
                idx = 0;
            } else {
                if (idx % 2 == 0) {
                    str[i] = str[i].toUpperCase();
                    idx++;
                } else {
                    str[i] = str[i].toLowerCase();
                    idx++;
                }
            }
            answer += str[i];
        }

//        String[] array = s.split("");
//
//        for(String ss : array) {
//            cnt = ss.contains(" ") ? 0 : cnt + 1;
//            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
//        }

        return answer;
    }
}
