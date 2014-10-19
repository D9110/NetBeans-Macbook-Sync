
import java.util.Scanner;


public class QSort {
    static int ar[];
    public static void main (String args [])throws Exception
    {   Scanner sc =new Scanner(System.in);
        int n;
             n= sc.nextInt();
     ar=new int[n];
        
   for(int i=0;i<n;i++)
      ar[i]=sc.nextInt();
 
       new QSort().sort(0,n-1);
  
      for(int i=0;i<n;i++)
       System.out.print(ar[i]+" ");
    }
    
    void sort(int low,int high)
    {  
     
        if(high>low)
        {
    int j= partition(low,high);
    sort(low,j-1);
    sort(j+1,high);
        }
    }

    private int partition(int low, int high) { 
          
        
     int i1=low;
     int j1=high+1;
 
     while(true)
    {
    while(ar[++i1]<=ar[low])if(i1==high)break;
    while(ar[--j1]>=ar[low])if(j1==low)break;
    if(j1<=i1)break;
    swap(i1,j1);
    }
  
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
