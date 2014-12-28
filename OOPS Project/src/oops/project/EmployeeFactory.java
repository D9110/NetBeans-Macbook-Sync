
package oops.project;

public class EmployeeFactory extends AbstractProductEmployeeFactory
{

    @Override
    public Product getProduct(String productType) {
       return null;
       
    }

    @Override
    public Employee getEmployee(String employeeType) {
        
        Employee employee = null;
        
        if("SoftwareEmployee".equals(employeeType))employee=new SoftwareEmployee();
        if("HardwareEmployee".equals(employeeType))employee=new HardwareEmployee();
        if("ManagementEmployee".equals(employeeType))employee=new ManagementEmployee();
        
        return employee;
        
    }
    
    
    
    
}
