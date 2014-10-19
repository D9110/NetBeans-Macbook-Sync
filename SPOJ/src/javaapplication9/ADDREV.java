
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

 
class ADDREV
{ 
   
    public static void main(String args[]) throws IOException
    {
    BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
    int cases,a,b ;
    cases=Integer.parseInt(dd.readLine());
    List<Integer> ls=new ArrayList<Integer>(cases);
        
    StringTokenizer st;
    for(int i=0;i<cases;i++)
    {
    st= new StringTokenizer(dd.readLine());
    a=reverse(st.nextToken()); b=reverse(st.nextToken());
    ls.add(reverse(Integer.toString(a+b)));
    }
   
    for(Integer k:ls)
    System.out.println(k);

    
    }
   static int reverse(String k)
    {   
     StringBuffer sb;
      sb=new StringBuffer(k);
      sb.reverse();
      return(Integer.parseInt(sb.toString()));
    }
}