
package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class ClientSide
{
     public static void main(String[] args) throws IOException
    {
     Socket s=new Socket("localhost", 60010);
           //BufferedReader in = new BufferedReader(
                         //   new InputStreamReader(s.getInputStream()));
            BufferedWriter out = new BufferedWriter(
                            new OutputStreamWriter(s.getOutputStream()));    
            out.write("12");
   // System.out.println(in.readLine());
    
    
    
    }
}
