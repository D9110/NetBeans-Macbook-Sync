
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class KPRIME1 {

    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(dd.readLine());int a,b,k,n=100001;
        
        int ar[];ar = new int[100001];
        int sieve[][]=new int[6][100001];
        
        for (int i = 2; i < n; i++) 
        if(ar[i]==0)
        for (int j=i; j < n; j+=i) 
        ar[j]++;
        
//        System.out.print("  ");
//        for (int i = 0; i < 16; i++)
//        System.out.print(ar[i]+"    ");                     
//        System.out.println();
        
        for (int i = 2; i < n; i++)
        {
        
           sieve[1][i]= sieve[1][i-1];
           sieve[2][i]= sieve[2][i-1];
           sieve[3][i]= sieve[3][i-1];
           sieve[4][i]= sieve[4][i-1];
           sieve[5][i]= sieve[5][i-1];
           
           if(ar[i]<6)sieve[ar[i]][i]++;
           
        }         
       
//        
//        for (int i = 0; i < 6; i++) {
//        System.out.print(i+" ");   
//        for (int j = 1; j < 16; j++)
//        System.out.print(sieve[i][j]+"("+j+")"+" ");            
//        System.out.println();
//        
//        }
        
        for (int t1 = 1; t1 <= t; t1++) {
         
         String x[] = dd.readLine().split(" ");
         a = Integer.parseInt(x[0]);
         b = Integer.parseInt(x[1]);
         k = Integer.parseInt(x[2]);
        
        System.out.println(sieve[k][b]-sieve[k][a-1]);   
            
        }
        
        
    }
}
