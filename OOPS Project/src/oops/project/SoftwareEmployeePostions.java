
package oops.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


public final class SoftwareEmployeePostions {
   
   List <String> softwareEmployeePositions;
   List <Integer> softwareEmployeePositionsSalary;
    
  
   private SoftwareEmployeePostions()
           {
              softwareEmployeePositions=new ArrayList<>(); 
              softwareEmployeePositionsSalary=new ArrayList<>();
              
              
              
              softwareEmployeePositions.add("BeginnerSoftwareDeveloper");
              softwareEmployeePositionsSalary.add(10000);
              softwareEmployeePositions.add("DatabaseAdministrator");
              softwareEmployeePositionsSalary.add(15000);
              softwareEmployeePositions.add("PrimarySoftwareDeveloper");
              softwareEmployeePositionsSalary.add(20000);
              softwareEmployeePositions.add("PrincipalSoftwareArchitect");
              softwareEmployeePositionsSalary.add(25000);
              softwareEmployeePositions.add("SeniorSoftwareArchitect");
              softwareEmployeePositionsSalary.add(30000);
              softwareEmployeePositions.add("ProductLead");
              softwareEmployeePositionsSalary.add(35000);
              softwareEmployeePositions.add("DepartmentHead");                                  
              softwareEmployeePositionsSalary.add(40000);

           }
   
   
      public static SoftwareEmployeePostions getInstance() {
        return NewSoftwareEmployeePostionsHolder.INSTANCE;
    }
    
    private static class NewSoftwareEmployeePostionsHolder {

        private static final SoftwareEmployeePostions INSTANCE = new SoftwareEmployeePostions();
    }
   

}


