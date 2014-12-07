
package oops.project;

public class EmployeeFactory extends AbstractProductEmployeeFactory
{

    @Override
    Product getProduct(String productType) {
       return null;
       
    }

    @Override
    Employee getEmployee() {
        return new Employee() {};
    }
    
    
    
    
}
