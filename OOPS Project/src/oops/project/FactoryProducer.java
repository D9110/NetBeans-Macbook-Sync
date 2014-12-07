
package oops.project;


public class FactoryProducer {
    
    public static AbstractProductEmployeeFactory getFactory(String factoryChoice)
    {
    if("Product".equals(factoryChoice))
    return new ProductFactory();
    
    if("Employee".equals(factoryChoice))
    return new EmployeeFactory();    
    
    return null;
    }
    
}
