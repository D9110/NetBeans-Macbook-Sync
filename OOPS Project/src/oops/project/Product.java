

package oops.project;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface Product extends Serializable{
    
//    void sell();
//    void buy();
//    void takeBack();    
    
    void addFeatures(String feature);

    void buy();

    void buy(int volume);

    boolean equals(Object obj);

    String getCategory();

    /**
     * @return the features
     */
    List<String> getFeatures();

    String getID();

    /**
     * @return the inPrice
     */
    int getInPrice();

    /**
     * @return the model
     */
    int getModel();

    String getName();

    /**
     * @return the outPrice
     */
    int getOutPrice();

    /**
     * @return the price
     */
    int getPrice();

    /**
     * @return the totalVolumes
     */
    int getTotalVolumes();

    /**
     * @return the volumesAvailable
     */
    int getVolumesAvailable();

    /**
     * @return the volumesSold
     */
    int getVolumesSold();

    int hashCode();

    void sell();

    void sell(int volume);

    void setCategory(String category);

    /**
     * @param features the features to set
     */
    void setFeatures(List<String> features);

    void setID(String ID);

    /**
     * @param inPrice the inPrice to set
     */
    void setInPrice(int inPrice);

    /**
     * @param model the model to set
     */
    void setModel(int model);

    void setName(String name);

    /**
     * @param outPrice the outPrice to set
     */
    void setOutPrice(int outPrice);

    /**
     * @param price the price to set
     */
    void setPrice(int price);

    /**
     * @param totalVolumes the totalVolumes to set
     */
    void setTotalVolumes(int totalVolumes);

    /**
     * @param volumesAvailable the volumesAvailable to set
     */
    void setVolumesAvailable(int volumesAvailable);

    /**
     * @param volumesSold the volumesSold to set
     */
    void setVolumesSold(int volumesSold);

    void takeBack();

    void takeBack(int volume);
    
}


abstract class AbstractProduct implements Product
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

    public AbstractProduct(String category,String ID,String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        
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

    public AbstractProduct(String Category) {
        
        this.category=category;
        features= new ArrayList<>();  
        ProductList.getInstance().addProduct(this);
      
    }

    public AbstractProduct() {
      features= new ArrayList<>(); 
     
    }

    
    
    
    /**
     * @return the price
     */
    @Override
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the model
     */
    @Override
    public int getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    @Override
    public void setModel(int model) {
        this.model = model;
    }

    /**
     * @return the features
     */
    @Override
    public List<String> getFeatures() {
        return features;
    }

    /**
     * @param features the features to set
     */
    @Override
    public void setFeatures(List<String> features) {
        this.features = features;
    }
    
    @Override
    public void addFeatures(String feature)
    {
    features.add(feature);
    
    }

    /**
     * @return the volumesAvailable
     */
    @Override
    public int getVolumesAvailable() {
        return volumesAvailable;
    }

    /**
     * @param volumesAvailable the volumesAvailable to set
     */
    @Override
    public void setVolumesAvailable(int volumesAvailable) {
        this.volumesAvailable = volumesAvailable;
    }

    /**
     * @return the totalVolumes
     */
    @Override
    public int getTotalVolumes() {
        return totalVolumes;
    }

    /**
     * @param totalVolumes the totalVolumes to set
     */
    @Override
    public void setTotalVolumes(int totalVolumes) {
        this.totalVolumes = totalVolumes;
    }

    /**
     * @return the volumesSold
     */
    @Override
    public int getVolumesSold() {
        return volumesSold;
    }

    /**
     * @param volumesSold the volumesSold to set
     */
    @Override
    public void setVolumesSold(int volumesSold) {
        this.volumesSold = volumesSold;
    }

    /**
     * @return the inPrice
     */
    @Override
    public int getInPrice() {
        return inPrice;
    }

    /**
     * @param inPrice the inPrice to set
     */
    @Override
    public void setInPrice(int inPrice) {
        this.inPrice = inPrice;
    }

    /**
     * @return the outPrice
     */
    @Override
    public int getOutPrice() {
        return outPrice;
    }

    /**
     * @param outPrice the outPrice to set
     */
    @Override
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
    
    
    @Override
    public void sell(int volume) {
       
        if(volumesAvailable>volume)
        {
        volumesAvailable-=volume;
        volumesSold+=volume;
          
        }      
    }

    @Override
    public void buy(int volume) {

        volumesAvailable+=volume;
        totalVolumes+=volume;
 
    }

    
    @Override
    public void takeBack(int volume) {
        
        if(volumesAvailable>volume)
        {
        volumesAvailable+=volume;
        volumesSold-=volume;
          
        }  
      
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.category);
        hash = 67 * hash + Objects.hashCode(this.ID);
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + this.price;
        hash = 67 * hash + this.model;
        hash = 67 * hash + Objects.hashCode(this.features);
        hash = 67 * hash + this.volumesAvailable;
        hash = 67 * hash + this.totalVolumes;
        hash = 67 * hash + this.volumesSold;
        hash = 67 * hash + this.inPrice;
        hash = 67 * hash + this.outPrice;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractProduct other = (AbstractProduct) obj;
        if (!Objects.equals(this.category, other.category)) {
            return false;
        }
        if (!Objects.equals(this.ID, other.ID)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        if (this.model != other.model) {
            return false;
        }
        if (!Objects.equals(this.features, other.features)) {
            return false;
        }
        if (this.volumesAvailable != other.volumesAvailable) {
            return false;
        }
        if (this.totalVolumes != other.totalVolumes) {
            return false;
        }
        if (this.volumesSold != other.volumesSold) {
            return false;
        }
        if (this.inPrice != other.inPrice) {
            return false;
        }
        if (this.outPrice != other.outPrice) {
            return false;
        }
        return true;
    }

    
    

}
