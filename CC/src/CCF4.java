
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//MARBLES 1
public class CCF4 
{
public static void main(String args[])throws Exception
{
BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));

long n,r;
StringTokenizer st;
long t,t1;
t=Long.parseLong(dd.readLine());

for(t1=1;t1<=t;t1++)
{
    
st=new StringTokenizer(dd.readLine());
n=Long.parseLong(st.nextToken());
r=Long.parseLong(st.nextToken());
n--;r--;
if(r>n/2)
    {
    r = n-r;
    }
    long result=1;
    for(long i=1;i<=r;i++)
    {
    result*=n-i+1;
    result/=i;
    }
    

System.out.println(result);
}}}
