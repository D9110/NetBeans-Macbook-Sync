
package gcj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GCJ2 {
    
    Double a[],b[];
    int n;
    
    public static void main(String args[])throws Exception
    {
        GCJ2 cc=new GCJ2();
    cc.input(); cc.playwar();cc.playdwar();
    
    }
    void input() throws IOException
    {int i=0;
    BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));  
    int n=Integer.parseInt(dd.readLine());
   a=new Double[n];b=new Double[n];
    StringTokenizer st=new StringTokenizer(dd.readLine());
    while(st.hasMoreTokens())
    b[i++]=Double.parseDouble(st.nextToken());
    st=new StringTokenizer(dd.readLine());  
    i=0;
    while(st.hasMoreTokens())
      a[i++]=Double.parseDouble(st.nextToken());
    Arrays.sort(a);
    Arrays.sort(b);
    for(int i1=0;i1<n;i1++)
    System.out.print(a[i1]+" ");System.out.println();
    for(int i1=0;i1<n;i1++)
    System.out.print(b[i1]+" ");
    }
void playwar()
{    System.out.println();
    int points=0,n1=n-1;
while(n1>=0)
{if((Double.compare(a[n1],b[n1]))>0)points++;n1--;}
System.out.println(points+"fg");
}

void playdwar()
{   int p=0;int n1=n-1,points=0;
    while(p<=n-1)
    {
    if((Double.compare(a[p],b[n1]))>0)
    points++;  
    p++;n1--;
    }
    System.out.println(points+"gh");

}


}





/*
package gcj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class GCJ2 {
    
     List<Double> l1,l2;int p1,p2;
    
    public static void main(String args[])throws Exception
    {
    new GCJ2().input();//new GCJ2().playwar();new GCJ2().playdwar();
    new GCJ2().output();//
    }
    void input() throws IOException
    {
    BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));  
    int N=Integer.parseInt(dd.readLine());
    l1=new ArrayList<Double>(N);
    l2=new ArrayList<Double>(N);
    StringTokenizer st=new StringTokenizer(dd.readLine());
    while(st.hasMoreTokens())
      l1.add(Double.parseDouble(st.nextToken()));
    st=new StringTokenizer(dd.readLine());  
    while(st.hasMoreTokens())
      l2.add(Double.parseDouble(st.nextToken()));
   
    Collections.sort(l1, new Comparator<Double>() {
        @Override
        public int compare(Double d1, Double d2)
        {

            return  d1.compareTo(d2);
        }
    });
      Collections.sort(l2, new Comparator<Double>() {
        @Override
        public int compare(Double d1, Double d2)
        {

            return  d1.compareTo(d2);
        }
    });
    p1=N;
    }
void playwar()
{int n=p1-1;int points=0;
while(n--!=0)
if(l1.get(n)>l2.get(n))points++;System.out.println(points);
}

void playdwar()
{   int p=0;int n=p1-1,points=0;
    while(p++!=p1)
    
    if(l1.get(p)>l2.get(n--))
      points++;  
    
    System.out.println(points);

}

void output()
{
    for(int i=1;i<l1.size();i++)
    System.out.print(l1.get(i));System.out.println();
    for(int i=1;i<l1.size();i++)
    System.out.println(l1.get(i));
}
void sort()
{for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
    {
    
    }
}

}*/