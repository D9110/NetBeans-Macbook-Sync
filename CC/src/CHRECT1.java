
import java.io.BufferedReader;
import java.io.InputStreamReader;

class CHRECT1
{

public static void main(String args[])throws Exception{

    BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(dd.readLine());String x[];int k,n,m,res;
    
    for (int t1 = 1; t1 <= t; t1++) {
        x = dd.readLine().split(" ");
        n= Integer.parseInt(x[0]);
        m = Integer.parseInt(x[1]);
        k = Integer.parseInt(x[2]);        
        
        if(n+m<=3)res=0;
        else if(n==1||m==1)res=k;        
        else
        res=(k+1)/2;
   
        System.out.println(res);
    }
    
}


}