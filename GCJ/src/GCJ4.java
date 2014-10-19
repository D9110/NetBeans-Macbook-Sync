
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class GCJ4 {
    String s;
    public static void main(String args[])throws Exception
    {  
        BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));GCJ4 cc=new GCJ4();
       int t,n; t=Integer.parseInt(dd.readLine());String s1="";
       for(int i=0;i<t;i++)
       {
       
       n=Integer.parseInt(dd.readLine());
       StringTokenizer st=new StringTokenizer(dd.readLine());
       for(int j=0;j<n;j++)
       s1+=st.nextToken();
       if(cc.work(s1))
       System.out.println("Case #"+(i+1)+": GOOD");
       else System.out.println("Case #"+(i+1)+": BADd");
       s1=""; 
       }
        
    }
    GCJ4(){for(int i=0;i<3;i++)s+=Integer.toString(i);}
boolean work(String s1)
{
int i,j;
for (i=0;i<3;i++)
{
 if(s.substring(i).indexOf(s1.charAt(i))<0)
     return false;
s=s.substring(0,i)+s.charAt(Character.getNumericValue(s1.charAt(i)))+s.substring(i+1,Character.getNumericValue(s1.charAt(i)))+s.charAt(i)+s.substring(i+1);


}
return true;
}











}
