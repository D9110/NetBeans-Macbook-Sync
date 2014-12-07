package oops.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import static java.lang.System.out;
import java.net.URL;

public class NewClass {

    public static void main(String args[]) throws Exception {

        File f = new File("/Volumes/Macintosh HD/Users/Devanshu/desktop/JavaFormatSourcesCommand.java");
       

        

        File tempUnformattedSource = File.createTempFile("TemporaryUnformattedSource", ".java");
        tempUnformattedSource.deleteOnExit();

        String tempUnformattedSourcePath = tempUnformattedSource.getAbsolutePath();

        copy(f, tempUnformattedSource);

        InputStream formattedSourceStream = new FileInputStream(f);
        InputStream tempUnformattedSourceStream = new FileInputStream(tempUnformattedSource);

        System.out.println(contentEquals(formattedSourceStream,tempUnformattedSourceStream));
        printfile(tempUnformattedSource);
        
        formattedSourceStream.close();
        tempUnformattedSourceStream.close();

      //  new NewClass().call();
    }

    private static void copy(File source, File target) throws IOException {

        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(target);

        // Copy the bits from instream to outstream
        byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }

        in.close();
        out.close();
    }

    static boolean contentEquals(InputStream input1, InputStream input2) throws IOException {

        int ch = input1.read();
        while (-1 != ch) {
            int ch2 = input2.read();
            if (ch != ch2) {
                return false;
            }
            ch = input1.read();
        }

        int ch2 = input2.read();
        return (ch2 == -1);
    }

    private void call() {
        URL resource = getClass().getResource("Hardware.java");
        System.out.println(resource);

    }
    
    
   private static void printfile(File source) throws FileNotFoundException, IOException
    {
     InputStream in = new FileInputStream(source);
     
     byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
     
    }
}
