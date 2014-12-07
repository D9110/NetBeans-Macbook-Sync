
package oops.project;

import java.util.HashMap;
import java.util.LinkedHashMap;


public final class ManagementEmployeePositons {
   
    
    HashMap <String,Integer> managementEmployeePositons;
    
       private ManagementEmployeePositons() {
         
           managementEmployeePositons=new LinkedHashMap<>();
           managementEmployeePositons.put("CTO", 50000);
           managementEmployeePositons.put("CFO", 80000);
           managementEmployeePositons.put("CEO", 10000);
           
           
    }
    
    public static ManagementEmployeePositons getInstance() {
        return NewManagementEmployeePositonsHolder.INSTANCE;
    }
    
    private static class NewManagementEmployeePositonsHolder {

        private static final ManagementEmployeePositons INSTANCE = new ManagementEmployeePositons();
    }
}
