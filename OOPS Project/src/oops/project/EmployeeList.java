
package oops.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;


public class EmployeeList implements Iterable<Employee> {

    private List<Employee> employeeList;
    
    @Override
    public Iterator<Employee> iterator() {
        return employeeList.iterator();
    }

    public EmployeeList() {
        
        employeeList=new ArrayList<>();
    }
 
    
    void addEmployee(String ID,String name, String DOB, String Address, String phoneNo,Stack<String> positionsHeld)
    {
        employeeList.add(new Employee(ID,name,DOB,Address,phoneNo,positionsHeld) {});
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    
    void addEmployee(Employee employee)
    {
    employeeList.add(employee);
    }
    
    
    
    
}
