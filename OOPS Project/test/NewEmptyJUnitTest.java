
import oops.project.AbstractProductEmployeeFactory;
import oops.project.Employee;
import oops.project.FactoryProducer;
import oops.project.Product;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Devanshu
 */
public class NewEmptyJUnitTest {
    
    
   static AbstractProductEmployeeFactory apefp ;
    
   static AbstractProductEmployeeFactory apefe;
    
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
      assertNull(apefe);
      assertNull(apefp);
        
        
       apefe=FactoryProducer.getFactory("Employee");
       apefp =FactoryProducer.getFactory("Product");
       
       assertNotNull(apefe);
       assertNotNull(apefp);
        
    }
    
    @AfterClass
    public static void tearDownClass() {
       
        
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
        
         
        assertNull(apefe);
      assertNull(apefp);
         
        
    }

    
        
    @Test
    public void TestFactory()
    {
    
 
     Employee e=apefe.getEmployee("SoftwareEmployee");
      Product  p=apefp.getProduct("Tablets"); 
      
      p.setName("check");
      
      assertNotNull(p);
      assertNotNull(p.getName());
    }
    

    
      @Test
    public void TestFactory1()
    {
    
 
     Employee e=apefe.getEmployee("SoftwareEmployee");
      Product  p=apefp.getProduct("Tablets"); 
      
      p.setName("check");
      
      assertNull(p);
      assertNull(p.getName());
    }  
    
    
    
    
    
}
