package programmers_level0;

public class Exam63 {
    public int solution(int[] array) {
        int answer = 0;

        for(int i=0; i<array.length; i++){
            String[] str = Integer.toString(array[i]).split("");
//            String str = String.valueOf(array[i]);

            for(int j=0; j<str.length; j++){
                if(str[j].equals("7")){
                    answer++;
                }
            }
        }
        return answer;
    }
}
