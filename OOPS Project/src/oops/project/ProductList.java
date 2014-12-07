
package oops.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductList implements Iterable<Product> {

    private List<Product> productList;
    
    @Override
    public Iterator<Product> iterator() {
     return productList.iterator();
    }

    private ProductList() {
        productList=new ArrayList<>();
    } 
    
    public void addProduct(Product product)
    {
    
    productList.add(product);
    
    }        
    
     private List<Product> getProductList() {
        return productList;
    }   
     
    public static ProductList getInstance() {
        return ProductListHolder.INSTANCE;
    }
    
    private static class ProductListHolder {

        private static final ProductList INSTANCE = new ProductList();
    }
    

}
