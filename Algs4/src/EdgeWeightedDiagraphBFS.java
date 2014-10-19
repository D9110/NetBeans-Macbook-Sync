
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class EdgeWeightedDiagraphBFS {
         Queue q;EdgeWeightedDiagraph g;boolean marked[];

    public EdgeWeightedDiagraphBFS(EdgeWeightedDiagraph dg) {
        
        this.g = dg;
        q=new LinkedList<>();
        marked=new boolean[dg.v+1];
        for (int i = 0; i <marked.length; i++)
         marked[i]=false;  
        
    } 

    void bfs(int a){
        
        q.add(a);

          marked[a]=true;
           
        while(!q.isEmpty())
        {   
            a=(int) q.remove();System.out.print(a+"  ");

           for (Iterator it = g.s[a].iterator(); it.hasNext();) 
   {
       {         
            Edge k=(Edge) it.next();
           if(!marked[k.to])
           { q.add(k.to);System.out.println(k.from+" "+k.to+" "+k.weigth+" ");  marked[k.to]=true; }
       }    
      
        }
            System.out.println();
    
    }

}

}
