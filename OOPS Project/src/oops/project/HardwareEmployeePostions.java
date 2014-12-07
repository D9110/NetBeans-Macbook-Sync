
package oops.project;

import java.util.ArrayList;
import java.util.List;


public final class HardwareEmployeePostions {
   
   List <String> hardwareEmployeePositions;
   List <Integer> hardwareEmployeePositionsSalary;
    
  
   private HardwareEmployeePostions()
           {
              hardwareEmployeePositions=new ArrayList<>(); 
              hardwareEmployeePositionsSalary=new ArrayList<>();
              
              
              
              hardwareEmployeePositions.add("BeginnerHardwareDeveloper");
              hardwareEmployeePositionsSalary.add(10000);
              hardwareEmployeePositions.add("DatabaseAdministrator");
              hardwareEmployeePositionsSalary.add(15000);
              hardwareEmployeePositions.add("PrimaryHardwareDeveloper");
              hardwareEmployeePositionsSalary.add(20000);
              hardwareEmployeePositions.add("PrincipalHardwareArchitect");
              hardwareEmployeePositionsSalary.add(25000);
              hardwareEmployeePositions.add("SeniorHardwareArchitect");
              hardwareEmployeePositionsSalary.add(30000);
              hardwareEmployeePositions.add("ProductLead");
              hardwareEmployeePositionsSalary.add(35000);
              hardwareEmployeePositions.add("DepartmentHead");                                  
              hardwareEmployeePositionsSalary.add(40000);

           }
   
   
      public static HardwareEmployeePostions getInstance() {
        return NewHardwareEmployeePostionsHolder.INSTANCE;
    }
    
    private static class NewHardwareEmployeePostionsHolder {

        private static final HardwareEmployeePostions INSTANCE = new HardwareEmployeePostions();
    }
   

}


