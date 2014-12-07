package oops.project;

import java.util.List;

public interface Hardware {
    
    

}

class Tablets extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Tablets(String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

  

  
}

class Phones extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Phones(String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

  


}

class Laptops extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Laptops(String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

   

}

class Acessories extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Acessories(String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

   


}
