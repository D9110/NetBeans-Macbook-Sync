
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class CHEFGR1 {

    public static void main(String args[]) throws Exception {

        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        int n, m, max, a, sum, rem;
        int t = Integer.parseInt(dd.readLine());
        StringTokenizer st;
        for (int t1 = 1; t1 <= t; t1++) {
            max = -1;
            sum = 0;
            String x[] = dd.readLine().split(" ");
            n = Integer.parseInt(x[0]);
            m = Integer.parseInt(x[1]);

            st = new StringTokenizer(dd.readLine());

            while (st.hasMoreTokens()) {
                a = Integer.parseInt(st.nextToken());
                if (a > max) {
                    max = a;
                }
                sum += a;
            }
            rem = m - ((max * n) - sum);
            if (rem >= 0 && rem % n == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
