
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class CIRKILL1 {
     
    static class point {double x,y;point(double x,double y){this.x=x;this.y=y;}}
    
    public static void main(String args[]) throws Exception {
        
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        int n;
        double kill=0,total=0;
        point a,b,c,d,centre;
        int t = Integer.parseInt(dd.readLine());
        
        point inp[];
        
        for (int t1 = 1; t1 <= t; t1++)
        {
         
            n = Integer.parseInt(dd.readLine());
            inp=new point[n];kill=0;total=0;
            
            for (int t2 = 0; t2 < n; t2++) 
            {
                String x[] = dd.readLine().split(" ");
                inp [t2]= new point(Integer.parseInt(x[0]),Integer.parseInt(x[1]));
                
            }    
            
            
               for (int i = 0; i < n; i++)
               for (int j = i+1; j < n; j++) 
               for (int k = j+1; k < n; k++)  
                {
                     
                 a=inp[i]; b=inp[j]; c=inp[k];  
                 
                  
                     
                 for(int l=0;l<n;l++)
                  {
                      
                   d=inp[l];  
                   
                   if(l!=i&&l!=j&&l!=k)
                   {  
                     
                   if(isTriangle(a,b,c))
                   {    
                   d=inp[l];
                   centre=center(a,b,c);
                   
//                   System.out.println("Triangle "+"  ("+a.x+","+a.y+") "+"  ("+b.x+","+b.y+") "+ " ("+c.x+","+c.y+") " +"Point  "+"  ("+d.x+","+d.y+") ");
//                   System.out.println("Centre at"+centre.x+","+centre.y+" Center Point Distance"+sqdistance(centre,d)+" Radius"+sqdistance(centre,a));
                   
               
                   if(sqdistance(centre,d)-sqdistance(centre,a)<1e-6)
                   kill++;
//                   System.out.println();System.out.println();
                  
                   }
//                   else{System.out.println("Not Triangle   ("+a.x+","+a.y+") "+"  ("+b.x+","+b.y+") "+ " ("+c.x+","+c.y+") " );System.out.println();System.out.println();}        
                  total++;
                  
                  }
                 
                 
                
                }
              }
               
               
//               System.out.print("  Total  "+total);System.out.print("Kill  "+kill);
               System.out.println(kill/total);
//              System.out.println();System.out.println();
        }
 }
  
    
    
    
    
    
   
    
    
    
    
    
    
    
    
   static point center(point a,point b,point c)
    {
    point ans=new point(0,0);
    double d=2*(a.x*(b.y-c.y)+b.x*(c.y-a.y)+c.x*(a.y-b.y));
    ans.x=((a.x*a.x+a.y*a.y)*(b.y-c.y)+(b.x*b.x+b.y*b.y)*(c.y-a.y)+(c.x*c.x+c.y*c.y)*(a.y-b.y))/d;
    ans.y=((a.x*a.x+a.y*a.y)*(c.x-b.x)+(b.x*b.x+b.y*b.y)*(a.x-c.x)+(c.x*c.x+c.y*c.y)*(b.x-a.x))/d;
   return ans;   
    }
    
   static double sqdistance(point a,point b)
    {
    return ((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
    }
   
   static boolean isTriangle(point a,point b,point c)
   {
   return (a.x*(b.y-c.y) - a.y*(b.x-c.x) + b.x*c.y-c.x*b.y)*0.500000 != 0;
   }
   
   
}




 
//    void inCircle(point a,point b,point c,point d)
//    {
//        
//        
//        
//    
//    }
//    
//    double area(point a,point b,point c)
//{
//    return (a.x*(b.y-c.y) - a.y*(b.x-c.x) + b.x*c.y-c.x*b.y)*0.500000;
//}
//
//   int is_triangle(point a,point b,point c)
//{
//    if(Math.abs(area(a,b,c)) > 0)  
//        return 1;
//    else
//        return 0;
//}
//  
//   double dist(point a, point b)
//{
//    return Math.sqrt(Math.pow((a.x-b.x),2.0) +Math.pow((a.y-b.y),2.0));
//}
//
// int points_diff(point a, point b)
//{
//    if(a.x==b.x && a.y==b.y)
//        return 0;
//    else
//        return 1;
//}
//  point center_coord(point a,point b,point c)
//{
//    point ans=new point(0,0);
//   
//
//    ans.x = a.x - ((((b.y-a.y)*dist(c,a)*dist(c,a)) -  ((c.y-a.y)*dist(b,a)*dist(b,a)))/(2.0*((b.x-a.x)*(c.y-a.y)  - (c.x-a.x)*(b.y-a.y))));
//    ans.y = a.y + (((b.x-a.x)*(dist(c,a)*dist(c,a)) - (c.x-a.x)*(dist(b,a)*dist(b,a)))/(2.0* (((b.x-a.x)*(c.y-a.y))-((c.x-a.x)*(b.y-a.y)))));
//    return ans;
//}   
    