
package gcj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class GCJ5 {
    public static void main (String args[])throws Exception
    {
        int t,i,n,l,j,flag,c=0,t1;
        BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));  
     t=Integer.parseInt(dd.readLine());
     StringTokenizer st=new StringTokenizer(dd.readLine());
     n=Integer.parseInt(st.nextToken());
     l=Integer.parseInt(st.nextToken());
      
     
     String ar[]=new String[n];
     st=new StringTokenizer(dd.readLine());
     for(i=0;i<n;i++)ar[i]=st.nextToken();
      String ar1[]=new String[n];
     st=new StringTokenizer(dd.readLine());
     for(i=0;i<n;i++)ar1[i]=st.nextToken();
     
     Arrays.sort(ar,new c() {
     
         public class c implements Comparator<String>
     {
     public int compare(String s1,String s2)
             {   int sum1=0,sum2=0;
               for(int i=0;i<s1.length();i++)
               {sum1+=Character.getNumericValue(s1.charAt(i));sum2+=Character.getNumericValue(s2.charAt(i));}
               if(sum1>sum2)
                   return 1;
               if(sum1<sum2)
                  return -1;
              return s1.compareTo(s2);   
             }
     
     }});
     
     
     
    
     
     
    if(flag==0)System.out.println("Case #"+t1+": NOT POSSIBLE");
    else System.out.println();
    
    
    
    
    
    }
    
}
