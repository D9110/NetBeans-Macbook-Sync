
import java.util.Iterator;


public class ConnectedComponents {
  
    SimpleGraph g;boolean marked[];int parent[];
    
    public ConnectedComponents(SimpleGraph g) {
        this.g = g;
        marked=new boolean[g.v+1];
        parent=new int[g.v+1];
        for (int i = 0; i <=g.v; i++)
         marked[i]=false;  
        
    }
    
    void connected(){
        for (int i = 1; i <=g.v; i++)
            if(!marked[i])
            customdfs(i,i);
        
        for (int i = 0; i <=g.v; i++)
            System.out.println(parent[i]);  
        
    }

    private void customdfs(int i, int i1) {
        
        parent[i]=i1;marked[i]=true;
        for(Iterator i2=g.s[i].iterator();i2.hasNext();)
        {
        
        int k=(int) i2.next();
        if(!marked[k])
            customdfs(k,i1);
        
        }
    }
    
    
}
