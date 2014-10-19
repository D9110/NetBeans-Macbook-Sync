import java.io.*;

//3429756
//2604274
//712527189
//554336208
//149074316
//820323126
//110178558
//818736244
//13597644
//491895756
//158545188
//986662592
//479156901
//97124860
//780293721
//133524528
//687327215
//205863728
//468271368
//895909376






public class CHMOD1
{
    
       private static int totalchars=0,offset=0;
    private static InputStream stream;
    private static byte[] buffer=new byte[1024];
    
    public static void main(String args[]) throws Exception {
     
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        stream=System.in;
        int n =readInt();
        
        int ar[];ar = new int[n+1];
        int l,r,k;
        
        int primes[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
        
      
        
        int cumprimes[][]=new int[n+1][primes.length];
        
//        for(int i=1;i<=n;i++)
//        {
//        k=readInt();      
//        for(int j=0;j<primes.length;j++)
//        while(k%primes[j]==0)
//        {k=k/primes[j];cumprimes[i][j]++;}
//        }
        
        for (int i = 1; i <= n; i++)
        {   k=readInt(); 
        for (int j = 0; j < primes.length; j++)
        {   
              while(k%primes[j]==0)
             {k=k/primes[j];cumprimes[i][j]++;}
            cumprimes[i][j]+=cumprimes[i-1][j];   
        }
        }
        
        
        int t =readInt();
        long y,x,result,mod,modulopower;
       
        
        
        for (int t1 = 1; t1 <= t; t1++) 
        {           
           
            l = readInt();
            r = readInt();
            mod = readLong();
            result=1L;
            
            
            for(int i=0;i<25;i++)
            {
            x=(long) primes[i];  
            y=cumprimes[r][i]-cumprimes[l-1][i];
            modulopower=modularExponentiation(x,y,mod);
            result=(result*modulopower)%mod;
            
            } 
            System.out.println(result);
            
        }
        
   
        
        
        
        
        
    }
 static long modularExponentiation(long x, long y, long mod)
    {
       long res=1L;
       while(y>0)
      {
      if((y&1)==1)
      res=(res*x)%mod;
      y=y>>1;
      x=(x*x)%mod;
      }
      return res;
    }

//   static long modularExponentiation(long x,long y,long mod)
//    {
//    if (y == 0) return 1;
//    long t = modularExponentiation(x, y/2,mod);
//    long c = (t * t) %mod;
//    if (y % 2 == 1)
//    c = (c * x) % mod;
//    return c;
//
//    }
   
    
        private static int readByte() 
        {
    if(totalchars < 0)
    return 0;
    if(offset >= totalchars) {
    offset = 0;
    try
    {
    totalchars = stream.read(buffer);
    }
    catch(IOException e)
    {
    return 0;
    }
    if(totalchars <= 0)
    return -1;
    }
    return buffer[offset++];
    }
    private static int readInt()
    {
    int number=readByte();
    while(eolchar(number))
    number=readByte();
    int sign=1;
    int val=0;
    if(number=='-')
    {
    sign=-1;
    number=readByte();
    }
    do
    {
    if((number<'0')||(number>'9'))
    return 0;
    val*=10;
    val+=(number-'0');
    number=readByte();
    }
    while(!eolchar(number));
    return sign*val;
    }
    private static long readLong()
    {
    int number=readByte();
    while(eolchar(number))
    number=readByte();
    int sign=1;
    long val=0;
    if(number=='-')
    {
    sign=-1;
    number=readByte();
    }
    do
    {
    if((number<'0')||(number>'9'))
    {
    //return sign*val;
    return 0;
    }
    val*=10;
    val+=(number-'0');
    number=readByte();
    }
    while(!eolchar(number));
    return sign*val;
    }
    private static boolean eolchar(int c)
    {
    return c==' '||c=='\n'||c==-1||c=='\r'||c=='\t';
    }
    

}

//6
//98 99 98 99 66 71
//6
//1 6 71
//1 6 31
//2 5 56
//2 3 100
//3 6 64
//3 5 96

//0 5 28 2 20 12

//4930121
//56712160
//21723159
//38450514
//10343301
//85406640
//31029062
//84336910
//91895760
//95909376
//50098134
//82319838
//82673421
//21953712
//52561761
//42229590
//72656949






//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//
//class CHMOD {
//
//    public static void main(String args[]) throws Exception {
//        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
//        
//        int daddy=1000000007;
//        int n = Integer.parseInt(dd.readLine());StringTokenizer st;st = new StringTokenizer(dd.readLine());
//        int ar[];ar = new int[n+1];
//        int l,r,m,k;
//        String x[];
//        
//        int primes[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
//        
//        for (int i = 1; i <=n; i++)
//        ar[i]= Integer.parseInt(st.nextToken()); 
//        
//        int cumprimes[][]=new int[n+1][primes.length];
//        
//        for(int i=1;i<=n;i++)
//        {
//        k=ar[i];      
//        for(int j=0;j<primes.length;j++)
//        while(k%primes[j]==0){k=k/primes[j];cumprimes[i][j]++;}
//        }
//        
////        for (int i = 0; i <=n; i++) 
////        {
////            for (int j = 0; j < primes.length; j++)
////                System.out.print(cumprimes[i][j]+" ");   
////                
////            System.out.println();
////        }       
////            
//        
//        
//        for (int i = 1; i <= n; i++)
//        for (int j = 0; j < primes.length; j++)
//        cumprimes[i][j]+=cumprimes[i-1][j];       
//                 
////        System.out.println();
////        
////        for (int i = 0; i <=n; i++) 
////        {
////            for (int j = 0; j < primes.length; j++)
////            System.out.print(cumprimes[i][j]+" ");                  
////            System.out.println();
////        }       
////           
//        
//               
//        int t = Integer.parseInt(dd.readLine());
//        long total,ans=1L,temp;
//       
//        for (int t1 = 1; t1 <= t; t1++) 
//        {           
//            x = dd.readLine().split(" ");
//            l = Integer.parseInt(x[0]);
//            r = Integer.parseInt(x[1]);
//            m = Integer.parseInt(x[2]);
//            long m1=(long) m;
//            ans=1L; 
//            
//           for(int i=0;i<primes.length;i++)
//           {
//           total=cumprimes[r][i]-cumprimes[l-1][i];                       
//           temp=repeatedSquaring(primes[i],total,m1);
//           ans=(ans*temp)%m1;
//           }
//           
//          System.out.println(ans%m1);                                    
//        }              
//    }
//
//    private static long repeatedSquaring(long x, long y, long mod)
//    {
//       long res=1L;
//       while(y>0)
//      {
//      if((y&1)==1)
//      res=(res*x)%mod;
//      y=y>>1;
//      x=(x*x)%mod;
//      }
//      return res;
//    }
//    
//    
//    
//}
////    1 ≤ N ≤ 100,000
////    1 ≤ Ai ≤ 100
////    1 ≤ T ≤ 100,000
////    1 ≤ Li ≤ Ri ≤ N
////    1 ≤ Mi ≤ 109
//
////319693472
////1000000007
////398925559


//import java.io.*;
//import java.util.StringTokenizer;
//
////3429756
////2604274
////712527189
////554336208
////149074316
////820323126
////110178558
////818736244
////13597644
////491895756
////158545188
////986662592
////479156901
////97124860
////780293721
////133524528
////687327215
////205863728
////468271368
////895909376
//
//
//
//
//
//
//public class CHMOD
//{
//    public static void main(String args[]) throws Exception {
//     
//        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
//        
//        int n = Integer.parseInt(dd.readLine());
//        StringTokenizer st;st = new StringTokenizer(dd.readLine());
//        int ar[];ar = new int[n+1];
//        int l,r,m,k;
//        String x1[];
//        
//        int primes[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97};
//        
//        for (int i = 1; i <=n; i++)
//        ar[i]= Integer.parseInt(st.nextToken()); 
//        
//        int cumprimes[][]=new int[n+1][primes.length];
//        
//        for(int i=1;i<=n;i++)
//        {
//        k=ar[i];      
//        for(int j=0;j<primes.length;j++)
//        while(k%primes[j]==0)
//        {k=k/primes[j];cumprimes[i][j]++;}
//        }
//        
//        for (int i = 1; i <= n; i++)
//        for (int j = 0; j < primes.length; j++)
//        cumprimes[i][j]+=cumprimes[i-1][j];       
//        
//        
//        int t = Integer.parseInt(dd.readLine());
//        long y,x,result,mod,modulopower;
//       
//        
//        
//        for (int t1 = 1; t1 <= t; t1++) 
//        {           
//            x1= dd.readLine().split(" ");
//            l = Integer.parseInt(x1[0]);
//            r = Integer.parseInt(x1[1]);
//            m = Integer.parseInt(x1[2]);
//            result=1L;
//            mod=(long) m;
//            
//            for(int i=0;i<25;i++)
//            {
//            x=(long) primes[i];  
//            y=cumprimes[r][i]-cumprimes[l-1][i];
//            modulopower=modularExponentiation(x,y,mod);
//            result=(result*modulopower)%mod;
//            
//            } 
//            System.out.println(result);
//            
//        }
//        
//   
//        
//        
//        
//        
//        
//    }
//
//   static long modularExponentiation(long x,long y,long mod)
//    {
//    if (y == 0) return 1;
//    long t = modularExponentiation(x, y/2,mod);
//    long c = (t * t) %mod;
//    if (y % 2 == 1)
//    c = (c * x) % mod;
//    return c;
//
//    }
//   
//       private static int totalchars=0,offset=0;
//    private static InputStream stream;
//    private static byte[] buffer=new byte[1024];
//        private static int readByte() 
//        {
//    if(totalchars < 0)
//    return 0;
//    if(offset >= totalchars) {
//    offset = 0;
//    try
//    {
//    totalchars = stream.read(buffer);
//    }
//    catch(IOException e)
//    {
//    return 0;
//    }
//    if(totalchars <= 0)
//    return -1;
//    }
//    return buffer[offset++];
//    }
//    private static int readInt()
//    {
//    int number=readByte();
//    while(eolchar(number))
//    number=readByte();
//    int sign=1;
//    int val=0;
//    if(number=='-')
//    {
//    sign=-1;
//    number=readByte();
//    }
//    do
//    {
//    if((number<'0')||(number>'9'))
//    return 0;
//    val*=10;
//    val+=(number-'0');
//    number=readByte();
//    }
//    while(!eolchar(number));
//    return sign*val;
//    }
//    private static long readLong()
//    {
//    int number=readByte();
//    while(eolchar(number))
//    number=readByte();
//    int sign=1;
//    long val=0;
//    if(number=='-')
//    {
//    sign=-1;
//    number=readByte();
//    }
//    do
//    {
//    if((number<'0')||(number>'9'))
//    {
//    //return sign*val;
//    return 0;
//    }
//    val*=10;
//    val+=(number-'0');
//    number=readByte();
//    }
//    while(!eolchar(number));
//    return sign*val;
//    }
//    private static boolean eolchar(int c)
//    {
//    return c==' '||c=='\n'||c==-1||c=='\r'||c=='\t';
//    }
//    
//
//}
