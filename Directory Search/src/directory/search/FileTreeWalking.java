package directory.search;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
public class FileTreeWalking extends SimpleFileVisitor<Path>
{
public static void main(String args[])throws Exception
{
new FileTreeWalking().IW();
}    

    public void IW() throws Exception
    {
     Files.walkFileTree(Paths.get("/Volumes/Time Travel/Movies"), this);
    }

public FileVisitResult preVisitDirectory(Path p,BasicFileAttributes bfa) throws IOException
{  
   DirectoryStream<Path> stream = Files.newDirectoryStream(p);
   for(Path p1 :stream)
   {
   System.out.println(p1.getFileName());
   new FileWriter().writer(p1.getFileName().toString()+"      "+p1.toString());
   }
   return FileVisitResult.CONTINUE;  
}


}
