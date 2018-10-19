package e.poojasharma.shopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Productdetails extends AppCompatActivity {

    int minteger = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdetails);

        Button b1 = (Button) findViewById(R.id.increase);
        Button b2 = (Button) findViewById(R.id.decrease);


        List<Product> catalog = ShoppingCartHelper.getCatalog(getResources());
        final List<Product> cart = ShoppingCartHelper.getCart();

        int productIndex = getIntent().getExtras().getInt(ShoppingCartHelper.PRODUCT_INDEX);
        final Product selectedProduct = catalog.get(productIndex);

        // Set the proper image and text
        ImageView productImageView = (ImageView) findViewById(R.id.ImageViewProduct);
        productImageView.setImageDrawable(selectedProduct.productImage);
        TextView productTitleTextView = (TextView) findViewById(R.id.TextViewProductTitle);
        productTitleTextView.setText(selectedProduct.title);
        TextView productDetailsTextView = (TextView) findViewById(R.id.TextViewProductdetails);
        productDetailsTextView.setText(selectedProduct.description);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                minteger = minteger + 1;
                display(minteger);

            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                minteger = minteger - 1;

                display(minteger);


            }


        });


        Button addToCartButton = (Button) findViewById(R.id.ButtonAddToCart);
        addToCartButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                cart.add(selectedProduct);
                Toast.makeText(Productdetails.this, "Item added to cart", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        // Disable the add to cart button if the item is already in the cart
        if (cart.contains(selectedProduct)) {
            addToCartButton.setEnabled(false);
            addToCartButton.setText("Item in Cart");
        }


    }


    public void display(int number) {
        TextView displayInteger = (TextView) findViewById(R.id.integer_number);
        displayInteger.setText("" + number);
    }

}




     //   TextView price = (TextView) findViewById(R.id.price);
  //   price.setText((int) selectedProduct.price);





