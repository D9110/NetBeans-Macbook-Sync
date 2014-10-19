
import java.util.Iterator;

public class CyclicCheck {
  
    EdgeWeightedDiagraph ewdg;boolean marked[];

    
    public CyclicCheck(EdgeWeightedDiagraph ewdg) {
        this.ewdg = ewdg;
        marked=new boolean[ewdg.v+1];
        for (int i = 0; i <=ewdg.v; i++)
        marked[i]=false;  
    }

    
    
    
     boolean customdfs(int a){
       
         marked[a]=true;
        for(Iterator i2=ewdg.s[a].iterator();i2.hasNext();)
        {     
        Edge k=(Edge) i2.next();
        if(!marked[k.to])
           return CyclicCheck.this.customdfs(k.to);
        else return false;  
        }        
         return true;
     }
    
    void cycliccheck (){
        
         for (int i = 1; i <=ewdg.v; i++)
         {
             if(!marked[i])           
         
         if (!CyclicCheck.this.customdfs(i))
         {System.out.println("Cycles");break;}
         
         for (int i1 = 0; i1 <=ewdg.v; i1++)
         marked[i1]=false;  
         }
    }
    
    
    

    
    void customdfs(int a,String path,int c)
    {
        marked[a]=true;
       
       for(Iterator i2=ewdg.s[a].iterator();i2.hasNext();)
        {     
        Edge k=(Edge) i2.next();
         
        if(k.to==c)
        System.out.println(path);
        
        if(!marked[k.to])
         customdfs(k.to,path+" "+k.to,c);
     
       
        }        
    }
     
      void cycliccheckpaths()
      {
      
         for (int i = 1; i <=ewdg.v; i++)
         {customdfs(i,Integer.toString(i),i);
         for (int i1 = 0; i1 <=ewdg.v; i1++)
         marked[i1]=false;  
         }
      
      }
}