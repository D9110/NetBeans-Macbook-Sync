
    import java.lang.*;
    import java.io.*;
    import java.util.*;
     
    public class CCF6
    {	
    private static boolean array[] ;
    public static void main (String[] args) throws java.lang.Exception
    {	
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    int N = in.readInt();
    int Q = in.readInt();
    BitSet bitset = new BitSet(N);
    for(int i = 0; i<Q; i++)
    {	
    if(in.readInt() == 1)
    {
    out.println( bitset.get(in.readInt(), in.readInt()+1).cardinality());
    }
    else
    {
    bitset.flip(in.readInt(), in.readInt()+1 );
    }
    }
    out.close();
    }
    }	
    /**/
    class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    public InputReader(InputStream stream) {
    this.stream = stream;
    }
    public int read() {
    if (numChars == -1)
    throw new InputMismatchException();
    if (curChar >= numChars) {
    curChar = 0;
    try {
    numChars = stream.read(buf);
    } catch (IOException e) {
    throw new InputMismatchException();
    }
    if (numChars <= 0)
    return -1;
    }
    return buf[curChar++];
    }
    public int readInt() {
    int c = read();
    while (isSpaceChar(c))
    c = read();
    int sgn = 1;
    if (c == '-') {
    sgn = -1;
    c = read();
    }
    int res = 0;
    do {
    if (c < '0' || c > '9')
    throw new InputMismatchException();
     res *= 10;
    res += c - '0';
    c = read();
    } while (!isSpaceChar(c));
    return res * sgn;
    }
    // is whitespace??
    public boolean isSpaceChar(int c)
    {
    return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
    }
   





/* import java.lang.*;
    import java.util.*;
     
    public class CCF6
    {	
    public static void main (String[] args) throws java.lang.Exception
    {	
    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    BitSet bitset = new BitSet(n);
    for(int i = 0; i<q; i++)
    {	
    if( sc.nextInt()== 1)
    {
    System.out.println( bitset.get(sc.nextInt(),sc.nextInt() +1).cardinality());
    }
    else
    {
    bitset.flip(sc.nextInt(),sc.nextInt()+1 );
    }
    }
    
    }	
    }	
    /**/
    /*
    class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    public InputReader(InputStream stream) {
    this.stream = stream;
    }
    public int read() {
    if (numChars == -1)
    throw new InputMismatchException();
    if (curChar >= numChars) {
    curChar = 0;
    try {
    numChars = stream.read(buf);
    } catch (IOException e) {
    throw new InputMismatchException();
    }
    if (numChars <= 0)
    return -1;
    }
    return buf[curChar++];
    }
    public int readInt() {
    int c = read();
    while (isSpaceChar(c))
    c = read();
    int sgn = 1;
    if (c == '-') {
    sgn = -1;
    c = read();
    }
    int res = 0;
    do {
    if (c < '0' || c > '9')
    throw new InputMismatchException();
    res *= 10;
    res += c - '0';
    c = read();
    } while (!isSpaceChar(c));
    return res * sgn;
    }
    // is whitespace??
    public boolean isSpaceChar(int c)
    {
    return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
    }

/*import java.util.BitSet;
import java.util.Scanner;
//FLIPCOIN 

public class CCF6 {
    public static void main(String args[])throws Exception
    {
   

    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    int choice,a,b,sum;
   // int arr[]={0,1,0};
   
    	
BitSet bitset = new BitSet(n);
for(int i = 0; i<q; i++)
{	
     choice=sc.nextInt();
    a=sc.nextInt();
    b=sc.nextInt();
if(choice== 1)
{
System.out.println( bitset.get(a,b).cardinality());
}
else
{
bitset.flip(a,b);
}
}

}	
    
    }
    
    

/*import java.util.BitSet;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//FLIPCOIN 

public class CCF6 {
    public static void main(String args[])throws Exception
    {
     Set<Integer> heads=new HashSet<Integer>();

    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int q=sc.nextInt();
    int choice,a,b,sum;
   // int arr[]={0,1,0};
    int ar[]=new int[n];
    for(int t=0;t<q;t++)
    {
    
    choice=sc.nextInt();
    a=sc.nextInt();
    b=sc.nextInt();
    
    if(choice==1)
    {
    sum=0;
    for(int i=a;i<=b;i++)
    if(heads.contains(i))
        sum++;
    System.out.println(sum);
    }
    else
    {
    for(int i=a;i<=b;i++)
    {if(heads.contains(i))heads.remove(i);//  ar[i]=arr[ar[i]+1];
    else heads.add(i);   
    }}
}}
    
    
    
    import java.lang.*;
    import java.io.*;
    import java.util.*;
     
    public class Main
    {	
    private static boolean array[] ;
    public static void main (String[] args) throws java.lang.Exception
    {	
    InputReader in = new InputReader(System.in);
    PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    int N = in.readInt();
    int Q = in.readInt();
    BitSet bitset = new BitSet(N);
    for(int i = 0; i<Q; i++)
    {	
    if(in.readInt() == 1)
    {
    out.println( bitset.get(in.readInt(), in.readInt()+1).cardinality());
    }
    else
    {
    bitset.flip(in.readInt(), in.readInt()+1 );
    }
    }
    out.close();
    }	
    }	
    
    class InputReader {
    private InputStream stream;
    private byte[] buf = new byte[1024];
    private int curChar;
    private int numChars;
    public InputReader(InputStream stream) {
    this.stream = stream;
    }
    public int read() {
    if (numChars == -1)
    throw new InputMismatchException();
    if (curChar >= numChars) {
    curChar = 0;
    try {
    numChars = stream.read(buf);
    } catch (IOException e) {
    throw new InputMismatchException();
    }
    if (numChars <= 0)
    return -1;
    }
    return buf[curChar++];
    }
    public int readInt() {
    int c = read();
    while (isSpaceChar(c))
    c = read();
    int sgn = 1;
    if (c == '-') {
    sgn = -1;
    c = read();
    }
    int res = 0;
    do {
    if (c < '0' || c > '9')
    throw new InputMismatchException();
    res *= 10;
    res += c - '0';
    c = read();
    } while (!isSpaceChar(c));
    return res * sgn;
    }
    // is whitespace??
    public boolean isSpaceChar(int c)
    {
    return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
    }
    }
*/    
    
    
    