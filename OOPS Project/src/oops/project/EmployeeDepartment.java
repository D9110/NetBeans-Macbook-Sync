
package oops.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class EmployeeDepartment {
    
    private HashMap<String,List<Employee>> employeeDepartment=new HashMap<>();

    public HashMap<String,List<Employee>> getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(HashMap<String,List<Employee>> employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void addToDepartment(String department,Employee employee)
    {
       
    if(employeeDepartment.containsKey(department))    
    employeeDepartment.get(department).add(employee);
    
    else
    {        
    List<Employee> employeeList =new ArrayList<>();
    employeeDepartment.put(department,employeeList);
    employeeList.add(employee);
    }
    
    }

    public EmployeeDepartment() {
   
        
    }
    
    
    
}
