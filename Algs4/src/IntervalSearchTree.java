                                                    
import java.util.Comparator;                                        //FOUND OUT NO WAY OTHER THAN TO CODE FULL RBST with Interval Search
import java.util.TreeSet;


public class IntervalSearchTree {
    public static void main(String args[]) throws Exception {
     TreeSet<node> tst=new TreeSet<node>(new Comparator<node>(){

        
         public int compare(node o1, node o2) {                           //TreeSet with custom ordering via comparator
             if(o1.lo>o2.lo)return 1;
             else return -1;
         }
     });
    
        int size = tst.size();
                                                                                        //Till now it looks that iterate to mid is the only way to get to mid
       
    }
    public class node {node left;node right;int lo,hi,highmost;}
}


////////left = set.headSet(k).last();
////////right = set.tailSet(k).first();

