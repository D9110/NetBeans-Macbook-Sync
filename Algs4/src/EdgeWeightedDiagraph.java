
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class EdgeWeightedDiagraph {
    
    Set s[];int v;int e;
    

    public EdgeWeightedDiagraph(int v) {
     
       this.v = v;
       s=new Set[v+1];
       for (int i = 1; i <=v; i++)
       s[i]=new LinkedHashSet<Edge>();    
       e=0;

    }

    void addEdge(int a,int b,int w)
    { s[a].add(new Edge(a,b,w));}
 
    Iterable adj(int a)
    {return s[a];}
    
     void print()
    {
        for (int i = 1; i <= v; i++) {
            System.out.println(i); 
            for (Iterator it = s[i].iterator(); it.hasNext();) {
                Edge k = (Edge) it.next();
                System.out.println(k.from+" "+k.to+" "+k.weigth+" ");
            }
            
        }
    
    }
    
    
    public static void main(String args[]) throws Exception {
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(dd.readLine());
        EdgeWeightedDiagraph ewdg=new EdgeWeightedDiagraph(n);
        int a,b,w;
        for (int i = 1;;i++) {
            System.out.println("Vertex a Vertex b Weight w");
            String x[] = dd.readLine().split(" ");
            if(x.length==1)break;
            a = Integer.parseInt(x[0]);
            b = Integer.parseInt(x[1]);
            w = Integer.parseInt(x[2]);
            ewdg.addEdge(a, b, w);
        }

//          System.out.println();System.out.println();
//        
//           ewdg.print();
//           
//           System.out.println();
//           
//        for (Iterator it = ewdg.adj(4).iterator(); it.hasNext();) {
//            Edge k =(Edge) it.next(); 
//            System.out.print(k.from+" "+k.to+" "+k.weigth+" ");
//        }
//        
//        System.out.println();
//        System.out.println("DFS");
//        new EdgeWeightedDiagraphDFS(ewdg).dfs(5);
//        System.out.println("BFS");
//        new EdgeWeightedDiagraphBFS(ewdg).bfs(5);
//        
//        System.out.println("Topological Sort");
//        new DAGTopologicalSort(ewdg).TopologicalSort();
//        
//          System.out.println("Cycle Checks");
//          new CyclicCheck(ewdg).cycliccheck();
//          System.out.println("Cycle Check paths");
//          new CyclicCheck(ewdg).cycliccheckpaths();
         System.out.println("Strongly Connected Components");
         new StronglyConnectedComponentsDiagraph(ewdg).StronglyConnectedComponents();
        
    }

}

    
      class Edge
    {
        int  from;int to;int weigth;        
        public Edge(int from, int to, int weigth)
        {
            this.from = from;
            this.to = to;
            this.weigth = weigth;
        }
    }

/*  
5
1 3 42
3 2 323
2 4 32
5 2 22
4 5 10
5 3 30
2 5 40
1 5 60
*/

/*DAG
6
1 2 10
2 3 12
2 6 14
1 4 20
4 5 15
5 6 30
6 3 25
5 3 5
*/

/*Connected Components and Cyclic Check 
7
7 1 1
7 5 2
7 2 3
6 7 4
3 2 10
3 5 12
5 2 6
3 6 50
3 4 20
6 4 15
1 4 501
*/
/*Acyclic Graph
4
1 2 10
2 4 15
1 3 20
*/
/*Strongly Connected Components
9
1 2 1
2 3 1
3 1 1
1 4 1
4 5 1
4 3 1
3 4 1
2 5 1
5 6 1
6 9 1
6 7 1
7 8 1
8 7 1
6 8 1
8 6 1
*/
/*Strongly Connected Components
13
13 1 1
13 5 1
2 13 1
2 3 1
3 5 1
3 2 1
4 2 1
4 3 1
5 4 1
6 13 1
6 4 1
6 8 1
6 9 1
7 9 1
7 6 1
8 6 1
9 10 1
9 11 1
10 12 1
11 12 1
11 4 1
12 9 1
*/