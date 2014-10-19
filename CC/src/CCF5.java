	
import java.util.Scanner;

//ARRAYTRM 1
public class CCF5 
{
    public static void main(String args[])throws Exception
    {
    
    Scanner sc=new Scanner(System.in);
    int ar[];
    int p,t,t1,k,n=0,flag;
    t1=sc.nextInt();
    
    for(t=0;t<t1;t++)
    {
       
     n=sc.nextInt();
    ar=new int[n];
    k=sc.nextInt();
    for(int i=0;i<n;i++)
    ar[i]=sc.nextInt();
    
    
     int count = 0;
                for(int i=0;i<n;i++){
                    if( (ar[0] - ar[i])%(k+1) == 0 )
                        count++;
                }
                if(count >= n-1){
                    System.out.println("YES");
                    continue;
                }
                count = 0;
                for(int i=0;i<n;i++){
                    if( (ar[1] - ar[i])%(k+1) == 0 )
                        count++;
                }
                if(count >= n-1){
                    System.out.println("YES");
                    continue;
                }
                else{
                    System.out.println("NO");
                }
                
            
            }
        }
} 
         
/*import java.util.Scanner;


public class CCF5 
{
    public static void main(String args[])throws Exception
    {
    
    Scanner sc=new Scanner(System.in);
    int ar[];
    int p,t,t1,k,n=0,flag;
    t1=sc.nextInt();
    
    for(t=0;t<t1;t++)
    {
       
     n=sc.nextInt();
    ar=new int[n];
    k=sc.nextInt();
    for(int i=0;i<n;i++)
    ar[i]=sc.nextInt();
    
    flag=0;
   for(int i=0;i<n;i++)
   {
   
    if(ar[i]!=0)
     {

        for(int j=i+1;j<n;j++)
      {

        if(ar[j]!=ar[i]&&ar[j]!=0&&(ar[i]-ar[j])%(k+1)==0)
            {   
            flag=1;
            for(k=i+1;k<n;k++)
            if(ar[k]==ar[i]||ar[k]==ar[j])
            ar[k]=0;
            ar[i]=0;ar[j]=0;
            }

      if(flag==1)break;
      }

     
     }
   
    if(flag==1)break;
   
   }
   
  
   flag=0;
for(int i=0;i<n;i++)
{       if(ar[i]!=0)
        for(int j=i+1;j<n;j++)
        if(ar[i]==ar[j])
        {ar[j]=0;flag=1;}
    if(flag==1){ar[i]=0;break;}
 }
    
    
    flag=0;
    for(int i=0;i<n;i++)
    if(ar[i]!=0)
    flag++;
    if(flag<=1)System.out.println("YES");
    else System.out.println("nO");
    
   // for(int i=0;i<n;i++)
    //System.out.print(ar[i]+" ");
    //System.out.println();
    //if(p==n-1&&ar[n-1]!=0)
    //System.out.println("YES");
    
    }
 
 }}
        */ 
