
import java.io.BufferedReader;
import java.io.InputStreamReader;

//Was to be a tough program, currently its a prime sieve :)

public class CCF7 {

    public static void main(String args[])throws Exception
    {    BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
    int    n=1000000000;
            //n=Integer.parseInt(dd.readLine());
   
    Boolean ar[]=new Boolean[n+1];
    ar[0]=false;ar[1]=false;
   // List<Integer> l=new ArrayList<Integer>();
    //Set<Integer> s=new HashSet<Integer>();
    //Set<Integer>  s1=new HashSet<Integer>();
     for(int i=2;i<=n;i++)
    {//l.add(i);
       // s1.add(i);
    ar[i]=true;}
    for(int i=2;i<=Math.sqrt(n);i++)
    {
    if(ar[i])
        
    {
    for(int k=i+i;k<=n;k+=i)
    { ar[k]=false;//s1.remove(k);
    
    }
    }}
//extra test code begins
    String s="";int mult=1;
    for(int i=2;i<=100;i++)
    {   //System.out.println(i);
        if(ar[i])
        {if(!ar[mult*i+1])
            System.out.println(mult*i+1+"  "+s);
       mult*=i;s+=i+" ";}
    }
//extra test code ends    
    }
    
   // for(int i=0;i<=n;i++)
    //if(ar[i])
      //  System.out.println(i);
      
    
    
    
    
    }

