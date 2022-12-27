package programmers_level1;

public class Exam35 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wMax = 0;
        int hMax = 0;

        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(sizes[i][0] > wMax){
                wMax = sizes[i][0];
            }
            if(sizes[i][1] > hMax){
                hMax = sizes[i][1];
            }
            answer = wMax * hMax;
        }

        return answer;
    }
}
