
package oops.project;

import java.util.List;


public interface Software {
    
}

class SAAS extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    public SAAS(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    SAAS() {
        super();
    }
 
}

class OS extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    public OS(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

   OS()
   {
   super();
   }


}

class OpenSource extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    public OpenSource(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    OpenSource() {
     super();
    }

}

class PAAS extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    public PAAS(String category, String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(category, ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    PAAS() {
      super();
    }

   
}