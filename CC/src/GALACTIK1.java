
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


class GALACTIK1
{

static int id[];static int typecost[];static List<Integer> l[];static boolean marked[];static int type;

    public static void main(String args[]) throws Exception {
        
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        String x[] = dd.readLine().split(" ");
        int n = Integer.parseInt(x[0]);
        int m = Integer.parseInt(x[1]);
        int a,b,c,min=100001;
        
        l=new List[n+1];
        marked= new boolean[n+1];
     
        id=new int[n+1];
        
        for (int i = 0; i <= n; i++)
           l[i] =new ArrayList<Integer>();
                   
                   
        for (int i = 1; i <=m; i++) 
        {
           x = dd.readLine().split(" ");
           a= Integer.parseInt(x[0]);
           b = Integer.parseInt(x[1]);
           
           l[a].add(b);
           l[b].add(a);
  
        }    
              
        
        for (int i = 1; i <=n; i++)
            if(!marked[i])
            customdfs(i,++type);
       
        typecost=new int[type+1]; 
        
        for (int i = 1; i <=type; i++)
        typecost[i]=100001;
        
        for(int i=1;i<=n;i++)
        {
        c = Integer.parseInt(dd.readLine());
        if(c>=0&&typecost[id[i]]>c)typecost[id[i]]=c;
        }
       
        for(int i=1;i<=type;i++)
        if(typecost[i]<min)min=typecost[i];
        
        int flag=1;int sum=0;
        
       // System.out.println();System.out.println(type);System.out.println();
        
        if(type>1)
        for(int i=1;i<=type;i++){
        if(typecost[i]==100001){System.out.println("-1");flag=0;break;}    
        else sum+=typecost[i];}
        
        if(type==1)System.out.println("0");
        
        if(flag==1&&type>1)System.out.println((type-1)*min+sum-min);
        
        
        
  }


  static void customdfs(int i,int type)
  {
    marked[i]=true;id[i]=type;    
    for(Object k:l[i])
    if(!marked[(int)k])
    customdfs((int)k,type);
  }
}












//5 5
//1 2
//2 3
//3 4
//4 5
//1 3
//-1
//-1
//-1
//-1
//-1



//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//class ConnectedComponents {
//  
//    SimpleGraph g;boolean marked[];int parent[];
//    
//    public ConnectedComponents(SimpleGraph g) {
//        this.g = g;
//        marked=new boolean[g.v+1];
//        parent=new int[g.v+1];
//        for (int i = 0; i <=g.v; i++)
//         marked[i]=false;  
//        
//    }
//    
//    void connected(){
//        for (int i = 1; i <=g.v; i++)
//            if(!marked[i])
//            customdfs(i,i);
//        
//        for (int i = 0; i <=g.v; i++)
//            System.out.println(parent[i]);  
//        
//    }
//
//    private void customdfs(int i, int i1) {
//        
//        parent[i]=i1;marked[i]=true;
//        for(Iterator i2=g.s[i].iterator();i2.hasNext();)
//        {
//        
//        int k=(int) i2.next();
//        if(!marked[k])
//            customdfs(k,i1);
//        
//        }
//    }
//    
//     public static void main(String args[]) throws Exception {
//        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(dd.readLine());
//         int m = Integer.parseInt(dd.readLine());
//         
//         SimpleGraph g=new SimpleGraph(n);
//         int a; int b;int c;
//         for (int i = 1;i<=m;i++)
//         {
//             
//             String x[] = dd.readLine().split(" ");
//             
//             a = Integer.parseInt(x[0]);
//             b = Integer.parseInt(x[1]);
//             g.addEdge(a, b);
//             
//        }
//         
//         
//         int cost[]=new int[++n];
//        for (int i = 1; i < n; i++)
//        cost[i]=Integer.MAX_VALUE;   
//        
//       for (int j = 1; j <= n; j++) 
//       {
//         
//          c = Integer.parseInt(dd.readLine());         
//          if(cost[g[j]]>c&&c>0)cost[id[j]]=c;
//              
//       } 
//       
//        System.out.println(n);
//       
//        for (int i = 1; i < n; i++) {
//            System.out.println(cost[i]);   
//    }
//        
//        int min=Integer.MAX_VALUE;int flag=1;int result=0;
//        for (int i = 0; i < n; i++) 
//        if(cost[i]<min)min=cost[i];
//        
//        
//         for (int i = 0; i < n; i++) 
//         {
//        if(cost[i]==Integer.MAX_VALUE){flag=0;System.out.println("-1");break;}
//        else result +=cost[i]+min;
//         }
//                
//                
//                
//         if(flag==1)System.out.println(result-min-min);
//            
//        
//        
//    }
//         
//    
//    
//}
//
//
//
//
//class SimpleGraph {
//    
//    int v;Set s[];int e;
//
//    
//    class Edge
//    { int  from;int to;int weigth;}
//    
//    SimpleGraph(int v)
//    {  
//    this.v=v;e=0;
//    s=new Set[v+1];
//    for (int i = 1; i<=v; i++) 
//    s[i]=new LinkedHashSet<Integer>();
//    }
//    
//    @SuppressWarnings("unchecked")
//    void addEdge(int a,int b)
//    {
//    
//    s[a].add(b);
//    s[b].add(a);
//    e++;
//    }
//  
//    Iterable adj(int a)
//    {return s[a];}
//    
//    
//   
//         
//         
//         
//
//    }




//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//import java.util.Set;
//
//
//public class GALACTIK {
//    
//    public static void main(String args[]) throws Exception {
//    
//        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
//        int n,m,a,b,type=0,c;
//        String x[] = dd.readLine().split(" ");
//        String x1[];
//        n = Integer.parseInt(x[0]);
//        m = Integer.parseInt(x[1]);
//        
//        int id[]=new int[n+1];
//          
//        
//        
////        for (int i = 0; i < m; i++)
////        {
////         
////           x1= dd.readLine().split(" ");
////           a = Integer.parseInt(x1[0]);
////           b = Integer.parseInt(x1[1]);
////           
////          if(id[a]!=0&&id[b]!=0&&id[a]!=id[b])         
////          for (int j = 0; j < n; j++)
////          if(id[j]==id[b])id[j]=id[a];  
////           
////          if(id[a]==0&&id[b]==0){type++;id[a]=type;id[b]=type;}
////          else if(id[b]==0&&id[a]!=0)id[b]=id[a];
////          else  if(id[a]==0&&id[b]!=0)id[a]=id[b];
////             
////          
////         }
////        
////        for (int i = 1; i <=n; i++)if(id[i]==0)id[i]=++type;
//            
//        
//        
//    //    for (int i = 1; i <= n; i++)System.out.print(id[i]+"  ");
//            
//       int cost[]=new int[++type];
//        for (int i = 1; i < type; i++)
//        cost[i]=Integer.MAX_VALUE;   
//        
//       for (int j = 1; j <= n; j++) 
//       {
//         
//          c = Integer.parseInt(dd.readLine());         
//          if(cost[id[j]]>c&&c>0)cost[id[j]]=c;
//              
//       } 
//       
//        System.out.println(type);
//       
//        for (int i = 1; i < type; i++) {
//            System.out.println(cost[i]);   
//    }
//        
//        int min=Integer.MAX_VALUE;int flag=1;int result=0;
//        for (int i = 0; i < type; i++) 
//        if(cost[i]<min)min=cost[i];
//        
//        
//         for (int i = 0; i < type; i++) 
//         {
//        if(cost[i]==Integer.MAX_VALUE){flag=0;System.out.println("-1");break;}
//        else result +=cost[i]+min;
//         }
//                
//                
//                
//         if(flag==1)System.out.println(result-min-min);
//            
//        
//        
//    }
//    
//    
//    
//}











//16 17
//1 2
//1 3
//3 4
//2 4
//4 5
//5 6
//5 7
//6 7
//8 9
//8 10
//9 10
//9 11
//10 12
//12 13
//12 14
//13 14
//15 16
//4
//10
//8
//2
//6
//5
//3
//10
//2
//13
//1
//14
//16
//15
//17
//18


//16 17
//1 2
//1 3
//3 4
//2 4
//4 5
//5 6
//5 7
//6 7
//8 9
//8 10
//9 10
//9 11
//10 12
//12 13
//12 14
//13 14
//15 16
//4
//10
//8
//-2
//6
//-5
//3
//10
//-2
//-13
//-1
//14
//16
//15
//-17
//-18


//16 17
//1 2
//1 3
//3 4
//2 4
//4 5
//5 6
//5 7
//6 7
//8 9
//8 10
//9 10
//9 11
//10 12
//12 13
//12 14
//13 14
//15 16
//400
//1000
//800
//200
//600
//500
//300
//1000
//-200
//-1300
//-100
//1400
//1600
//1500
//1700
//-1800



//            
////       for (int i =1; i <=n; i++)     checked
////          System.out.print(id[i]+" ");  
////        System.out.println();   
//        
//       typecost=new int[type+1];
//        
//        for (int i = 0; i <=type; i++)
//        typecost[i]=Integer.MAX_VALUE;
//            
//        for (int i = 1; i <= n; i++) 
//        {
//         c = Integer.parseInt(dd.readLine());
//         if(c<typecost[id[i]]&&c>=0)typecost[id[i]]=c;
//        }
//                
//        int min=Integer.MAX_VALUE;int flag=1;int sum=0;
//        for (int i = 1; i <=type; i++) 
//        if(typecost[i]<min)min=typecost[i];
//        
////      System.out.println();
////       System.out.println("Min  "+min);
////        System.out.print("Typecosts   ");
//        
//        if(type>1){
//         for (int i = 1; i <=type; i++) 
//         {
//     // System.out.print(typecost[i]+"   ");    
//        if(typecost[i]==Integer.MAX_VALUE){flag=0;System.out.println();System.out.println("-1 Fuck");break;}
//        else sum +=typecost[i]+min;
//         }}
//        
//        else{flag=0;System.out.println(0);}       
//          
//   //   for (int i = 0; i <=type; i++)System.out.print(typecost[i]+"  ");
////            
////         System.out.println();
////         
////         System.out.println("Sum"+sum);
////       System.out.println();
////       
////         
//                
//        if(flag==1)System.out.print(sum-min-min);
//            
//        
// //       System.out.println("WA");
//    