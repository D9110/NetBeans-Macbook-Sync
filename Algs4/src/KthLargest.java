
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devanshu
 */
public class KthLargest {//implemented for  median
    
   static int ar[];static int n;static int k;
    
    public static void main (String args [])throws Exception
    {   Scanner sc =new Scanner(System.in);
        
             n= sc.nextInt();
     ar=new int[n];
        k=n/2;
   for(int i=0;i<n;i++)
      ar[i]=sc.nextInt();
 //  System.out.print("Reach 1");
       new KthLargest().sort(0,n-1);
   //    System.out.print("Reach 2");
      for(int i=0;i<n;i++)
       System.out.print(ar[i]+" ");
    }
    
    void  sort(int low,int high)
    {  
      //  System.out.print("Reach 3");
        if(high>low)
        {
    int j= partition(low,high);//System.out.print("Reach 4");
   if (j==k)System.out.println( ar[n/2]);
   
   sort(low,j-1);//System.out.print("Reach 5");
    
     sort(j+1,high);//System.out.print("Reach 6");
       }
       
    }

    private int partition(int low, int high) { 
          
        
     int i1=low;
     int j1=high+1;
  //  System.out.print("Reach 7");
     while(true)
    {
    while(ar[++i1]<=ar[low])if(i1==high)break;//System.out.print("Reach 8");
    while(ar[--j1]>=ar[low])if(j1==low)break;//System.out.print("Reach 9");
    if(j1<=i1)break;
    swap(i1,j1);// System.out.print("Reach 10");
    }
   //  System.out.print("Reach 11");
  swap(low,j1);
   
  return j1   ;
 }
    
    void swap(int x,int y)
    {
    int w=ar[x];
    ar[x]=ar[y];
    ar[y]=w;
    }
    
    
}







    

