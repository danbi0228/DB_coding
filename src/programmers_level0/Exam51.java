package programmers_level0;

public class Exam51 {
    public int solution(int order) {
        int answer = 0;

        String str = Integer.toString(order);
        int[] arr = new int[str.length()];

        for(int i=0; i<str.length(); i++){
            arr[i] = str.charAt(i) - '0';
            if(arr[i] % 3 == 0 && arr[i] != 0){
                answer ++;
            }
        }

        return answer;
    }
}
