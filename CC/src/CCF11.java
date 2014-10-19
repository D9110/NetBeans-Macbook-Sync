import java.io.BufferedReader;
import java.io.InputStreamReader;           //FROGV July14 00000000000
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;                      //EVERY THING GIVES WRONG ANSWERS
import java.util.StringTokenizer;

 class CCF11 {
    public static void main(String args[])throws Exception
  {
  BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
          
 
  int n,k,p;
 
  String[] x=dd.readLine().split(" ");
  n=Integer.parseInt(x[0]);k=Integer.parseInt(x[1]);p=Integer.parseInt(x[2]);
  
  int frogno1,frogno2;
  
  
  StringTokenizer st=new StringTokenizer(dd.readLine());
  
  List<Integer> l=new ArrayList<>();
  Set<Integer> set=new LinkedHashSet<>();
  List<Integer> l1=new ArrayList<>();
   l.add(-1);
  for(int i=1;i<=n;i++)
  l.add(Integer.parseInt(st.nextToken()));
   
  set.addAll(l);
  l1.addAll(set);
  
  Collections.sort(l1);

 for(int i=1;i<=p;i++)
{
   int current,end;int flag=1;
   x=dd.readLine().split(" ");    
   frogno1=Integer.parseInt(x[0]);
   frogno2=Integer.parseInt(x[1]);
  // for(int k1:l1)System.out.print(k1+" ");
  //  System.out.println();
   current=l1.indexOf(l.get(frogno1));
   end=l1.indexOf(l.get(frogno2));
  //  System.out.println(current+" "+end);
    //   System.out.println(k);
   while(current<end)
 {  if(current<l1.size()-1){
            // System.out.println(l1.get(current+1)-l.get(current)<=k);current++;
   if(l1.get(current+1)-l.get(current)<=k){System.out.println(current);current++;}
   else{ System.out.println("No");flag=0;break;}}
    
 }
 
 if(flag==1)
  System.out.println("Yes");

 
 
}
  
}        
}

