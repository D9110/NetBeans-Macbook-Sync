
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class MAXCOUNTE1 {
    
    
    public static void main(String args[]) throws Exception {
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int ar[];
        int t = Integer.parseInt(dd.readLine());
        for (int t1 = 1; t1 <= t; t1++) {
            int n = Integer.parseInt(dd.readLine());   
            ar=new int[n];
            StringTokenizer st;st = new StringTokenizer(dd.readLine());
              for (int i = 0; i < n; i++) {
                ar[i] = Integer.parseInt(st.nextToken());
            }
            
            int arr[];
            arr = new int[100001];
        
            for (int i = 0; i < n; i++) {
             arr[ar[i]]++;   
            }
            int count = 0;int result = 0;
            for (int i = 0; i < 100001; i++) {
                if(arr[i]>count){count=arr[i];result=i;}
            }
            out.println(result+" "+arr[result]);
            out.flush();
        
        }
        
     
        
    }
    
}
/*
Given an array A of length N, your task is to find the element which repeats in A maximum number of times as well as the corresponding count. In case of ties, choose the smaller element first.
Input

First line of input contains an integer T, denoting the number of test cases. Then follows description of T cases. Each case begins with a single integer N, the length of A. Then follow N space separated integers in next line. Assume that 1 <= T <= 100, 1 <= N <= 100 and for all i in [1..N] : 1 <= A[i] <= 10000
Output

For each test case, output two space separated integers V & C. V is the value which occurs maximum number of times and C is its count.
Example

Input:
2
5
1 2 3 2 5
6
1 2 2 1 1 2

Output:
2 2
1 3

Description:
In first case 2 occurs twice whereas all other elements occur only once. 
In second case, both 1 and 2 occur 3 times but 1 is smaller than 2.


*/