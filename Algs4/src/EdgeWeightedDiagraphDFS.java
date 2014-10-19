
import java.util.Iterator;


public class EdgeWeightedDiagraphDFS {

        
    EdgeWeightedDiagraph ewdg;
    boolean marked[];

    public EdgeWeightedDiagraphDFS(EdgeWeightedDiagraph ewdg) {
       
        this.ewdg = ewdg;
        marked=new boolean[ewdg.v+1];
        for (int i = 1; i <= ewdg.v; i++)
         marked[i]=false;
    }

void dfs(int a)
{ 
    System.out.println(a+" ");  
    marked[a]=true;

    for (Iterator it = ewdg.s[a].iterator(); it.hasNext();) 
   {
       {         
           Edge k=(Edge) it.next();
          
           if(!marked[k.to])
           dfs((int) k.to);
       }
        
   }
    
   
}
    
}
