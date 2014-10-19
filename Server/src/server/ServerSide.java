

package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSide 
{

    public static void main(String[] args) throws IOException
    {
    
  String line=null;
    ServerSocket ss=new ServerSocket(60010);     
    Socket cs=ss.accept();
     //BufferedWriter out = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream()));
     BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
     //out.write("12");
     while ((line = in.readLine())== null) {
                        System.out.println(in.readLine());
                    }
    //System.out.println(in.readLine());
    
    }
    
}
