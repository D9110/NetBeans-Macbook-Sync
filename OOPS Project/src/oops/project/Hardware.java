package oops.project;

import java.util.List;
import java.util.Objects;

public interface Hardware {                                                             //MAKE INTERFACE FOR ALL

    void printPartDetails();

    void compareWithOtherHardwareProducts(Product... product);

}

class Tablets extends Product implements Hardware {

    private static final long serialVersionUID = 1L;

    private String screenSize;
    private String processor;
    private String OS;
    private String storage;
    private Boolean cellular;

    public Tablets(String category, String ID, String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Tablets() {
        super();
        ProductList.getInstance().addProduct(this);
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
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.screenSize);
        hash = 97 * hash + Objects.hashCode(this.processor);
        hash = 97 * hash + Objects.hashCode(this.OS);
        hash = 97 * hash + Objects.hashCode(this.storage);
        hash = 97 * hash + Objects.hashCode(this.cellular);
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
        final Tablets other = (Tablets) obj;
        if (!Objects.equals(this.screenSize, other.screenSize)) {
            return false;
        }
        if (!Objects.equals(this.processor, other.processor)) {
            return false;
        }
        if (!Objects.equals(this.OS, other.OS)) {
            return false;
        }
        if (!Objects.equals(this.storage, other.storage)) {
            return false;
        }
        if (!Objects.equals(this.cellular, other.cellular)) {
            return false;
        }
        return true;
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

class Phones extends Product implements Hardware {

    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    private String screenSize;
    private String processor;
    private String OS;
    private String storage;

    public Phones(String category, String ID, String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Phones() {
        super();
        ProductList.getInstance().addProduct(this);
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
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.screenSize);
        hash = 71 * hash + Objects.hashCode(this.processor);
        hash = 71 * hash + Objects.hashCode(this.OS);
        hash = 71 * hash + Objects.hashCode(this.storage);
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
        final Phones other = (Phones) obj;
        if (!Objects.equals(this.screenSize, other.screenSize)) {
            return false;
        }
        if (!Objects.equals(this.processor, other.processor)) {
            return false;
        }
        if (!Objects.equals(this.OS, other.OS)) {
            return false;
        }
        if (!Objects.equals(this.storage, other.storage)) {
            return false;
        }
        return true;
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

class Laptops extends Product implements Hardware {

    private static final long serialVersionUID = 1L;

    private String processor;
    private String OS;
    private String graphicsCard;
    private String ram;
    private String storage;
    private Boolean flash;
    private Boolean retina;

    public Laptops(String category, String ID, String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Laptops() {
        super();
        ProductList.getInstance().addProduct(this);
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
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.processor);
        hash = 89 * hash + Objects.hashCode(this.OS);
        hash = 89 * hash + Objects.hashCode(this.graphicsCard);
        hash = 89 * hash + Objects.hashCode(this.ram);
        hash = 89 * hash + Objects.hashCode(this.storage);
        hash = 89 * hash + Objects.hashCode(this.flash);
        hash = 89 * hash + Objects.hashCode(this.retina);
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
        final Laptops other = (Laptops) obj;
        if (!Objects.equals(this.processor, other.processor)) {
            return false;
        }
        if (!Objects.equals(this.OS, other.OS)) {
            return false;
        }
        if (!Objects.equals(this.graphicsCard, other.graphicsCard)) {
            return false;
        }
        if (!Objects.equals(this.ram, other.ram)) {
            return false;
        }
        if (!Objects.equals(this.storage, other.storage)) {
            return false;
        }
        if (!Objects.equals(this.flash, other.flash)) {
            return false;
        }
        if (!Objects.equals(this.retina, other.retina)) {
            return false;
        }
        return true;
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

class Acessories extends Product implements Hardware {

    private static final long serialVersionUID = 1L;

    public Acessories(String category, String ID, String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    Acessories() {
        super();
        ProductList.getInstance().addProduct(this);
    }

    @Override
    public void compareWithOtherHardwareProducts(Product... product) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void printPartDetails() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
