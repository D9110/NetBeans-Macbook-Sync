package dtext;

import java.util.ArrayList;
import java.util.List;
import javax.swing.text.StyledEditorKit;

public class Encoder
{
    
 List<FontObject> vect;
Encoder ()
{
    vect=new ArrayList<FontObject>();
}
 public static void main(String args[])throws Exception
{}
void encode()
{
 vect.add(new FontObject("","",""));
}
void print()
{
for(FontObject fo:vect)
    System.out.print(fo);


StyledEditorKit h; 
}

}
