package dtext;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.StyledEditorKit;

public class Gui 
{
 

    void ini() throws IOException
    {
    JFrame f=new JFrame("DText");
    f.setSize(800,600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JMenuBar mb=new JMenuBar();
    JMenu m1=new JMenu();
    
 
   GridBagLayout gb=new GridBagLayout();
   GridBagConstraints gbc=new GridBagConstraints();
    f.setLayout(gb);
    //JScrollPane sp=new JScrollPane();
    //f.add(sp);
    
  

   // f.add(ep);
  
    JButton b1=new JButton("O");
    JButton b2=new JButton("S");
    JButton b3=new JButton("B");
    JButton b4=new JButton("I");
    JButton b5=new JButton("U"); 
    JButton b6=new JButton("F");
    JButton b7=new JButton("R");
    
    gbc.gridx=0;//gbc.gridheight=1;gbc.gridwidth=1;
    gbc.gridy=0;
    gb.setConstraints(b1,gbc);
    gbc.gridx=1;//gbc.gridheight=1;gbc.gridwidth=1;
    gbc.gridy=0;
    gb.setConstraints(b2,gbc);
    gbc.gridx=2;//gbc.gridheight=1;gbc.gridwidth=1;
    gbc.gridy=0;
    gb.setConstraints(b3,gbc);
    
    JPanel jp=new JPanel();
  JEditorPane ep=new JEditorPane();  
  // JScrollPane sp=new JScrollPane(ep);
    gbc.gridx=0;//gbc.gridheight=1;gbc.gridwidth=15;
    gbc.gridy=10;
   // gb.setConstraints(sp,gbc);
    TextArea ta=new TextArea();
   gb.setConstraints(ta,gbc);
   // f.add(ep);
   f.add(ta);
    jp.add(b1); jp.add(b2); jp.add(b3);
    f.add(jp);//f.add(sp);
    f.setVisible(true);
    ep.setEditorKit(new StyledEditorKit());
    JTextPane ta1=new JTextPane();
    
    
    
    }







public static void main(String args[])throws Exception{new Gui().ini();}
}


