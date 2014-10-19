
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
public class MSort {
    
  static int ar[];
  static int aux[];//Sedgewick uses one time declararation of aux to make of full araay length
    public static void main (String args [])throws Exception
    {   Scanner sc =new Scanner(System.in);
        int n;
             n= sc.nextInt();
     ar=new int[n];
     aux =new int [n];   
   for(int i=0;i<n;i++)
      ar[i]=sc.nextInt();
 //  System.out.print("Reach 1");
       new MSort().sort(0,n-1);
   //    System.out.print("Reach 2");
      for(int i=0;i<n;i++)
       System.out.print(ar[i]+" ");
    }

void sort(int low,int high){
    if(low<high)
    { 
    int mid=(low+high)/2;
    sort(low,mid);
    sort(mid+1,high);
    merge(low,high);
    }
    }

void merge(int low,int high)
{
//int aux[]=new int[high-low];//Sedgewick merges from the aux to the main array else copying back would be needed
for(int i=low;i<=high;i++)
aux[i]=ar[i];
int l1=low;int l2=(low+high)/2+1;int mid=(low+high)/2;
for(int i=low;i<=high;i++)
{
if(l2>high)ar[i]=aux[l1++];
else if(l1>mid)ar[i]=aux[l2++];
else if(aux[l1]<ar[l2])ar[i]=aux[l1++];//if if else is not used out of bounds exception will come
else ar[i]=aux[l2++];
}
}
}
