
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TREEROOT01 {
    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(dd.readLine());
        
            for (int t1 = 1; t1 <= t; t1++) {
            
            int n = Integer.parseInt(dd.readLine());
            int sum = 0;int y=0;
            
            for (int i = 1; i <= n; i++)     
            {
                String x[] =dd.readLine().split(" "); 
                sum+=Integer.parseInt(x[0]);
                y+=Integer.parseInt(x[1]);
                
            
            
            }
            
            
            
            System.out.println(sum-y);     
   
            }
        
        
        
    }    
}
