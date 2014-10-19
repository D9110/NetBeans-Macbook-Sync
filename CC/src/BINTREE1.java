
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BINTREE1 {
    public static void main(String args[]) throws Exception {
        
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(dd.readLine());
        for (int t1 = 1; t1 <= t; t1++) {
         
            String x[] = dd.readLine().split(" ");
            int a = Integer.parseInt(x[0]);
            int b = Integer.parseInt(x[1]);
            int count = 0;
            while(a!=b)
            {
           
            if(a>b)a/=2;
            else b/=2;
            count++;
            }
            System.out.println(count);
        }
         
    
    
    }
    
    
}
