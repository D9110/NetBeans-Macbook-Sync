
package oops.project;

import java.util.List;


public interface Software {
    
    
    
}

class SAAS extends Product implements Software
{
    private static final long serialVersionUID = 1L;
    
    
    private int minServerCores;
    private int subscriptionYears;
    

    public SAAS(String category, String ID, String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    SAAS() {
        super(); ProductList.getInstance().addProduct(this);
    }

    public int getMinServerCores() {
        return minServerCores;
    }

    public int getSubscriptionYears() {
        return subscriptionYears;
    }

    public void setMinServerCores(int minServerCores) {
        this.minServerCores = minServerCores;
    }

    public void setSubscriptionYears(int subscriptionYears) {
        this.subscriptionYears = subscriptionYears;
    }
    
    
 
}

class OS extends Product implements Software
{
    private static final long serialVersionUID = 1L;
    
    private String codename;
    private String minRam;
    private String minProcessor;
    private String codeSize;
    private String version;
    private String releaseYear;
    private Boolean supported;

    public OS(String category, String ID, String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

   OS()
   {
   super(); ProductList.getInstance().addProduct(this);
   }

    public String getCodename() {
        return codename;
    }

    public String getMinRam() {
        return minRam;
    }

    public String getMinProcessor() {
        return minProcessor;
    }

    public String getCodeSize() {
        return codeSize;
    }

    public String getVersion() {
        return version;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public Boolean getSupported() {
        return supported;
    }

    public void setCodename(String codename) {
        this.codename = codename;
    }

    public void setMinRam(String minRam) {
        this.minRam = minRam;
    }

    public void setMinProcessor(String minProcessor) {
        this.minProcessor = minProcessor;
    }

    public void setCodeSize(String codeSize) {
        this.codeSize = codeSize;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setSupported(Boolean supported) {
        this.supported = supported;
    }


}

class OpenSource extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    private List<String> contributors;
    private String productLead;
    private String irc;
    
    public OpenSource(String category, String ID, String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    OpenSource() {
     super(); ProductList.getInstance().addProduct(this);
    }

    public List<String> getContributors() {
        return contributors;
    }

    public String getProductLead() {
        return productLead;
    }

    public String getIrc() {
        return irc;
    }

    public void setContributors(List<String> contributors) {
        this.contributors = contributors;
    }

    public void setProductLead(String productLead) {
        this.productLead = productLead;
    }

    public void setIrc(String irc) {
        this.irc = irc;
    } 
    

}

class PAAS extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    public PAAS(String category, String ID, String name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    PAAS() {
      super(); ProductList.getInstance().addProduct(this);
    }

   
}