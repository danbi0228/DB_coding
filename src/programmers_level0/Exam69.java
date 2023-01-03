package programmers_level0;

public class Exam69 {
    public long solution(String numbers) {
        long answer = 0;
        String[] alpabet = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<alpabet.length; i++){
            numbers = numbers.replaceAll(alpabet[i], Integer.toString(i));
        }

        answer = Long.parseLong(numbers);

//        numbers = numbers.replaceAll("zero","0");
//        numbers = numbers.replaceAll("one","1");
//        numbers = numbers.replaceAll("two","2");
//        numbers = numbers.replaceAll("three","3");
//        numbers = numbers.replaceAll("four","4");
//        numbers = numbers.replaceAll("five","5");
//        numbers = numbers.replaceAll("six","6");
//        numbers = numbers.replaceAll("seven","7");
//        numbers = numbers.replaceAll("eight","8");
//        numbers = numbers.replaceAll("nine","9");
//        answer = Long.parseLong(numbers);

        return answer;
    }
}
