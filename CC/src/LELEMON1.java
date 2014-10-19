
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class LELEMON1 {

    public static void main(String args[]) throws Exception {
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(dd.readLine());
        int n, m, sum = 0,p;
        Stack<Integer> ar[];
        int[] path;
        StringTokenizer st;

        //P paths M length of path array
        //N rooms 
        for (int t1 = 1; t1 <= t; t1++) {

          String x[] = dd.readLine().split(" ");

            
            n = Integer.parseInt(x[0]);
            m = Integer.parseInt(x[1]);
            p=0;
            sum=0;
            path=new int[m];

            ar =new Stack[n];
           
            for (int i = 0; i < n; i++)
            ar[i]= new Stack<Integer>();
            
            st = new StringTokenizer(dd.readLine());
            
            
            while(st.hasMoreTokens())
            path[p++]=Integer.parseInt(st.nextToken());
            
            for (int i = 0; i < n; i++)
            {
            st = new StringTokenizer(dd.readLine());
            st.nextToken();
            while(st.hasMoreTokens())
            ar[i].add(Integer.parseInt(st.nextToken()));
            
            Collections.sort(ar[i]);
            
            }   
            p=0;    
           
            while(p!=m)
            {
            if(!ar[path[p]].empty())   
            sum+=ar[path[p]].pop();
            p++;
            }
          
            
            System.out.println(sum);
                
        }

    }

}
