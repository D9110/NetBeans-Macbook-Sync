
package oops.project;

import java.util.Iterator;
import java.util.List;


public interface HR {
    
 void takeInterviews(List<Employee> employeeList);
 void doPromotions(List<Employee> employeeList,List<Boolean> promotionStatus);
 void setEmployeeInfo(int EmployeeID);
 void getEmployeeInfo(int EmployeeID); 
     
}

class HumanResource implements HR
{

    @Override
    public void takeInterviews(List<Employee> employeeList) {
       
    }

    @Override
    public void doPromotions(List<Employee> employeeList, List<Boolean> promotionStatus) {
        
        Iterator<Employee> employeeIterator=employeeList.iterator();
        
       for(Boolean promotion:promotionStatus)
       {
       if(promotion)
       {
       employeeIterator.next();         //ADD promtion code
       }
       
       }
    }


    @Override
    public void setEmployeeInfo(int EmployeeID) {
      
    }

    @Override
    public void getEmployeeInfo(int EmployeeID) {
       
    }

    

     
}

