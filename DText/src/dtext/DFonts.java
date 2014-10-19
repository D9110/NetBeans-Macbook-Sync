package dtext;

import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import java.util.List;


public class DFonts 
{
    String fonts[];List<String> fonts1;
public static void main(String args[])throws Exception{new DFonts();}    

    public DFonts() {
        this.fonts = new String[]{"AppleGothic","Arial","Calibri","Courier New","Helvetica","Lucida Sans","Microsoft Sans Serif","Monospaced","Times New Roman"};
 fonts1=new ArrayList<String>(9); 
 for(int i=0;i<9;i++)
    fonts1.add(this.fonts[i]);
    for(String s:fonts1)
        System.out.println(s);
    }

void work()
{
 String msg = "";int i;
    String FontList[];
    GraphicsEnvironment ge =
      GraphicsEnvironment.getLocalGraphicsEnvironment();
    FontList = ge.getAvailableFontFamilyNames();
    for(i = 0; i < FontList.length; i++)
      msg += FontList[i] + " "+"\n";
    System.out.println(msg+i);

}

void work1(String font,int B,int size,int color)
{
String encoding;
encoding="";
//int a=fonts1.BinarySearch(font);

        }















}
