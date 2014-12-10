
package oops.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;


public class EmployeeList implements Iterable<Employee> {

    private final List<Employee> employeeList;
    
    @Override
    public Iterator<Employee> iterator() {
        return employeeList.iterator();
    }

    private EmployeeList() {
        
        employeeList=new ArrayList<>();
    }
 
    
    void addEmployee(String ID,String name, String DOB, String Address, String phoneNo,Stack<String> positionsHeld)
    {
        employeeList.add(new Employee(ID,name,DOB,Address,phoneNo,positionsHeld) {private static final long serialVersionUID = 1L;
        });
    }

    void addEmployee(Employee employee)
    {
    employeeList.add(employee);
    }
    
    private List<Employee> getEmployeeList() {
        return employeeList;
    }
    

        public static EmployeeList getInstance() {
        return EmployeeListHolder.INSTANCE;
    }
    
    private static class EmployeeListHolder {

        private static final EmployeeList INSTANCE = new EmployeeList();
    }
    
}
