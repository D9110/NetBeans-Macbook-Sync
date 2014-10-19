
import java.util.Iterator;
import java.util.Stack;         //PROBLEM:Error in output


public class StronglyConnectedComponentsDiagraph {        //KOSARAJU SHARIR 
                                                          //Run DFS in Reverse Post Order on REVERSED Graph
                                                          //Then do DFS in that order.
                                                          //All verices reached from a given vertex are strongly connected 
    EdgeWeightedDiagraph ewdg,reverseewdg;
    boolean marked[];
    Stack reversepostorder;
    private final int[] componentsid;
    
      public StronglyConnectedComponentsDiagraph(EdgeWeightedDiagraph ewdg) {
        this.ewdg = ewdg;
        reverseewdg=new EdgeWeightedDiagraph(ewdg.v);
        componentsid=new int[ewdg.v+1];
        marked=new boolean[ewdg.v+1];
        reversepostorder=new Stack<Integer>();
        
    }

    
    void reverse()
    {
        for(int i=1;i<=ewdg.v;i++)
        for(Iterator i1=ewdg.s[i].iterator();i1.hasNext();)
        {
        Edge k=(Edge) i1.next();
        reverseewdg.addEdge(k.to, k.from,k.weigth);        
        }
    } 
    
    void reversepostorderinitializer(){
        
        for (int i = 1; i <=ewdg.v; i++)
          if(!marked[i])
          reversepostorderdfs(i);

//        while(!reversepostorder.empty())            
//        System.out.print(reversepostorder.pop()+" ");  
    
        System.out.println();
    }
    
    void reversepostorderdfs(int a)
    {      
       
       reversepostorder.add(a);
       marked[a]=true;
     
       Iterator i;i=reverseewdg.s[a].iterator();    
       
       for(;i.hasNext();)
       {
       int k=((Edge) i.next()).to;
       if(!marked[k])
       reversepostorderdfs(k);
       }
       
    }     
    
    
    void StronglyConnectedComponents(){
     
        reverse();
        reversepostorderinitializer();
        dfsreversepostorder();
    
    }

    private void dfsreversepostorder() {
          
        int k,id=1;
        
        for (int i = 0; i <=ewdg.v; i++)
        marked[i]=false;  
       
          while(!reversepostorder.empty())
          {   
              k=(int) reversepostorder.pop();             
             if(!marked[k])
             customdfs(k,id++);
          }
         
        for (int i = 1; i <componentsid.length; i++)
            System.out.print(componentsid[i]+" ");  
        
    
    }

    private void customdfs(int a,int id) {
        marked[a]=true;
        componentsid[a]=id;
        Iterator i;i=ewdg.s[a].iterator();
       
       for(;i.hasNext();)
       {
       int k=((Edge) i.next()).to;
        if(!marked[k])
        customdfs(k,id);
       }
       
    }

}
