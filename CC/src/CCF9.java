
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CCF9 {
    
 public static void main(String args[])throws Exception
 {

 BufferedReader dd=new BufferedReader(new InputStreamReader(System.in)); 
 int t=Integer.parseInt(dd.readLine());
 for(int t1=1;t1<=t;t1++)
 {
 int n=Integer.parseInt(dd.readLine());
 String str=dd.readLine();
 long count=0;
 for(int i=0;i<str.length();i++)
   if(str.charAt(i)=='1')  
     count++;
 long result=((count*(count+1))/2);
 System.out.println(result);
 
 
 
 }
     
     
 }
    
}
