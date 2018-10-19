package e.poojasharma.shopping;

import android.content.res.Resources;

import java.util.List;
import java.util.Vector;

/**
 * Created by Pooja Sharmaa on 23-Nov-17.
 */

public class ShoppingCartHelper {
    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

        private static List<Product> catalog;
       private static List<Product> cart;

    public static List<Product> getCatalog(Resources res){
    if(catalog == null) {
    catalog = new Vector<Product>();
    catalog.add(new Product("nandini milk blue pack", res.getDrawable(R.drawable.milk),
                    "Description:Goodlife", 44));
catalog.add(new Product("nandini milk ", res.getDrawable(R.drawable.milk3),"Description:", 21));

       // catalog.add(new Product("peda (Pstv9_Blue-White)", res.getDrawable(R.drawable.peda),"Description:    Graceful and gorgeous, This saree for Indian Women from the house of Pramukh Saris is designed as per the latest trends to keep you in sync with high fashion and with your wedding occasion. Made from Georgette fabric, it will keep you comfortable all day long. Stitch its Blouse as per your size and be the centre of attention. This Ethnic wear Saree comprises a Saree length of 5.5m. Note:Image is for reference purpose only and accessories are not provided with bundle of saree. Online saree shopping/Buy Saree is the best way to decorate your wardrobe. Latest saree Design Available every time in this brand. Sari/Saree define your nature and personality. Saree with Lace is popular. We have many designs of Designer Saree, Latest Saree, Printed Saree, Georgette Saree, Chiffon Saree, Cotton Silk Saree, Bhagalpuri Saree, Art Silk saree, Cotton Saree, Silk Saree, Half & Half Saree.", 1200));
        //catalog.add(new Product("Pramukh Saris Printed Fashion Georgette Saree  (Pink, White)", res.getDrawable(R.drawable.milk3),"Description:    Graceful and gorgeous, This saree for Indian Women from the house of Pramukh Saris is designed as per the latest trends to keep you in sync with high fashion and with your wedding occasion. Made from Georgette fabric, it will keep you comfortable all day long. Stitch its Blouse as per your size and be the centre of attention. This Ethnic wear Saree comprises a Saree length of 5.5m. Note:Image is for reference purpose only and accessories are not provided with bundle of saree. Online saree shopping/Buy Saree is the best way to decorate your wardrobe. Latest saree Design Available every time in this brand. Sari/Saree define your nature and personality. Saree with Lace is popular. We have many designs of Designer Saree, Latest Saree, Printed Saree, Georgette Saree, Chiffon Saree, Cotton Silk Saree, Bhagalpuri Saree, Art Silk saree, Cotton Saree, Silk Saree, Half & Half Saree.", 900));
      //  catalog.add(new Product("Pramukh Saris Self Design Chanderi Poly Silk Saree  (Multicolor)", res.getDrawable(R.drawable.downloaddddd),"Description:    Graceful and gorgeous, This saree for Indian Women from the house of Pramukh Saris is designed as per the latest trends to keep you in sync with high fashion and with your wedding occasion. Made from Georgette fabric, it will keep you comfortable all day long. Stitch its Blouse as per your size and be the centre of attention. This Ethnic wear Saree comprises a Saree length of 5.5m. Note:Image is for reference purpose only and accessories are not provided with bundle of saree. Online saree shopping/Buy Saree is the best way to decorate your wardrobe. Latest saree Design Available every time in this brand. Sari/Saree define your nature and personality. Saree with Lace is popular. We have many designs of Designer Saree, Latest Saree, Printed Saree, Georgette Saree, Chiffon Saree, Cotton Silk Saree, Bhagalpuri Saree, Art Silk saree, Cotton Saree, Silk Saree, Half & Half Saree.", 1000));
//        catalog.add(new Product("Pramukh Saris Embroidered Fashion Silk Saree  (Light Blue)", res.getDrawable(R.drawable.sari6),"Pramukh Saris Graceful and gorgeous, This saree for Indian Women from the house of Pramukh Saris is designed as per the latest trends to keep you in sync with high fashion and with your wedding occasion. Made from Georgette fabric, it will keep you comfortable all day long. Stitch its Blouse as per your size and be the centre of attention. This Ethnic wear Saree comprises a Saree length of 5.5m. Note:Image is for reference purpose only and accessories are not provided with bundle of saree. Online saree shopping/Buy Saree is the best way to decorate your wardrobe. Latest saree Design Available every time in this brand. Sari/Saree define your nature and personality. Saree with Lace is popular. We have many designs of Designer Saree, Latest Saree, Printed Saree, Georgette Saree, Chiffon Saree, Cotton Silk Saree, Bhagalpuri Saree, Art Silk saree, Cotton Saree, Silk Saree, Half & Half Saree.", 700));
        catalog.add(new Product("peda", res.getDrawable(R.drawable.peda)," Description", 900));
        catalog.add(new Product("Ghee", res.getDrawable(R.drawable.ghee)," Description:", 900));
        //catalog.add(new Product("Watchmen", res.getDrawable(R.drawable.sari4),"", 900));





    }

return catalog;
}

        public static List<Product> getCart() {
   if(cart == null) {
 cart = new Vector<Product>();
 }

  return cart;
   }
}
