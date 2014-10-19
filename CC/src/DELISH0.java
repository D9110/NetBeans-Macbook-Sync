
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class DELISH0 {
    
    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
       
        int n,ar[],arr[][],x,y,a=0,b=1,c=2,d=3;
        int t = Integer.parseInt(dd.readLine());
        
          for (int t1 = 1; t1 <= t; t1++) {
         
          n = Integer.parseInt(dd.readLine()); 
          ar=new int[n+1];
          arr=new int[n+1][n+1];
          x=Integer.MIN_VALUE;y=Integer.MAX_VALUE;
          StringTokenizer st;st = new StringTokenizer(dd.readLine());  
          for (int i = 1; i <=n; i++)
          ar[i] = Integer.parseInt(st.nextToken());
          a=0;b=0;c=n;d=n;
              for (int i = 1; i <= n; i++) 
                  for (int j = i; j <=n; j++)
                  {
                       
                      
                      
                       arr[i][j]=arr[i][j-1]+ar[j];
                       if(arr[i][j]>x&&j<=c)
                       {x=arr[i][j];a=i;b=j;continue;}
                       if(arr[i][j]<y&&b<=i)
                       {y=arr[i][j];c=i;d=j;}
                 
                  

                  }
             
              
              
              
              
              
              System.out.println();
              for (int i = 0; i <= n; i++) 
              {for (int j = 0; j <=n; j++)
                      System.out.print(arr[i][j]+"  ");
              System.out.println();
              }
              
              
              System.out.println(x+" "+y);
              System.out.println(Math.abs(x-y));
          
          
        }
        
        
    }
    
    
}
