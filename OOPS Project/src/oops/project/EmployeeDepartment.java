
package oops.project;

import java.util.HashMap;


public class EmployeeDepartment {
    
    private HashMap<String,Employee> employeeDepartment=new HashMap<>();

    public HashMap<String,Employee> getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeDepartment(HashMap<String,Employee> employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }

    public void addToDepartment(String department,Employee employee)
    {
    employeeDepartment.put(department, employee);
    
    }

    public EmployeeDepartment() {
        
    
       
        
    }
    
    
    
}
