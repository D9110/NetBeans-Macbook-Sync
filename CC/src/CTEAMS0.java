
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class CTEAMS0 {

   static class Chef
    {
    int age; int r;
 
    Chef(int age,int r)
    {
    this.age=age;this.r=r;
    }
    
    }
    
    
    public static void main(String args[]) throws Exception {
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Chef> pq1 = null,pq2 = null;
       int sum1=0,sum2=0;
        Chef c;
       pq1=new PriorityQueue<Chef>();
       pq2=new PriorityQueue<Chef>();
       
        int n = Integer.parseInt(dd.readLine());
       
        for (int i = 1; i <=n; i++) {
            
            String x[] = dd.readLine().split(" ");
            int age = Integer.parseInt(x[0]);
            int r = Integer.parseInt(x[1]);
            c=new Chef(age,r);
            
            
            if(i%2!=0)
            {

            
            if(c.age>pq2.peek().age&&pq2.peek()!=null)
            {           
            sum2-=pq2.peek().r;
            sum1+=pq2.peek().r;
            pq1.add(pq2.peek());
            pq2.remove();
            pq2.add(c);
            
            }
            else
            {
            pq1.add(c);
            sum1+=c.r;
            }
           
            }
            
            else
            {
            Chef v=(Chef) pq1.toArray()[pq1.size()-1];
            
            
            if(v.age>c.age)
            {           
           sum1+=c.r;
           sum2-=v.age;
           pq2.add(v);
           pq1.add(c);
           pq1.remove(v);
            }
            
            else
            {
            pq2.add(c);
            sum2+=c.r;
            }
            
            } 
            System.out.println(sum1-sum2);   
             
        }
        
    }
    
}
