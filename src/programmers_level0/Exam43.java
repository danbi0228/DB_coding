package programmers_level0;

public class Exam43 {
    public String solution(String my_string) {
        String answer = "";

//        String tmp = "";
//        char[] arr = my_string.toCharArray();
//
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] >= 'A' && arr[i] <= 'Z'){
//                tmp = arr[i] + "";
//                answer += tmp.toLowerCase();
//            }else if(arr[i] >= 'a' && arr[i] <= 'z'){
//                tmp = arr[i] + "";
//                answer += tmp.toUpperCase();
//            }
//        }

        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z'){
                answer += Character.toLowerCase(my_string.charAt(i));
            }else{
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }

        return answer;
    }
}
