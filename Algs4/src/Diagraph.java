import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class Diagraph {
    
    int v;Set s[];int e;

    
    class Edge
    { int  from;int to;int weigth;}
    
    Diagraph(int v)
    {  
    this.v=v;e=0;
    s=new Set[v+1];
    for (int i = 1; i<=v; i++) 
    s[i]=new LinkedHashSet<Integer>();
    }
    
    void addEdge(int a,int b)
    {
    s[a].add(b);
    e++;
    }
  
    Iterable adj(int a)
    {return s[a];}
    
    void print()
    {
        for (int i = 1; i <= v; i++) {
            System.out.print("Vertex "+i+"   Edges "); 
            for (Iterator it = s[i].iterator(); it.hasNext();) {
                Integer k = (Integer) it.next();
                System.out.print(k+" ");
            }
            System.out.println();
        }
    
    }
    
    
    public static void main(String args[]) throws Exception {
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(dd.readLine());
         Diagraph dg=new Diagraph(n);
         int a; int b;
         for (int i = 1;;i++) {
             System.out.println("Vertex a Vertex b");
             String x[] = dd.readLine().split(" ");
             if(x.length==1)break;
             a = Integer.parseInt(x[0]);
             b = Integer.parseInt(x[1]);
             dg.addEdge(a, b);
             
        }
        System.out.println();System.out.println("Diagraph");

        new DiagraphDFS(dg).dfs(5);
        
         dg.print();
    }
}

/*
6
1 3
4 1
4 5
5 3
5 1
*/