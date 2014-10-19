
import java.io.BufferedReader;  //My first comparator sort
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Devanshu
 */
public class CCF8 {
    
  static   class ob{int n;int rank;}

    static ob ar[];
    
    
    public static void main(String args[])throws Exception{
    BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
    String input=dd.readLine();
    String x[]=input.split(" ");
    int n=Integer.parseInt(x[0]);
    //System.out.print(n);
    //for (int i=0;i<=n;i++)System.out.println(Integer.parseInt(x[i]));
    ar=new ob[n];
   for(int i=0;i<n;i++)
   { ar[i]=new ob();
  ar[i].n=Integer.parseInt(x[i+1]); 
   ar[i].rank=i;
   }
  
   
   Arrays.sort(ar,new Comparator<ob>() {

        
        public int compare(ob o1, ob o2) {
         Integer i1=o1.n;Integer i2=o2.n;   
        return i1.compareTo(i2);
        }
    });
    
   
   
   for (int i=0;i<n;i++)System.out.println(ar[i].n+"rank"+ar[i].rank);
    }
    
  
}
