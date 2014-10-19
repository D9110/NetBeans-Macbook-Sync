// TurboSort easy 1
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;


 class TSORTE1 
 {
    
    public static void main(String args[]) throws Exception {
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
         PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int t = Integer.parseInt(dd.readLine());
        int ar[]; ar=new int[t];
        for (int t1 = 0; t1 <t; t1++) {
      ar[t1]=Integer.parseInt(dd.readLine());
        }
      Arrays.sort(ar);
        for (int i = 0; i < t; i++) {
          out.println(ar[i]);   
        }
        out.flush();
        
    }
    
}
/*

Given the list of numbers, you are to sort them in non decreasing order.
Input

t – the number of numbers in list, then t lines follow [t <= 10^6]. 

Each line contains one integer: N [0 <= N <= 10^6]
Output

Output given numbers in non decreasing order.
Example

Input:
5
5
3
6
7
1
Output:
1
3
5
6
7




*/
