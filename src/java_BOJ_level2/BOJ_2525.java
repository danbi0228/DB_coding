package java_BOJ_level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken()); // 시
        int m = Integer.parseInt(st.nextToken()); // 분

        int a = Integer.parseInt(br.readLine()); // 필요한 시간

        h += a / 60; // h = h + a / 60
        m += a % 60; // m = m + c % 60

        if (m >= 60) {
            h += 1; // h = h + 1
            m -= 60; // m = m - 60
        }

        if (h >= 24) {
            h -= 24; // h = h - 24
        }
    }
}
