
package oops.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductList implements Iterable<Product> {

    List<Product> productList;
    
    @Override
    public Iterator<Product> iterator() {
     return productList.iterator();
    }

    public ProductList() {
        productList=new ArrayList<>();
    }
    
    void addHardware(String productType)
    {
    
    Product addedProduct = null;    
    if("Phones".equals(productType));
    if("Laptops".equals(productType));
    if("Tablets".equals(productType));
    if("Acessories".equals(productType));
    
    productList.add(addedProduct);
    
    }
    
    void addSoftware(String productType)
    {
        
       Product addedProduct = null;     
    if("SAAS".equals(productType));
    if("OS".equals(productType));
    if("Open Source".equals(productType));
    if("PAAS".equals(productType));
    
    productList.add(addedProduct);
    
    }
    
   
    
}
