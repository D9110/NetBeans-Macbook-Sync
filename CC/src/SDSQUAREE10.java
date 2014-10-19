
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;


class SDSQUAREE10 {
    
    static boolean ar[]={true,true,false,false,true,false,false,false,false,true};
    
    public static void main(String args[]) throws Exception {
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        
        int t = Integer.parseInt(dd.readLine());
        for (int t1 = 1; t1 <= t; t1++) {
            StringTokenizer st;st = new StringTokenizer(dd.readLine());
            long a= Long.parseLong(st.nextToken());
            long b= Long.parseLong(st.nextToken());
            a=(long) Math.ceil(Math.sqrt(a));
            b=(long) Math.sqrt(b);
            
            long count = 0;
            
            for (long i = a; i <= b; i++) 
            {
                if(isPerfect(i*i))count++;
                
            }
           
            out.println(count);
            out.flush();
            
        }

    }    

    private static boolean isPerfect(long l) 
    
    
    {
        
        int t;
        
        while(l!=0)
        {
           t=(int) (l%10); 
        if(!ar[t])return false;     
        l/=10;
        
        }

        return true;
    }


}
/*
Recently Chef become very much interested in perfect squares. We all know Chef and his weird interests. Anyways Chef will be soon writing his masters thesis on perfect squares revealing what-not-known properties of perfect squares.
While doing his research, he happened to be confronted with some interesting perfect squares. These prefect squares consists only of digits which are themselves perfect squares. 0, 1, 4 and 9 are such digits. These are called perfect digits.
As we all know Chef also has habit of asking too many questions, he is asking- given two numbers a and b, how many perfect squares exists between these two numbers inclusive, that contains only perfect digits. 
Input:
First line of input will contains T, number of test cases. Then T lines follows, each containing two positive integers a and b.
Constraints:
T <= 500
1<= a <= b <= 10000000000 
Output:
For each input, output number of perfect digit squares between given numbers. 
Sample
Input:
2
1 10
100 10000
Output:
3
9
 */