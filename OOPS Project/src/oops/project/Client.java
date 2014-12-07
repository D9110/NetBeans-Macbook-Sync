package oops.project;


public class Client {
    
    
    public static void main(String args[]) throws Exception {
     
       
       
      AbstractProductEmployeeFactory apefe=FactoryProducer.getFactory("Employee");
      AbstractProductEmployeeFactory apefp=FactoryProducer.getFactory("Product");
      
      Employee e=apefe.getEmployee();
      Product  p=apefp.getProduct("Tablets");
     
        
    }
    
    //multi year 
 
    // add employee
    // conduct interview
    // add products

    //buy shares
    //buy software
    //buy hardware

    //view employee info
    //view all products and info
    // view revenue info
    // view sorted Lists
    
  
}


