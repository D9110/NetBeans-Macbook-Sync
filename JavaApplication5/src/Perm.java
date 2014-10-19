/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *3628800  0987654321
BUILD SUCCESSFUL (total time: 7 minutes 19 seconds)
 * @author Devanshu
 */ 
public class Perm {static int c=0;
    static void perm(int i1,String s,String s1)
    {   System.out.print(s1);
       if(s1.length()==s.length())
       { c++;System.out.println(c+"  "+s1);}
       else
        for(int i=i1;i<s.length();i++)
        perm(i1+1,s.charAt(i)+s.substring(0,i)+s.substring(i+1),s1+s.charAt(i));
    
    }
public static void main(String args[]){perm(0,"12345678909876545678909876545678987654345678987654587654345678987654567876543458876543456787654","");}
}
