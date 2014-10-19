
public class p {

 
    public class v1
    {int k;
    v1 next;}
    
    
    public static void main(String args[])throws Exception
    {     
        int ar[]=new int[10000];
      new p().storeprimes(ar,100000);
     // for(int i=1;i<10000;i++)
 //  System.out.println(ar[i]);
 v1 head=new p().allocate(100000,200000);
 while(head.next!=null){//System.out.println(head.k);
 head=head.next;}
          }


v1 allocate(int n,int m)
{    v1 v=new v1();v.k=n;v1 head=v;
    for(int i=n+1;i<m;i++){v.next=new v1();v.next.k=i;v=v.next;}v.next=null; 
    return head;
}

void work()
{
  
}


void storeprimes(int ar[],int n)
{int k=0;
for(int i=1;i<=n;i++)
 if(isprime(i))ar[k++]=i;   

}
boolean isprime(int i)
{   
    for( int k=2;k<i/2;k++)
   if(i%k==0)return false;
   return true;
}



}
