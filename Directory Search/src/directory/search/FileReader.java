package directory.search;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileReader
{ int flag=1;
    public static void main(String args[])throws IOException 
  {System.out.println(new FileReader().Reader(""));}

    public String Reader(String search) throws IOException
    {     String s,result="";
          Charset cs=Charset.forName("UTF-16"); 
          BufferedReader br=Files.newBufferedReader(Paths.get("/Users/Devanshu/Downloads/Hello.txt"),cs);
          while((s=br.readLine())!=null)
          if(s.indexOf(search)!=-1)result=result+"\n"+s;
         if(result.length()!=0)return result;
          return "Not Found";
    }
}