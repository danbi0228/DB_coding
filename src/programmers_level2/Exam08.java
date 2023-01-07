package programmers_level2;

public class Exam08 {
    public int solution(int n) {
        int answer = 0;
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;

        for(int i=2; i<=n; i++){
            nums[i] = nums[i-2] + nums[i-1];
            nums[i] %= 1234567;
        }

        answer = nums[n];
        return answer;
    }
}
