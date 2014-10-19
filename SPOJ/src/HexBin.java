public class HexBin {
    
 public static void main(String args[])throws Exception
 { System.out.println((int) ' ');System.out.println(("The significance of this general conjecture, assuming its truth, is easy to see. It means that it may be feasible to design ciphers that are effectively unbreakable.".length()));
 }
 void XOR()
 {
 String s1="",s2="",s11,s22,result="";
 int ar[]={0,1,0};
 s11=HB();
 for(int i=0;i<s1.length();i++)
 {    
  int a=Integer.parseInt(s1.charAt(i)+"");
  int b=Integer.parseInt(s2.charAt(i)+"");
 result+=ar[a+b];
 }
 System.out.println(result);

 }
 String HB()
 {
 String s1="4",result=""; 
 String s[]={"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"}; 
 String hex="0123456789abcdef";
 for(int i=0;i<s1.length();i++)
 result+=s[hex.indexOf(s1.charAt(i))];
 return result;
 
 }


}
