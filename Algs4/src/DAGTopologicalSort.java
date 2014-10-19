
import java.util.Iterator;


public class DAGTopologicalSort {
    
    EdgeWeightedDiagraph ewdg;String result;boolean marked[];
    
    public DAGTopologicalSort(EdgeWeightedDiagraph ewdg) {
       this.ewdg = ewdg;
       marked=new boolean[ewdg.v+1];
       result="";
        for (int i = 0; i <=ewdg.v; i++) 
           marked[i]=false; 
        
    }
    
    void TopologicalSort()
    {
    for(int i=1;i<=ewdg.v;i++)
        if(!marked[i])
         customdfs(i);
    
        System.out.println(result);
    } 

    private void customdfs(int a) {   //reversepostorder

        marked[a]=true;
       // System.out.println(a+"  ");
       Iterator i;i=ewdg.s[a].iterator();
       
       for(;i.hasNext();)
       {
       int k=((Edge) i.next()).to;
       if(!marked[k])
       customdfs(k);
       }
       result+=a;
    }
    
    
    
}
