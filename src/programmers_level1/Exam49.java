package programmers_level1;

public class Exam49 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        int cnt = 0;

        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zero++;
            }
        }

        for(int i=0; i< win_nums.length; i++){
            for(int j=0; j< lottos.length; j++){
                if(win_nums[i] == lottos[j]){
                    cnt++;
                }
            }
        }

        int high = zero + cnt;
        int low = cnt;

        if(high == 6){
            answer[0] = 1;
        }else if(high == 5){
            answer[0] = 2;
        }else if(high == 4){
            answer[0] = 3;
        }else if(high == 3){
            answer[0] = 4;
        }else if(high == 2){
            answer[0] = 5;
        }else {
            answer[0] = 6;
        }

        if(low == 6){
            answer[1] = 1;
        }else if(low == 5){
            answer[1] = 2;
        }else if(low == 4){
            answer[1] = 3;
        }else if(low == 3){
            answer[1] = 4;
        }else if(low == 2){
            answer[1] = 5;
        }else {
            answer[1] = 6;
        }

        return answer;
    }
}
