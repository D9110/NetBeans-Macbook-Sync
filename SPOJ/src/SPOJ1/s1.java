/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package SPOJ1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Devanshu
 */
class s1 {
       public static void main(String args[])throws Exception
    
    {
    long i,j,c=0,c1=0,t=0,k=0,t1,a=0,b=0;String str;StringTokenizer st;
       BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));  
     t=Integer.parseInt(dd.readLine());
    
     
     for(t1=1;t1<=t;t1++)
       {  
        st=new StringTokenizer(dd.readLine());
       k=Long.parseLong(st.nextToken());a=Long.parseLong(st.nextToken());b=Long.parseLong(st.nextToken());
       c1=0;
       
     
     for(i=a;i<=b;i++)
     {  c=0;
    for(j=2;j<=i/2;j++)
    {
        if(i%j==0)c++;
        if(c>k-2)break;
     }
    if(c==k-2)c1++;
   
    
        }
     // System.out.println();
    System.out.println(c1); 
    
    
    }}
    
}
