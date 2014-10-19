
public class Hex {
    
 public static void main(String args[])throws Exception
 {  

 //new Hex().encode("attack at dawn");
 new Hex().decode("6c73d5240a948c86981bc294814d");
 }



 void encode(String s)
 {
  
 
 String hex="0123456789abcdef",result="",result1="";int i,k;
 for(i=0;i<s.length();i++)
 {
 k=s.charAt(i);
 result1="";
 while(k!=0)
 {result1=hex.charAt(k%16)+result1;k/=16; }   
 result+=result1;

}
 System.out.println(result);
 }

 void decode(String s)
 
 {
     String hex="0123456789abcdef",result="";int i,k;
 for(i=0;i<s.length()-1;i+=2)
 {   
 result+=(char)((hex.indexOf(s.charAt(i)))*16+(hex.indexOf(s.charAt(i+1))));
 }
System.out.println(result);
 }



}
    

