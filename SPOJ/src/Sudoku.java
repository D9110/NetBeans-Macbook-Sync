class Sudoku 
{
    int n;
    int ar[][];

 Sudoku()
 {
     n=16;
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
System.out.println();
}
}    
    
    
    
public static void main(String args[])throws Exception
{
new Sudoku().work();
}
void work()
{    
    int i=0,j=0,t;
while(i!=n*n&&j!=n*n)
{
    t=ar[i][j]; 
    do{
    t++;
}while(!check(i,j,t));
ar[i][j]=t;//print();
if(ar[i][j]>n*n)
{
ar[i][j]=0;
if(j==0)
{i--;j=n*n-1;}
else j--;
}
else
{
if(j==n*n-1){i++;j=0;}
else j++;
}
}
    
 //System.out.println("1");
print();

//System.out.println("1");
}







    




boolean check(int i1,int j1,int t)
{
    for(int i=0;i<n*n;i++)
        if(ar[i1][i]==t||ar[i][j1]==t)
        {return false;}
    
    return(checkmatrix(i1,j1,t));
}
boolean checkmatrix(int i1,int j1,int t)
{   for(int i=n*(i1/n);i<n*(i1/n)+n;i++)
    for(int j=n*(j1/n);j<n*(j1/n)+n;j++)
        if(ar[i][j]==t)
            return false;
    return true;
}










}
