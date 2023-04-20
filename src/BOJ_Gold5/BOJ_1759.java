package BOJ_Gold5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1759 {
    public static int L, C;
    public static char[] word;
    public static char[] comWords;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        word = new char[C];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<C; i++) {
            word[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(word);

        comWords = new char[L];
        comb(0, 0);
    }

    public static void comb(int idx, int start){
        if (idx == L) {
            int cnt = 0;
            int cnt2 = 0;

            for (char w : comWords) {
                if (w == 'a' || w == 'e' || w == 'o' || w == 'u' || w == 'i') {
                    cnt++;
                }else {
                    cnt2++;
                }
            }
            if (cnt >= 1 && cnt2 >= 2) {
                System.out.println(comWords);
            }
            return;
        }

        for (int i=start; i<C; i++) {
            comWords[idx] = word[i];
            comb(idx+1, i+1);
        }
    }
}
