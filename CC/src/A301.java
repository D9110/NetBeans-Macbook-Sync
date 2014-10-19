
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;


public class A301 {
    
    
    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        BitSet b,c;
        int t = Integer.parseInt(dd.readLine());
        
        for (int t1 = 1; t1 <= t; t1++) {
            
        int n = Integer.parseInt(dd.readLine());    
         n++;   
       b=new BitSet(n);   
       c=new BitSet(n);
       String x[] = dd.readLine().split(" ");
      
       String op=x[0];
       int no = Integer.parseInt(x[1]);
       String ch=x[2];
       boolean choice;
       choice = "Yes".equals(ch);
       
       int lies = 0; 
       
       if(op=="=")
       {
       if(c.get(no))
       lies=b.get(no)==choice?lies:lies+1;
       
       b.set(no,choice);
       c.set(no);
       }
       
       
       if(op=="<")
       {
       if(c.get(no))
       lies=b.get(no-1)==choice?lies:lies+1;
       
       if(choice)b.set(0,n);else b.set(no,n+1);
       c.set(0, n);
       
       }      
       
       if(op==">")
       {
       if(c.get(no))
       lies=b.get(no-1)==choice?lies:lies+1;
       
       if(choice)b.set(0,n);else b.set(no,n+1);
       c.set (0, n);
       
       }      
       
    }
    
    
    }}
