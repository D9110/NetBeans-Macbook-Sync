
package oops.project;

import java.util.List;


public interface Software {
    
}

class SAAS extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    public SAAS(String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

    
}

class OS extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    public OS(String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }



}

class OpenSource extends Product implements Software
{
    private static final long serialVersionUID = 1L;

    public OpenSource(String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }

   
   

}

class PAAS extends Product implements Software
{

    public PAAS(String ID, int name, int price, int model, List<String> features, int volumesAvailable, int totalVolumes, int volumesSold, int inPrice, int outPrice) {
        super(ID, name, price, model, features, volumesAvailable, totalVolumes, volumesSold, inPrice, outPrice);
    }



}