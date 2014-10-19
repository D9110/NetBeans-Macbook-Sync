package directory.search;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class FileWriter 
{
  public static void main(String args[])throws IOException 
  {
  new FileWriter().writer("1");
  }
void writer(String s) throws IOException
{  
    Charset cs=Charset.forName("UTF-16");
    
    

try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("/Users/Devanshu/Downloads/Hello.txt"),cs,StandardOpenOption.APPEND)){
    writer.write(s.toLowerCase(), 0, s.length());writer.newLine();
} catch (IOException x) {
    System.err.format("IOException: %s%n", x);
}

}
}
/*      jTextArea1.setEditable(false);
        try {
            jTextArea1.append((new FileReader().Reader(evt.getActionCommand())));
            jTextArea1.append("\n");
            {;}// TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }*/