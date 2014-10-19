
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class EQUATION0 {
    
    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(dd.readLine());
        
       for (int t1 = 1; t1 <= t; t1++) 
        {
            
            String x[] = dd.readLine().split(" ");
            int n = Integer.parseInt(x[0]);
            int a = Integer.parseInt(x[1]);
            int b = Integer.parseInt(x[2]);
            int c = Integer.parseInt(x[3]);
            
            int count = 0;
            
            for (int i = 0; i <= a; i++) 
            {
                for (int j = 0; j <=b; j++)
                {
                    	if (i + j > n)
                        continue;
                        
                        else 
                        {
                        int temp = n - (i+j) + 1;
                        
                        if (temp > (c + 1))
                        count += c + 1;
                        else 
                        count += temp;

                       }
                    
                }
            }
            
//                for (int i = 0; i <= a; i++) {
//                for (int j = 0; j <=b; j++)
//                {
//                    
//                    if(n-i-j<0)break;
//                    
//                    if(c<n-i-j)count+=c+1;     My code
//                    
//                    else count+=n-i-j+1;              
//                    
//                }
//            }
//            
//            
            System.out.println(count);
        }
    }
    
}


//Statement 
//Given N,A,B,C, find how many solutions exist to the equation : a + b + c ≤ N, such that 0 ≤ a ≤ A, 0 ≤ b ≤ B, 0 ≤ c ≤ C. 
//Input 
//The first line contains the number of test cases T. Each test case contains 4 integers, N,A,B,C. 0 ≤ N,A,B,C ≤ 2500 
//Output 
//Output T lines, one for each test case. 
//Sample Input 
//2
//4 3 2 1
//1 1 1 1
//Sample Output 
//20
//4
