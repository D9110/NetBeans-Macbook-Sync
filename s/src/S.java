import java.io.*;
public class S 
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
 int ar[][],n;
   
 public static void main(String[] args)throws Exception
 {
  S cc=new S();int n=3;      
 // cc.input();
  
  cc.fuck();//cc.fill(4,6);cc.fill(5,4);cc.fill(7,8);cc.fill(8,6);
  cc.print();
   
 }
 S()
 {
    n=3;
     ar=new int[n*n][n*n];
 for(int i=0;i<n*n;i++)
     for(int j=0;j<n*n;j++)
         ar[i][j]=0;
 
 }   

void print()
{
for(int i=0;i<n*n;i++)
{
for(int j=0;j<n*n;j++)
{
    if(ar[i][j]<10)
    System.out.print(" "+ar[i][j]+"   ");
    else
        System.out.print(ar[i][j]+"   ");
}
System.out.println();System.out.println();
}
System.out.println();System.out.println();System.out.println();System.out.println();
}
void input()throws Exception
{
    n=Integer.parseInt(dd.readLine());
    for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
ar[i][j]=Integer.parseInt(dd.readLine());
}
}

boolean check(int i1,int j1,int t)
{
    //if(t>9)return false;
    for(int i=0;i<n*n;i++)
        if(ar[i1][i]==t)
            return false;
    for(int i=0;i<n*n;i++)
        if(ar[i][j1]==t)
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
{   
//System.out.println("Reach 1");  
for(int t=1;t<=n*n;t++)
    {    //System.out.println("Reach 2");System.out.println(t);System.out.println(ar[n*n-1][n*n-1]);
        if(ar[n*n-1][n*n-1]==0)
        {
            if(check(i1,j1,t))
       
            {    //System.out.println("Reach 3");
                if(i1<n*n-1||j1<n*n-1)
                 {
                    // System.out.println("Reach 4");
                 ar[i1][j1]=t;
                // System.out.println(ar[i1][j1]);
                print();
                 if(j1!=n*n-1)
                    fill(i1,j1+1);
                        else
                            fill(i1+1,0);
    
        
                }   
           }
        }
    } 
    
}

    private void fuck() { 
     
    // for(int i=0;i<n*n;i++)
     //for(int j=0;j<n*n;j++)
         //if(ar[i][j]==0)
          fill(0,0);
    }
       
   

            
    
    
}


