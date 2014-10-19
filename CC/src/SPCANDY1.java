
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class SPCANDY1 {

    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(dd.readLine());
        long n,k,res1,res2;StringTokenizer st;
        
        for (int t1 = 1; t1 <= t; t1++) {
         
            st = new StringTokenizer(dd.readLine());
            n = Long.parseLong(st.nextToken());
            k = Long.parseLong(st.nextToken());
        
            
            if(k==0)
                System.out.println(0+" "+n);
                
            else
            {   res1=n/k;res2=n%k;
                System.out.println(res1+" "+res2);  
            }
            
        
        }
    }
    
}
