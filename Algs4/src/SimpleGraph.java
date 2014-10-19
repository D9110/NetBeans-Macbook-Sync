
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class SimpleGraph {
    
    int v;Set s[];int e;

    
    class Edge
    { int  from;int to;int weigth;}
    
    SimpleGraph(int v)
    {  
    this.v=v;e=0;
    s=new Set[v+1];
    for (int i = 1; i<=v; i++) 
    s[i]=new LinkedHashSet<Integer>();
    }
    
    void addEdge(int a,int b)
    {
    
    s[a].add(b);
    s[b].add(a);
    e++;
    }
  
    Iterable adj(int a)
    {return s[a];}
    
    void print()
    {
        for (int i = 1; i <= v; i++) {
            System.out.print("Vertex "+i+"   Edges"); 
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
         SimpleGraph g=new SimpleGraph(n);
         int a; int b;
         for (int i = 1;;i++) {
             System.out.println("Vertex a Vertex b");
             String x[] = dd.readLine().split(" ");
             if(x.length==1)break;
             a = Integer.parseInt(x[0]);
             b = Integer.parseInt(x[1]);
             g.addEdge(a, b);
             
        }
        System.out.println();System.out.println();
        
        for(Object k:g.adj(4))
            System.out.print(k);  ;
        
        g.print();
        
        
        System.out.println();
        new DFS(g).dfs(4);
        System.out.println();
        new BFS(g).bfs(4);
        
        System.out.println("Connected Components");
        new ConnectedComponents(g).connected();
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
/*Connected Components
12
1 2
1 4
2 3
2 5
3 5
6 7
9 10
10 11
10 12
9 12
11 12
*/