package oops.project;

import java.util.List;

public interface Hardware {                                                             //MAKE INTERFACE FOR ALL
 
 void printPartDetails();   
 void compareWithOtherHardwareProducts(Product... product);   

}

class Tablets extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    private String screenSize;
    private String processor;
    private String OS;
    private String storage;
    private Boolean cellular;

    public Tablets(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Tablets() {
     super(); ProductList.getInstance().addProduct(this);
    }

    public String getScreenSize() {
        return screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOS() {
        return OS;
    }

    public String getStorage() {
        return storage;
    }

    public Boolean getCellular() {
        return cellular;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setCellular(Boolean cellular) {
        this.cellular = cellular;
    }

    @Override
    public void compareWithOtherHardwareProducts(Product... product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printPartDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    


}

class Phones extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private String screenSize;
    private String processor;
    private String OS;
    private String storage;    
    
    public Phones(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    
    
    Phones() {
     super();  ProductList.getInstance().addProduct(this);
    } 

    public String getScreenSize() {
        return screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOS() {
        return OS;
    }

    public String getStorage() {
        return storage;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public void compareWithOtherHardwareProducts(Product... product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printPartDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}

class Laptops extends Product implements Hardware{
    
    private static final long serialVersionUID = 1L;

    private String processor;
    private String OS;
    private String graphicsCard;
    private String ram;
    private String storage;
    private Boolean flash;
    private Boolean retina;   
    
    
    public Laptops(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Laptops() {
      super();  ProductList.getInstance().addProduct(this); 
    }

    public String getProcessor() {
        return processor;
    }

    public String getOS() {
        return OS;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public Boolean getFlash() {
        return flash;
    }

    public Boolean getRetina() {
        return retina;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void setFlash(Boolean flash) {
        this.flash = flash;
    }

    public void setRetina(Boolean retina) {
        this.retina = retina;
    }

    @Override
    public void compareWithOtherHardwareProducts(Product... product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printPartDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}

class Acessories extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Acessories(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Acessories() {
     super(); ProductList.getInstance().addProduct(this);
    }

    @Override
    public void compareWithOtherHardwareProducts(Product... product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printPartDetails() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
