package BOJ_Bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int tri = a + b + c;

        if(a == 60 && b == 60 && c == 60){
            System.out.println("Equilateral");
        } else if (tri == 180 && (a == b || b == c || a == c)) {
            System.out.println("Isosceles");
        } else if (tri == 180 && (a != b && b != c && c != a )) {
            System.out.println("Scalene");
        } else if (tri != 180) {
            System.out.println("Error");
        }
    }
}
