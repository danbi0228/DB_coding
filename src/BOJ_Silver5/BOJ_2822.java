package BOJ_Silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] copyArr = arr.clone();
        Arrays.sort(copyArr);
        int sum = 0;

        List<Integer> list = new ArrayList<>();

        for(int i=3; i<copyArr.length; i++) {
            sum += copyArr[i];
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=3; j<copyArr.length; j++) {
                if(copyArr[j] == arr[i]) {
                    list.add(i + 1);
                }
            }
        }

        System.out.println(sum);
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
