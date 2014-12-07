
package oops.project;


public class ProductFactory extends AbstractProductEmployeeFactory
{

    @Override
    Product getProduct(String productType) {
                   
    Product product = null;
        
    if("Phones".equals(productType))product= new Phones();
    if("Laptops".equals(productType))product= new Laptops();
    if("Tablets".equals(productType))product= new Tablets();
    if("Acessories".equals(productType))product= new Acessories();
    if("SAAS".equals(productType))product= new SAAS();
    if("OS".equals(productType))product= new OS();
    if("Open Source".equals(productType))product= new OpenSource();
    if("PAAS".equals(productType))product= new PAAS();        
         
    return product;
    }

    @Override
    Employee getEmployee(String employeeType) {
       return null;
    }

}
