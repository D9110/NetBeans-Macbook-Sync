package oops.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public final class ProductOutput<T extends Product> {


    void getOutput(T product) {

        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Product Details");
        System.out.println(product.getName());
        System.out.println(product.getID());
        System.out.println(product.getCategory());
        System.out.println(product.getModel());
        
      List<String> productFeatures= product.getFeatures();
        
      
      for(String s:productFeatures)
      {
        System.out.println(s);
      }
      
      
        System.out.println(product.getInPrice());
        System.out.println(product.getPrice());
        System.out.println(product.getOutPrice());
        System.out.println(product.getVolumesSold());
        System.out.println(product.getVolumesAvailable());
        System.out.println(product.getTotalVolumes());
        if (product.getClass() == Tablets.class) {
            Tablets tablet = (Tablets) product;
            
            //   System.out.println("Hello");
            System.out.println(tablet.getCellular());
            System.out.println(tablet.getOS());
            System.out.println(tablet.getProcessor());
            System.out.println(tablet.getScreenSize());
            System.out.println(tablet.getStorage());
            
        }
        
        if (product.getClass() == Laptops.class) {

            Laptops laptop = (Laptops) product;
            // System.out.println("fuck");

            System.out.println(laptop.getFlash());
            System.out.println(laptop.getGraphicsCard());
            System.out.println(laptop.getOS());
            System.out.println(laptop.getProcessor());
            System.out.println(laptop.getRam());
            System.out.println(laptop.getRetina());
            System.out.println(laptop.getStorage());

        }

        if (product.getClass() == Phones.class) {
            Phones phone = (Phones) product;

            System.out.println(phone.getOS());
            System.out.println(phone.getProcessor());
            System.out.println(phone.getScreenSize());
            System.out.println(phone.getStorage());

        }

        if (product.getClass() == Acessories.class) {
            Acessories acessory = (Acessories) product;

        }

        if (product.getClass() == OS.class) {

            OS os = (OS) product;

            System.out.println(os.getCodeSize());
            System.out.println(os.getCodename());
            System.out.println(os.getMinProcessor());
            System.out.println(os.getMinRam());
            System.out.println(os.getReleaseYear());
            System.out.println(os.getSupported());
            System.out.println(os.getVersion());

        }

        if (product.getClass() == PAAS.class) {

            PAAS paas = (PAAS) product;

        }

        if (product.getClass() == OpenSource.class) {

            OpenSource openSource = (OpenSource) product;

            System.out.println(openSource.getContributors());
            System.out.println(openSource.getIrc());
            System.out.println(openSource.getProductLead());

        }

        if (product.getClass() == SAAS.class) {
            SAAS saas = (SAAS) product;

         System.out.println(saas.getMinServerCores());
         System.out.println(saas.getSubscriptionYears());
        }

    }

}