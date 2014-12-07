
package oops.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


public final class ManagementEmployeePositons {
   
    
    List <String> managementEmployeePositons;
    List <Integer> managementEmployeePositonsSalary;
    
    
       private ManagementEmployeePositons() {
         
           managementEmployeePositons=new ArrayList<>();
           managementEmployeePositonsSalary=new ArrayList<>();
           managementEmployeePositons.add("CTO");
           managementEmployeePositonsSalary.add(50000);
           managementEmployeePositons.add("CFO");
           managementEmployeePositonsSalary.add(80000);
           managementEmployeePositons.add("CEO");
           managementEmployeePositonsSalary.add(100000);
           
           
    }
    
    public static ManagementEmployeePositons getInstance() {
        return NewManagementEmployeePositonsHolder.INSTANCE;
    }
    
    private static class NewManagementEmployeePositonsHolder {

        private static final ManagementEmployeePositons INSTANCE = new ManagementEmployeePositons();
    }
}
