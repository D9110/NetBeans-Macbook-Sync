
package oops.project;

public class EmployeeFactory extends AbstractProductEmployeeFactory
{

    @Override
    Product getProduct(String productType) {
       return null;
       
    }

    @Override
    Employee getEmployee(String employeeType) {
        
        Employee employee = null;
        
        if(employeeType=="SoftwareEmployee")employee=new SoftwareEmployee();
        if(employeeType=="HardwareEmployee")employee=new HardwareEmployee();
        if(employeeType=="ManagementEmployee")employee=new ManagementEmployee();
        
        return employee;
        
    }
    
    
    
    
}
