
//DIGIJUMP 0




import java.io.BufferedReader;
import java.io.InputStreamReader;
  
class CCF2 
{    static  String s; static int n;//static boolean ar[];
     // static int minhops[];
        public static void main(String args[])throws Exception
    {  BufferedReader dd=new BufferedReader(new InputStreamReader(System.in));
        int i,j;//String str;
       s=dd.readLine();n=s.length();
        // minhops=new int[n];
        for(i=0;;i++)
            {   if(recur(0,i,-1)==1)
            {System.out.println(i);break;}     }       
                
   }
   
   static  int recur(int i,int hop,int last)
{

if(hop==1&&(s.charAt(i)==s.charAt(n-1)||i==n-2))
return 1;
if(i==n-1)
	return 1;
if(hop>1)
{
	int f=0;
	if(i-1!=last&&i>0)
		f=recur(i-1,hop-1,i);
	  if(f==1){//printf("%d",k);
	  return 1;}
	  if(i+1!=last&&i<n-1)
	  	f=recur(i+1,hop-1,i);
	  if(f==1){//printf("%d",k);
	  return 1;}
	  hop--;
for(int k=0;k<n;k++)
{
if(s.charAt(k)==s.charAt(i)&&k!=i)
{
	//printf("%d",k);
if(k-1!=last&&k>0)
	f=recur(k-1,hop-1,k);
  if(f==1){//printf("%d",k);
  return 1;}
  if(k+1!=last&&k<n-1)
  	f=recur(k+1,hop-1,k);
  if(f==1){//printf("%d",k);
  return 1;}
}
}
}
return 0;

}
}     
  






























 




  /*  while(str.length()!=0)
        {   t=str.indexOf(s.charAt(i));
             if(t==-1)break;
             else
             {    c+=t;
                 str=s.substring(t+1,s.length());
                 System.out.println(t+"    "+str);
                 minhops[c]=minhops[i]+1;
             }
        
          System.out.println("reach 2"); 
         }  */
        





//4294720952905288295823534854887599898908878968170718191188178171871817187298209282938938288370938387398379227903839283928737892892098767890000












        
        
/* static void recur(int c1,int i,int hoptype,boolean ar[])
{  //System.out.println(i+"  "+c1);
if(ar[i])
{
   if(c1<count)
   {
     if(i==n-1)
     {count=c1;//System.out.println("reached  ");
     }
   
     else
     {
     String j=s;int t;
    // if(hoptype==1)
     ar[i]=false;
      for(int i1=0;i1<n;i1++)
         // System.out.print(ar[i1]+"  ");
     while((t=j.lastIndexOf(s.charAt(i)))>0)
     {    
         j=j.substring(0,t);
     //System.out.println(j);
     recur(c1+1,t,0,ar);}
    // System.out.println("reached  1");
     recur(c1+1,i+1,1,ar);//System.out.println("reached  2");
     if(i>0)
     recur(c1+1,i-1,1,ar);//System.out.println("reached  3");
     
     
     }


  }

}





}*/





  /* minhops[0]=0;
        
        for(i=0;i<n;i++)
        {
            
           if(i>0) 
        if(minhops[i]>minhops[i-1]+1)
            minhops[i]=minhops[i-1]+1;
        
         // for(j=i+1;j<n;j++)
       //if(s.charAt(j)==s.charAt(i))
        //if(minhops[j]>minhops[i]+1)
        //   minhops[j]=minhops[i]+1;
        
          j=i;
        while(j!=-1)
        {// System.out.print(j+" ");
        j=s.indexOf(s.charAt(i), j+1);
        if(j!=-1)
        if(minhops[j]>minhops[i]+1)
        minhops[j]=minhops[i]+1;
        
        }
      //  System.out.println();
        
        }
     //   for(i=0;i<n;i++)
       //    System.out.print(minhops[i]+"  ");
        //System.out.println();
       System.out.println(minhops[n-1]);*/