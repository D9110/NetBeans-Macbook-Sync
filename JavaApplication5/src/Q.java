
public class Q
{ static int ways=0;static String s1="1";static int n;
 static void work(String perm,String temp,int c,String str)
 {
 //System.out.println("temp "+temp);System.out.println("perm "+perm);System.out.println();
// if(c==5){ways++;System.out.println(str);}
      if(c==n)
      { //System.out.println((int)str.charAt(4));System.out.println((int)s1.charAt(0));
      // if((int)str.charAt(n-1)>=(int)s1.charAt(0))
      {ways++;System.out.println(str);s1=str;}}
 else
 for(int i=1;i<temp.length()-1;i++)
 {    int b=1;
     for(int k=0;k<str.length();k++)
     if((int)str.charAt(k)==i-c)b=0;
     if(temp.charAt(i)!='0'&&b==1)
 work(perm.substring(0, i)+"0"+perm.substring(i+1),perm.substring(0, i-1)+"000"+perm.substring(i+2),c+1,str+temp.charAt(i));
 }
 }


public static void main(String args[])throws Exception
{n=5;work("0123450","0123450",0,"");System.out.println(ways);
}
}
