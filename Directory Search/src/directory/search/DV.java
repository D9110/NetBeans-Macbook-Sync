package directory.search;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DV 
{
   public static void main(String args[])throws IOException
   {new DV().Stream();}

    public void Stream()throws IOException
    {
       Path p=Paths.get("/Users/Devanshu");
       DirectoryStream<Path> stream = Files.newDirectoryStream(p);
       for(Path p1 :stream){System.out.println(p1.getFileName());}
    
    //  Files.createDirectory(Paths.get("/Volumes/Time Travel/m1")); 
         }
   
    
}

