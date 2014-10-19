
import java.io.BufferedReader;
import java.io.InputStreamReader;

class BruteTest
{
public static void main(String args[])throws Exception{

    BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));

    
            String x[] = dd.readLine().split(" ");
            int n = Integer.parseInt(x[0]);
            int a = Integer.parseInt(x[1]);
            int b = Integer.parseInt(x[2]);
            int c = Integer.parseInt(x[3]);
            
            int count = 0;
            
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <=b; j++) {
                  
                    for (int k = 0; k <=c; k++) {
                        if(i+j+k<=n)count++;
                        
                    }
                  
                    
                }
            }
            
            
            System.out.println(count);
    
    
}



}//224 44 24 24
//28125