package oops.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ProductInput<T extends Product> {


    void getInput(T product) {

        BufferedReader dd = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.println("Product Details");

            product.setName(dd.readLine());
            product.setID(dd.readLine());
            product.setCategory(dd.readLine());
            product.setModel(Integer.parseInt(dd.readLine()));

            StringTokenizer st = new StringTokenizer(dd.readLine());

            while (st.hasMoreTokens()) {
                product.addFeatures(st.nextToken());
            }

            product.setInPrice(Integer.parseInt(dd.readLine()));
            product.setPrice(Integer.parseInt(dd.readLine()));
            product.setOutPrice(Integer.parseInt(dd.readLine()));

            product.setVolumesSold(Integer.parseInt(dd.readLine()));
            product.setVolumesAvailable(Integer.parseInt(dd.readLine()));
            product.setTotalVolumes(Integer.parseInt(dd.readLine()));

            if (product.getClass() == Tablets.class) {
                Tablets tablet = (Tablets) product;

             //   System.out.println("Hello");
                tablet.setCellular(Boolean.TRUE);
                tablet.setOS(null);
                tablet.setProcessor(null);
                tablet.setScreenSize(null);
                tablet.setStorage(null);

            }
        } catch (IOException ex) {
            Logger.getLogger(ProductInput.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (product.getClass() == Laptops.class) {

            Laptops laptop = (Laptops) product;
            // System.out.println("fuck");

            laptop.setFlash(Boolean.TRUE);
            laptop.setGraphicsCard(null);
            laptop.setOS(null);
            laptop.setProcessor(null);
            laptop.setRam(null);
            laptop.setRetina(Boolean.TRUE);
            laptop.setStorage(null);

        }

        if (product.getClass() == Phones.class) {
            Phones phone = (Phones) product;

            phone.setOS(null);
            phone.setProcessor(null);
            phone.setScreenSize(null);
            phone.setStorage(null);

        }

        if (product.getClass() == Acessories.class) {
            Acessories acessory = (Acessories) product;

        }

        if (product.getClass() == OS.class) {

            OS os = (OS) product;

            os.setCodeSize(null);
            os.setCodename(null);
            os.setMinProcessor(null);
            os.setMinRam(null);
            os.setReleaseYear(null);
            os.setSupported(Boolean.TRUE);
            os.setVersion(null);

        }

        if (product.getClass() == PAAS.class) {

            PAAS paas = (PAAS) product;

        }

        if (product.getClass() == OpenSource.class) {

            OpenSource openSource = (OpenSource) product;

            openSource.setContributors(null);
            openSource.setIrc(null);
            openSource.setProductLead(null);

        }

        if (product.getClass() == SAAS.class) {
            SAAS saas = (SAAS) product;

     //    saas.setMinServerCores(minServerCores);
            //  saas.setSubscriptionYears(subscriptionYears);
        }

    }

}
