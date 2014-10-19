import java.io.IOException;
import javax.swing.*;
import java.net.*;
public class TextView
{
public void veiwer()throws IOException
{
    JFrame f=new JFrame("Viewer");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JEditorPane ep=new JEditorPane();
    URL url=new URL("www.google.com/2.htm");
    ep.setPage(url);
    f.add(ep);}
public static void main(String arg[])throws Exception
{
    new TextView().veiwer();
}

}



