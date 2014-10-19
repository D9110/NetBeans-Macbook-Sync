
import java.util.Iterator;


public class DFS {
    SimpleGraph g;
    boolean marked[];
    
    public DFS(SimpleGraph g) 
    {
        this.g = g;
        marked=new boolean[g.v+1];
        for (int i = 1; i <= g.v; i++)
         marked[i]=false;

    }
   
void dfs(int a)
{ 
    System.out.println(a+" ");  
    marked[a]=true;
   for (Iterator it = g.s[a].iterator(); it.hasNext();) 
   {
       {         
           Integer k = (Integer) it.next();
           if(!marked[k])
           dfs((int) k);
       }
        
   }

}

   



}