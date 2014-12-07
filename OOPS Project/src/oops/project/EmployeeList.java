
package oops.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EmployeeList implements Iterable<Employee> {

    List<Employee> employeeList;
    
    @Override
    public Iterator<Employee> iterator() {
        return employeeList.iterator();
    }

    public EmployeeList() {
        
        employeeList=new ArrayList<>();
    }

    
    
    public EmployeeList(Employee employee) {
        
        
        
    }
    
    public EmployeeList(String ID,String name, String DOB, String Address, String phoneNo, List<String> positionsHeld)
    {
    employeeList.add(new Employee(ID,name,DOB,Address,phoneNo,positionsHeld));
    }
    
    
    void addEmployee(String ID,String name, String DOB, String Address, String phoneNo, List<String> positionsHeld)
    {
        employeeList.add(new Employee(ID,name,DOB,Address,phoneNo,positionsHeld));
    }
    
    
}