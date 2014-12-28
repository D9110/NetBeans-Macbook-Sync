
package oops.project;

import java.util.ArrayList;
import java.util.List;


public class ManagementEmployeePositions {
   
    
    List <String> managementEmployeePositions;
    List <Integer> managementEmployeePositionsSalary;
    
    
       private ManagementEmployeePositions() {
         
           managementEmployeePositions=new ArrayList<>();
           
           managementEmployeePositionsSalary=new ArrayList<>();
           managementEmployeePositions.add("CTO");
           managementEmployeePositionsSalary.add(50000);
           managementEmployeePositions.add("CFO");
           managementEmployeePositionsSalary.add(80000);
           managementEmployeePositions.add("CEO");
           managementEmployeePositionsSalary.add(100000);
            
    }
    
    public static ManagementEmployeePositions getInstance() {
        return ManagementEmployeePositionsHolder.INSTANCE;
    }
    
    private static class ManagementEmployeePositionsHolder {

        private static final ManagementEmployeePositions INSTANCE = new ManagementEmployeePositions();
    }
}
