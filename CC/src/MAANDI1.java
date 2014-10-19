
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MAANDI1 {

    public static void main(String args[]) throws Exception
    {
     
        BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        int t = Integer.parseInt(dd.readLine());
        for (int t1 = 1; t1 <= t; t1++) {
           
            
            int n = Integer.parseInt(dd.readLine());
            int count = 0;
            for (int i = 1; i*i<= n; i++) 
            {
                if(n%i==0)
                {
                str=Integer.toString(i);
                if(str.indexOf("7")!=-1||str.indexOf("4")!=-1)
                count++;
               
                }
                int k= (n/i);
                if(n%(n/i)==0)
                {
                str=Integer.toString(n/i);
                if(str.indexOf("7")!=-1||str.indexOf("4")!=-1)
                count++;
               
                }
                
            }
          
                
            System.out.println(count); 
        }
    }
    
    

}

