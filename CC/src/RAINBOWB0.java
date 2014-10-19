
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class RAINBOWB0 {
    
    public static void main(String args[]) throws Exception {
        
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(dd.readLine());
        BigInteger bi,p,x1;
        bi=BigInteger.valueOf(7);
        p=BigInteger.valueOf(1000000007);
        int x;
        
        if(n%2==0)
        {
        
           x=n/2;x--;x-=6;    
            
          if(x<0)bi=BigInteger.valueOf(0);    
          else
          {
          x1=BigInteger.valueOf(x);
          bi=bi.modPow(x1,p);
          }
              
        }    
        
        
        else
        {
        
           x=n/2; x-=6;
           
           if(x<0)bi=BigInteger.valueOf(0);   
           else
           {
           x1=BigInteger.valueOf(x);
           bi=bi.modPow(x1,p);
           }
       
        }
        
        System.out.println(bi); 

    }}


