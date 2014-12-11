package oops.project;


public class Client {
    
    
    public static void main(String args[]) throws Exception {
     
       
       
      AbstractProductEmployeeFactory apefe=FactoryProducer.getFactory("Employee");
      AbstractProductEmployeeFactory apefp=FactoryProducer.getFactory("Product");
      
      Employee e=apefe.getEmployee("SoftwareEmployee");
      Product  p=apefp.getProduct("Tablets");
     
      
    
      
     Tablets t=(Tablets) p;
     t.setOS("ios");
        System.out.println(t.getOS());
        
        t.setInPrice(10000);
        
        Product p1=t;
        
        System.out.println(p1.getInPrice()); 
        
        t.setModel(1);
     
        System.out.println(t.getModel());
        
        t.setTotalVolumes(10000);
        t.setVolumesAvailable(9000);
        
        t.sell(1000);
        
        System.out.println(t.getVolumesAvailable());
        
    ProductInput<Tablets> ps = new ProductInput<>();
      ps.getInput(t);
      
      
      
   
       
        
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


