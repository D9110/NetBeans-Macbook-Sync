

//Its a CHALLENGE question.Didnt see before.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;


public class CHAORNOT0 {

    public static void main(String args[]) throws Exception {
    
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        int ar[],result[];int x;
        
        int n = Integer.parseInt(dd.readLine());
        
        ar = new int[n];int p=0;
        result= new int[n];
        Set<Integer> s = new HashSet<>();
       
      
        
        StringTokenizer st;
        st = new StringTokenizer(dd.readLine());
        
       while(st.hasMoreTokens())
       {
           x = Integer.parseInt(st.nextToken());   
           ar[p++]=x;
           s.add(x);
       }
       
       p=0;
       
        
       
       
       
       
       for (int i = 0; i < n; i++) 
       for (int k = i+1; k < n; k++) 
            {
                x=(ar[i]+ar[k])/2;
                
                if(s.contains(x))
                result[p++]=x;                
            }   
        
       
        System.out.println(p);
        
        for (int i = 0; i <p; i++)
            System.out.println(result[p]);
            
        
       
       
       
       
       
       
       
    }
    
    
    
}
