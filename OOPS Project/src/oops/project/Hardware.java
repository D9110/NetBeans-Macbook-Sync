package oops.project;

import java.util.List;

public interface Hardware {
    
    

}

class Tablets extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Tablets(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Tablets() {
     super();
    }


}

class Phones extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Phones(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Phones() {
     super(); 
    } 


}

class Laptops extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Laptops(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Laptops() {
      super();  
    }


}

class Acessories extends Product implements Hardware{
    private static final long serialVersionUID = 1L;

    public Acessories(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Acessories() {
     super();
    }
    

}
