
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server 
{


    public static void main(String[] args) throws IOException
    {
        try {
            
            
           URL u=new URL("file:///Users/Devanshu/Downloads/List%20of%20TCP%20and%20UDP%20port%20numbers%20-%20Wikipedia,%20the%20free%20encyclopedia.html");
               System.out.println(u.getPort());
                   System.out.println(u.getPath());
                       System.out.println(u.getHost());
           URLConnection uc=u.openConnection();uc.connect();
           BufferedReader dd=new BufferedReader(new InputStreamReader(uc.getInputStream()));
         //  while(dd.readLine()!=null)
           System.out.println(dd.readLine());
           System.out.println(uc.getContentLengthLong());
           System.out.println(u.getProtocol());
            System.out.println(u.getQuery());
        
        
        } catch (MalformedURLException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
   
        
    }
    
}
