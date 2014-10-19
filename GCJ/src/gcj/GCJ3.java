

package gcj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class GCJ3 {
    
        int a[],b[];
    int n;int t1;
    
    public static void main(String args[])throws Exception
    {
        GCJ3 cc=new GCJ3();
        
        cc.input();
    
    }
    void input() throws IOException
    {
    BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));  
 int  t=Integer.parseInt(dd.readLine());
  for(t1=1;t1<=t;t1++) { int i=0;
  n=Integer.parseInt(dd.readLine());
   a=new int[n];b=new int[n];
    StringTokenizer st=new StringTokenizer(dd.readLine());
    while(st.hasMoreTokens())
    b[i++]=Integer.parseInt(st.nextToken());
    st=new StringTokenizer(dd.readLine());  
    i=0;
    while(st.hasMoreTokens())
      a[i++]=Integer.parseInt(st.nextToken());
    Arrays.sort(a);
    Arrays.sort(b);
    work();}
}
void work()
{
int sum=0;
for (int i=0;i<n;i++)
sum+=a[i]*b[n-1-i];
System.out.println("Case #"+t1+": "+sum);

}


}
