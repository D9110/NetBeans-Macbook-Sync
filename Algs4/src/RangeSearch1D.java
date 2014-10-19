
import java.util.Iterator;
import java.util.TreeSet;

public class RangeSearch1D {     //IT HAS TO BE DONE WITH RANK,BUT CURRENTLY I'VE IMPLEMENTED IT BY COLLECTIONS METHODS-------WHOSE COMPLEXITY I DONOT KNOW
    
    
    class node{node left;node right;int n;}

    public static void main(String args[]) throws Exception {
        
        TreeSet<Integer> tst = new TreeSet<>();                     //inbuilt RBST

        for (int i = 1; i <= 100; i += 3) {
            tst.add(i);
        }
        
         tst.add(36);tst.add(45);tst.add(100);
         System.out.println(tst.ceiling(Integer.SIZE));
         System.out.println(Integer.BYTES);
         System.out.println(Integer.MAX_VALUE);
         System.out.println(Integer.MIN_VALUE);
         System.out.println(Integer.hashCode(4));               //random cool stuff
        
         System.out.println(tst.floor(36));

        Iterator i= tst.descendingIterator();
        System.out.println();
        for(int k:tst.subSet(20,71))System.out.println(k);//RANGE IS GIVEN IN THIS FUNCTION
         System.out.println();
        
        
        while(i.hasNext())System.out.println(i.next());      //ITERATOR USE
          System.out.println();
        tst.stream().forEach((k) -> {
           System.out.println(k);
        });

     
    
    
    
    }
}
