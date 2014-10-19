
import java.io.BufferedReader;
import java.io.InputStreamReader;


class HELLO1 {

    public static void main(String args[]) throws Exception {
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(dd.readLine());
        String x[];
        double rate,drate,c1,c2;
        int umin,nplans,months,cost;
        int best;
        
        
       
        for (int t1 = 1; t1 <= t; t1++) {
           best=0;
           
           x = dd.readLine().split(" ");  
           drate = Double.parseDouble(x[0]);
         //  drate=Math.round(drate* 100.0) / 100.0;
          
           umin = Integer.parseInt(x[1]);
           nplans = Integer.parseInt(x[2]);
           
           c1=drate*umin;
      
            for (int i = 1; i <=nplans; i++) 
            {
             x = dd.readLine().split(" ");  
             months = Integer.parseInt(x[0]);
             rate= Double.parseDouble(x[1]);
       
             cost = Integer.parseInt(x[2]);   
             
             c2=((cost+(months*umin*rate)))/months;
     
              if(c2<c1) 
              {c1=c2;best=i;}
             
            }
            System.out.println(best);   
        }
    }    
    
}
