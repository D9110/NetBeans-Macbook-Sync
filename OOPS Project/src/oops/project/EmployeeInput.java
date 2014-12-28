
package oops.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EmployeeInput<T extends Employee> {
    
    void getInput(T employee)
    {
    
        
        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            
            
            employee.setID(null);
            employee.setName(null);
            employee.setAddress(null);
            employee.setDOB(null);
            employee.setPhoneNo(null);
            
            
            StringTokenizer st= new StringTokenizer(dd.readLine());
            
            while(st.hasMoreTokens())
                employee.setPostionsHeld(st.nextToken());
        } catch (IOException ex) {
            Logger.getLogger(EmployeeInput.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
            
      
       
    }
    
    
    
    
}
