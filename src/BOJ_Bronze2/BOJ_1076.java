package BOJ_Bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        List<String> list = new ArrayList<>(Arrays.asList(arr));

        int num1 = list.indexOf(br.readLine()) * 10;
        int num2 = list.indexOf(br.readLine());
        int num3 = list.indexOf(br.readLine());

        long answer = (long)((num1 + num2) * Math.pow(10, num3));

        System.out.println(answer);
    }
}
