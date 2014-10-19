
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;


class CHEFLR {

    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(dd.readLine());
        String s;int n;
        BigInteger c,k,l;
        k=BigInteger.valueOf(2);
        l=BigInteger.valueOf(1);
        
        for (int t1 = 1; t1 <= t; t1++) {
         
           s= dd.readLine();
           n=s.length();
           c=BigInteger.valueOf(1);
          
           
            for (int i = 0; i < n; i++)
            {
                if(i%2!=0)
                {
                if(s.charAt(i)=='l')//c=2*c-1;
                {  c=c.multiply(k);c=c.subtract(l);}
  
                else //c=2*c+1;
                {c=c.multiply(k);c=c.add(l);}
                }
                
                else
                {
                if(s.charAt(i)=='l')//c=2*c;
                {c=c.multiply(k);}
                
                else// c=2*c+2;
                {c=c.multiply(k);c=c.add(k);}
                }
                
                
            }
            
            System.out.println(c);     
            
        }
        
        
        
        
    }
    
}




class Test
{
    public static void main(String args[]) throws Exception {
        System.out.println("100000 0");
        for (int i = 1; i <= 100000; i++) {
            System.out.println(i);  
        }
        
    }



}







//
//import java.math.BigInteger;
//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Iterator;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Queue;
//
//class Test{
//        public static void main(String args[])
//        {
//            
//       BigInteger bi;
//       bi=new BigInteger("122222222");
//       bi.abs();
//       bi.add(bi);
//            int t=0;
//       while(t++<1000000000)
//       {bi=bi.multiply(bi);System.out.println (bi.toString());}
//          //  System.out.println(bi); 
//            
////      Queue q=new PriorityQueue<>();
////      q.add(6);q.add(8);q.add(1);q.add(4);q.add(7);
////      while(!q.isEmpty())
////                System.out.println(q.remove());
////     Queue q1=new LinkedList<>();
////           
////      q1.add(6);q1.add(8);q1.add(1);q1.add(4);q1.add(7);
////       while(!q1.isEmpty())
////                System.out.println(q1.remove());
////      
//       
//        } 
//}
