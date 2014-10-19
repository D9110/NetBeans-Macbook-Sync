import java.io.*;
public class S1 
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
 int ar[][],n;
   
 public static void main(String[] args)throws Exception
 {
  S1 cc=new S1();      
 // cc.input();
  cc.fill(0,0);
 }
 S1()
 {
     n=30;
     ar=new int[n*n][n*n];
 for(int i=0;i<n*n;i++)
     for(int j=0;j<n*n;j++)
         ar[i][j]=0;
 }   
 void print()
{
for(int i=0;i<n*n;i++)
{for(int j=0;j<n*n;j++)
System.out.print(ar[i][j]+"   ");
System.out.println();}System.out.println();System.out.println();
}
void input()throws Exception
{
    n=Integer.parseInt(dd.readLine());
 for(int i=0;i<n;i++)
 for(int j=0;j<n;j++)
 ar[i][j]=Integer.parseInt(dd.readLine());
}

boolean check(int i1,int j1,int t)
{
    for(int i=0;i<n*n;i++)
        if(ar[i1][i]==t||ar[i][j1]==t)
            return false;
    return(checkmatrix(i1,j1,t));
}
boolean checkmatrix(int i1,int j1,int t)
{   for(int i=n*(i1/n);i<n*(i1/n)+n;i++)
    for(int j=n*(j1/n);j<n*(j1/n)+n;j++)
        if(ar[i][j]==t)
            return false;
    return true;
}

void fill(int i1,int j1)
{   print();
  for(int t=1;t<=n*n;t++)
    {    
     if(check(i1,j1,t))
     {    
      ar[i1][j1]=t;//print();
       if((i1+j1)!=(2*(n*n-1))) 
          {  
          if(j1!=n*n-1)
          fill(i1,j1+1);
          else
          fill(i1+1,0);                
          }   
        else {print();System.exit(0);}
      }
     }
  ar[i1][j1]=0;
} 
}
       
   

            
    
    



