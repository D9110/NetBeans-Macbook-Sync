
package oops.project;

import java.util.HashMap;
import java.util.LinkedHashMap;


public final class HardwareEmployeePostions {
   
   HashMap <String,Integer> hardwareEmployeePositions;
    
  
   private HardwareEmployeePostions()
           {
              hardwareEmployeePositions=new LinkedHashMap<>(); 
              hardwareEmployeePositions.put("BeginnerHardwareDeveloper",10000);
              hardwareEmployeePositions.put("DatabaseAdministrator",15000);
              hardwareEmployeePositions.put("PrimaryHardwareDeveloper",20000);
              hardwareEmployeePositions.put("PrincipalHardwareArchitect",25000);
              hardwareEmployeePositions.put("SeniorHardwareArchitect",30000);
              hardwareEmployeePositions.put("ProductLead",35000);
              hardwareEmployeePositions.put("DepartmentHead",40000);                                  
                               
           }
   
   
      public static HardwareEmployeePostions getInstance() {
        return NewHardwareEmployeePostionsHolder.INSTANCE;
    }
    
    private static class NewHardwareEmployeePostionsHolder {

        private static final HardwareEmployeePostions INSTANCE = new HardwareEmployeePostions();
    }
    
}
   
    
  