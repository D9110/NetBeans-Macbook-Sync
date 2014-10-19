
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class WSTRING0 {
    
    public static void main(String args[]) throws Exception {
        
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        String s;
        int t = Integer.parseInt(dd.readLine());
        int ar[],res[];int count = 0,p=0,result;
        
        for (int t1 = 1; t1 <= t; t1++) 
        {
                        
           s = dd.readLine()+'#';
           ar = new int[26];
           res=new int[s.length()];
           count=0;
           
           
            for (int i = 0; i < s.length(); i++) 
            {
                
                if(s.charAt(i)!='#')
                ar[s.charAt(i)-97]++;
                
                else
                {
                
                    for (int j = 0; j < 26; j++) 
                    if(ar[j]>count)count=ar[j];
                        
                    res[p++]=count;        
                    ar=new int[26];
                    
                    count=0;
                    
                }
            
            }
           
           
           
          count=0; result=0;
//          
//            for (int i = 0; i <p; i++)System.out.print(res[i]+"  ");
//            System.out.println();     
//            
          
            
            
            for (int i = 0; i <p-3; i++) 
            {
                
               count=(res[i]>0&&res[i+1]>0&&res[i+2]>0&&res[i+3]>0)?res[i]+res[i+1]+res[i+2]+res[i+3]:0;
               if(count>result) result=count;
                
            }
           
            if(result!=0)
            System.out.println(result+3); 
            else System.out.println(0);
            
            
            
        }
        
    }
    
    
}
