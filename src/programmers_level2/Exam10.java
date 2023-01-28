package programmers_level2;

import java.util.Stack;

public class Exam10 {
    public int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }else {
                stack.push(c);
            }
        }
        int answer = (stack.size() == 0) ? 1 : 0;
        return answer;
    }
}
