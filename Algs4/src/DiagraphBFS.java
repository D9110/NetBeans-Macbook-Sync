
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class DiagraphBFS {
    
     Queue q;Diagraph g;boolean marked[];

    public DiagraphBFS(Diagraph dg) {
        
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
           Integer k = (Integer) it.next();
           if(!marked[k])
           { q.add(k);System.out.print(k+" ");  marked[k]=true; }
       }    
      
        }
            System.out.println();
    
    }

}

 
}
