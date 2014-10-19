
 
public class Test2 {
    
    public static void main(String args[]) throws Exception {
     
        System.out.println(60000);
        
        for(int i=1;i<=10000;i++)
        {
            System.out.print("98 99 98 99 66 71 ");
        }
        
        System.out.println();
        System.out.println(10);
        
        for (int i =999999981; i<=1000000000; i++) {
            System.out.println("1 60000 "+i);
        }

       
    }
    
    
    
    
    
    
}

//
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
//      Queue q=new PriorityQueue<>();
//      q.add(6);q.add(8);q.add(1);q.add(4);q.add(7);
//      while(!q.isEmpty())
//                System.out.println(q.remove());
//     Queue q1=new LinkedList<>();
//           
//      q1.add(6);q1.add(8);q1.add(1);q1.add(4);q1.add(7);
//       while(!q1.isEmpty())
//                System.out.println(q1.remove());
//      
//       
//        } 
//}



//      SIEVE
//        boolean ar[]=new boolean[100];
//        for (int i = 0; i <ar.length; i++)
//        
//        
//          ar[i]=true;  
//        
//        for (int i = 2; i <ar.length; i++) 
//           if(ar[i])
//           for(int j=i+i;j<ar.length;j+=i)
//            ar[j]=false;   
//
//        for (int i = 2; i <ar.length; i++)
//            if(ar[i])
//            System.out.print(i+",");



//public class Test1
//{
//
//   
//
//    public static void main(String args[]) throws Exception {
//        BigInteger bi;bi=BigInteger.valueOf(1);
//        
//        for (int i = 1; i <=1000; i++) 
//        {
//            for (int j = 1; j <=100; j++)                         
//            bi=bi.multiply(BigInteger.valueOf(j));
//                   
//        }
//   
//        System.out.println(bi);
//        bi=bi.mod(BigInteger.valueOf(1000000007));
//        System.out.println(bi);
//    }
////398925559
//}