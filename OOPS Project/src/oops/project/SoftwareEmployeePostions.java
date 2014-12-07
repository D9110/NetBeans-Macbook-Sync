
package oops.project;

import java.util.HashMap;
import java.util.LinkedHashMap;


public final class SoftwareEmployeePostions {
   
   HashMap <String,Integer> softwareEmployeePositions;
    
  
   private SoftwareEmployeePostions()
           {
              softwareEmployeePositions=new LinkedHashMap<>(); 
              softwareEmployeePositions.put("BeginnerSoftwareDeveloper",10000);
              softwareEmployeePositions.put("DatabaseAdministrator",15000);
              softwareEmployeePositions.put("PrimarySoftwareDeveloper",20000);
              softwareEmployeePositions.put("PrincipalSoftwareArchitect",25000);
              softwareEmployeePositions.put("SeniorSoftwareArchitect",30000);
              softwareEmployeePositions.put("ProductLead",35000);
              softwareEmployeePositions.put("DepartmentHead",40000);                                  
                               
           }
   
   
      public static SoftwareEmployeePostions getInstance() {
        return NewSoftwareEmployeePostionsHolder.INSTANCE;
    }
    
    private static class NewSoftwareEmployeePostionsHolder {

        private static final SoftwareEmployeePostions INSTANCE = new SoftwareEmployeePostions();
    }
   

}


