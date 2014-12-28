
package oops.project;

import java.util.ArrayList;
import java.util.List;


public final class SoftwareEmployeePositions {
   
   List <String> softwareEmployeePositions;
   List <Integer> softwareEmployeePositionsSalary;
    
  
   private SoftwareEmployeePositions()
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
   
   
      public static SoftwareEmployeePositions getInstance() {
        return NewSoftwareEmployeePositionsHolder.INSTANCE;
    }
    
    private static class NewSoftwareEmployeePositionsHolder {

        private static final SoftwareEmployeePositions INSTANCE = new SoftwareEmployeePositions();
    }
   

}


