package e.poojasharma.shopping;

import android.graphics.drawable.Drawable;

/**
 * Created by Pooja Sharmaa on 23-Nov-17.
 */

public class Product {

    public String title;
    public Drawable productImage;
    public String description;
    public double price;
    public boolean selected;

    public Product(String title, Drawable productImage, String description,
    int price) {
    this.title = title;
    this.productImage = productImage;
    this.description = description;
    this.price = price;
    }

}
