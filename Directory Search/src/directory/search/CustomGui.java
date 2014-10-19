
package directory.search;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CustomGui 
{
    
public static void main(String args[])throws Exception
{ 
   new CustomGui().work();
}

    public void work() 
    {
        gui();
    }
    void gui()
    {
    JFrame f=new JFrame("Search Tool");
   // f.setSize(200,100);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    GridBagLayout gb=new GridBagLayout();
    GridBagConstraints gbc=new GridBagConstraints();
    JTextField tf=new JTextField(10);
    f.setLayout(gb);
    gbc.gridx=0;gbc.gridheight=1;gbc.gridwidth=5;
    gbc.gridy=0;//gbc.anchor = GridBagConstraints.NORTHEAST;
    gb.setConstraints(tf,gbc);
    JTextArea ta=new JTextArea("Hello");
    gbc.gridx=0;gbc.gridheight=5;gbc.gridwidth=5;
    gbc.gridy=4;
    gb.setConstraints(ta,gbc);
    f.add(tf);
    f.add(ta);
   
    
    f.setVisible(true);
    
    
    }
}
