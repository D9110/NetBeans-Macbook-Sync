
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LAPIN1{
    
    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int t = Integer.parseInt(dd.readLine());
        int ar1[],ar2[];int n,flag;
        
        for (int t1 = 1; t1 <= t; t1++) {
            
            
           s = dd.readLine();
           n=s.length();
           
           ar1=new int[26];
           ar2=new int[26];
           
           flag=1;
            
           if(n%2==0)
           for (int i = 0; i <n/2; i++)
                ar1[s.charAt(i)-97]++;
           
           else
           for (int i = 0; i <n/2+1; i++)
               ar1[s.charAt(i)-97]++;
           
           
           
            for (int i = n/2; i <n; i++)
                ar2[s.charAt(i)-97]++;
           
//            for (int i = 0; i < ar1.length; i++)
//                System.out.print(ar1[i]+" "); 
//                System.out.println();
//            for (int i = 0; i < ar2.length; i++)
//                System.out.print(ar2[i]+" ");  
            
            for (int i = 0; i <26; i++)
             if(ar1[i]!=ar2[i])   
             {flag=0;break;}
            
            if(flag==0)
                System.out.println("NO");
            else
                System.out.println("YES");
       
         }

    } 
      
}
