package BOJ_Bronze5;

import java.util.Scanner;

public class BOJ_25304 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int cnt = sc.nextInt();

        for(int i=0; i<cnt; i++){
            int price = sc.nextInt();
            int count = sc.nextInt();

            total = total - (price * count);
        }

        if(total == 0){
            System.out.println("Yes");
        }else{
            System.out.printf("No");
        }

    }
}
