
//COUNTARI 0

 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devanshu
 */
public class CCF3 {
    



 public static void main(String args[])throws Exception
    { 
        
        
        int n,i,j,result=0;
        StringTokenizer st;
        BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(dd.readLine());
        st=new StringTokenizer(dd.readLine());
     int ar[]=new int[30002];
      int arr []=new int[n];
    for(i=0;i<n;i++)
    {  arr[i]=Integer.parseInt(st.nextToken());
     for(j=i+1;j<n;j++)
     {
     
     
     result+=ar[2*arr[i]-arr[j]];
     }
    ar[arr[i]]++;
    }
    System.out.print(result);
    
    
    }
    
    
    }

















