

package oops.project;

import java.util.ArrayList;
import java.util.List;

public interface MarketableProduct{
    
    void sell();
    void buy();
    void takeBack();    
}


abstract class Product implements MarketableProduct,java.io.Serializable
{   
    private String category;
    private static final long serialVersionUID = 1L;
    private String ID;
    private String name;
    private int price;
    private int model;
    private List<String> features;
    private int volumesAvailable;
    private int totalVolumes;
    private int volumesSold;
    private int inPrice;
    private int outPrice;

    public Product(String category,String ID,String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        
        this.category=category;
        this.ID=ID;
        this.name = name;
        this.price = price;
        this.model = model;
        this.features = features;
        this.volumesAvailable = volumesAvailable;
        this.totalVolumes = totalVolumes;
        this.volumesSold = volumesSold;
        this.inPrice = inPrice;
        this.outPrice = outPrice;
        
        ProductList.getInstance().addProduct(this);
    }

    public Product(String Category) {
        
        this.category=category;
        features= new ArrayList<>();  
        ProductList.getInstance().addProduct(this);
      
    }

    public Product() {
      features= new ArrayList<>(); 
     
    }

    
    
    
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the model
     */
    public int getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(int model) {
        this.model = model;
    }

    /**
     * @return the features
     */
    public List<String> getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    public void setFeatures(List<String> features) {
        this.features = features;
    }
    
    public void addFeatures(String feature)
    {
    features.add(feature);
    
    }

    /**
     * @return the volumesAvailable
     */
    public int getVolumesAvailable() {
        return volumesAvailable;
    }

    /**
     * @param volumesAvailable the volumesAvailable to set
     */
    public void setVolumesAvailable(int volumesAvailable) {
        this.volumesAvailable = volumesAvailable;
    }

    /**
     * @return the totalVolumes
     */
    public int getTotalVolumes() {
        return totalVolumes;
    }

    /**
     * @param totalVolumes the totalVolumes to set
     */
    public void setTotalVolumes(int totalVolumes) {
        this.totalVolumes = totalVolumes;
    }

    /**
     * @return the volumesSold
     */
    public int getVolumesSold() {
        return volumesSold;
    }

    /**
     * @param volumesSold the volumesSold to set
     */
    public void setVolumesSold(int volumesSold) {
        this.volumesSold = volumesSold;
    }

    /**
     * @return the inPrice
     */
    public int getInPrice() {
        return inPrice;
    }

    /**
     * @param inPrice the inPrice to set
     */
    public void setInPrice(int inPrice) {
        this.inPrice = inPrice;
    }

    /**
     * @return the outPrice
     */
    public int getOutPrice() {
        return outPrice;
    }

    /**
     * @param outPrice the outPrice to set
     */
    public void setOutPrice(int outPrice) {
        this.outPrice = outPrice;
    }

    @Override
    public void sell() {
        
        if(volumesAvailable>1)
        volumesAvailable--;
        volumesSold++;
       
    }

    @Override
    public void buy() {
        
        volumesAvailable++;
        totalVolumes++;
    }

    @Override
    public void takeBack() {
       
        volumesAvailable++;
        volumesSold--;
      
    }
    
    
    public void sell(int volume) {
       
        if(volumesAvailable>volume)
        {
        volumesAvailable-=volume;
        volumesSold+=volume;
          
        }      
    }

    public void buy(int volume) {

        volumesAvailable+=volume;
        totalVolumes+=volume;
 
    }

    
    public void takeBack(int volume) {
        
        if(volumesAvailable>volume)
        {
        volumesAvailable+=volume;
        volumesSold-=volume;
          
        }  
      
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }
    
}
