

package GCJ6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GCJ6{
    public static void main(String args[])throws Exception
    
    {
    int i,j,N,t=0,k,t1,max,max1=0,flag,max2=0,flag2=0;String str;
       BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));  
     t=Integer.parseInt(dd.readLine());
    
     
     for(t1=1;t1<=t;t1++)
       {
         N=Integer.parseInt(dd.readLine());
     int ar[][]=new int[N][26];
    for(i=0;i<N;i++)
    {  str=dd.readLine();
    for(j=0;j<str.length();j++)
    { ar[i][str.charAt(j)-97]++;//System.out.println(str.charAt(j));
    }}
    //////
   // for(i=0;i<N;i++){for(j=0;j<26;j++)System.out.print(ar[i][j]);System.out.println();}
    flag2=1;max1=0;
    for(i=0;i<26;i++)
    {
    max=2147483647;flag =N;
    
    for(j=0;j<N;j++)
    {   max2=0;
        if(ar[j][i]!=0)
       {  
           flag--;
       for(k=0;k<N;k++)
       {  max2+=Math.abs(ar[k][i]-ar[j][i]);  }
      
       }
     if(max2<max)max=max2;
    }
    
    if(flag>0&&flag<N){flag2=0;break;}
    max1+=max;
    
    
    } 
     if(flag2!=0)
     System.out.println("Case #"+t1+": "+max1);
     else
     System.out.println("Case #"+t1+": Fegla Won");
     
    }
    
    

    
    
    
    
    
    
    
    
    }}
