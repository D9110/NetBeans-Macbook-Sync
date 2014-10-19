/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devanshu
 */

import java.util.Scanner;

//Redesigned Engine
public class TWayQSort {
    static int ar[];
    public static void main (String args [])throws Exception
    {   Scanner sc =new Scanner(System.in);
        int n;
             n= sc.nextInt();
     ar=new int[n];
        
   for(int i=0;i<n;i++)
      ar[i]=sc.nextInt();
 
       new TWayQSort().sort(0,n-1);
 
      for(int i=0;i<n;i++)
       System.out.print(ar[i]+" ");
    }
    
    void sort(int low,int high)
    {  
     
        if(high>low)
        {
    int lt=low,i=low+1,gt=high;
            
        while(i<=gt)
        {
        if(ar[i]<ar[lt])swap(i++,lt++);
        else if(ar[i]>ar[lt])swap(i,gt--);
        else i++;
        
        
        
        }
            
           
    sort(low,lt);
    sort(gt+1,high);
        }
    }

  
    
    void swap(int x,int y)
    {
    int w=ar[x];
    ar[x]=ar[y];
    ar[y]=w;
    }
    
    
}
