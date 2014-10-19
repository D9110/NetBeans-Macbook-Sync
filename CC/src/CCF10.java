//Reach The Point
//Problem code: RETPO
//July 14
//000000000000000000000 Fuck

import java.io.BufferedReader;
import java.io.InputStreamReader;

 class CCF10 {
    public static void main(String args[])throws Exception
  {
  BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
  int t=Integer.parseInt(dd.readLine());
  for(int t1=1;t1<=t;t1++)
  {
  long x,y;
  String str[]=dd.readLine().split(" ");
  x=Long.parseLong(str[0]);
  y=Long.parseLong(str[1]);
  
 if(x>=y){System.out.println((2*2*(x/2))+x%2);}
 else {System.out.println((2*2*(y/2))+y%2);}
  
  }
    
}}









//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
// class CCF10 {
//    public static void main(String args[])throws Exception
//  {
//  BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
//  int t=Integer.parseInt(dd.readLine());
//  for(int t1=1;t1<=t;t1++)
//  {
//  int xc=0,yc=0,x,y,dir=-1,moves=0;
//  String str[]=dd.readLine().split(" ");
//  x=Integer.parseInt(str[0]);
//  y=Integer.parseInt(str[1]);
// // System.out.println(x+" "+y);
//  while(true)
//  {
//  
//   if(xc==x){moves+=Math.abs(y-yc)/2*4+(Math.abs(y-yc)%2);
//   yc=y;}
//   if(yc==y){moves+=Math.abs(x-xc)/2*4+(Math.abs(x-xc)%2); 
//   xc=x;}
//      if(xc==x&&yc==y)break;
//      if(dir==-1)
//      {
//      if(y-yc>=0)yc=yc+1;
//      else yc=yc-1;
//      }
//  
//      else
//      {
//      if(x-xc>=0)xc=xc+1;
//      else xc=xc-1;
//       }
//      
// // System.out.println(xc+" "+yc+" "+dir);
//  moves++;dir*=-1;
//  
//  
// 
//  }
//  
//  System.out.println(moves);
//  
//  
//  }
//    
//}}
//Reach The Point
//Problem code: RETPO
//July 14
//000000000000000000000 Fuck
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
// class CCF10 {
//    public static void main(String args[])throws Exception
//  {
//  BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
//  int t=Integer.parseInt(dd.readLine());
//  for(int t1=1;t1<=t;t1++)
//  {
//  long xc=0,yc=0,x,y,dir=-1,moves=0;
//  String str[]=dd.readLine().split(" ");
//  x=Long.parseLong(str[0]);
//  y=Long.parseLong(str[1]);
//if(y>=x)
//{
//  moves+=Math.abs(x)*2;
//  xc=x;yc=x;
//  
//  moves+=Math.abs(y-yc)/2*4+(Math.abs(y-yc)%2);}
//else{
//   moves+=Math.abs(y)*2;
//  xc=y;yc=y;
//  
//  moves+=Math.abs(x-xc)/2*4+(Math.abs(x-xc)%2);}
//  
//  System.out.println(moves);
//  
//  
//  }
//    
//}}
//
