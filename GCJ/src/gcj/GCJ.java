
package gcj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class GCJ {
    static int a[][],b[][];static String output[];static int t;
    static int a1,b1,j1;
    static BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
public static void main(String args[])throws Exception
{

t=Integer.parseInt(dd.readLine());
for(int i=1;i<=t;i++)
{input();//output();
j1=i;
work();}  
}

static void input() throws IOException
{   a=new int[4][4];b=new int[4][4];
 a1=Integer.parseInt(new StringTokenizer(dd.readLine()).nextToken());
    for(int i=0;i<4;i++)
{StringTokenizer st=new StringTokenizer(dd.readLine());
for(int j=0;j<4;j++)
    a[i][j]=Integer.parseInt(st.nextToken());
}
 b1=Integer.parseInt(new StringTokenizer(dd.readLine()).nextToken());
 for(int i=0;i<4;i++)
{StringTokenizer st=new StringTokenizer(dd.readLine());
for(int j=0;j<4;j++)
    b[i][j]=Integer.parseInt(st.nextToken());
}

}
static void output()
{for(int i=0;i<4;i++)
{for(int j=0;j<4;j++)
   System.out.print(a[i][j]);System.out.println();

 }  

for(int i=0;i<4;i++)
{for(int j=0;j<4;j++)
   System.out.print(b[i][j]);System.out.println();

 } System.out.println(a1);System.out.println(b1);
}
static void work()
{int c=0,found=0;

for(int i=0;i<4;i++)
    for(int j=0;j<4;j++)
        if(a[a1-1][i]==b[b1-1][j])
        {c++;found=a[a1-1][i];}
if(c==1)
System.out.println("Case #"+j1+": "+found);
if(c==0)System.out.println("Case #"+j1+": Volunteer cheated!");
    if(c>=2)System.out.println("Case #"+j1+": Bad magician!");


}
}
/*Case #1: 7
Case #2: Bad magician!
Case #3: Volunteer cheated!*/


