package e.poojasharma.shopping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class ShoppingCart extends AppCompatActivity {
    private List<Product> mCartList;
    private ProductAdapter mProductAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart);
        mCartList = ShoppingCartHelper.getCart();
        if(mCartList.isEmpty())
        {
            Toast.makeText(this,"Cart is Empty",Toast.LENGTH_LONG).show();
        }

        // Make sure to clear the selections
        for(int i=0; i<mCartList.size(); i++) {
            mCartList.get(i).selected = false;
        }

        // Create the list
        final ListView listViewCatalog = (ListView) findViewById(R.id.ListViewCatalog);
        mProductAdapter = new ProductAdapter(mCartList, getLayoutInflater(), true);
        listViewCatalog.setAdapter(mProductAdapter);

        listViewCatalog.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {

                Product selectedProduct = mCartList.get(position);
                if(selectedProduct.selected == true)
                    selectedProduct.selected = false;
                else
                    selectedProduct.selected = true;

                mProductAdapter.notifyDataSetInvalidated();

            }
        });
      Button checkout =(Button)findViewById(R.id.Button02);
      checkout.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              for(int i=mCartList.size()-1; i>=0; i--) {

                  if(mCartList.get(i).selected) {
                      Intent intent=new Intent(getApplicationContext(),Checkout.class);
                      startActivity(intent);
                  }
              }


          }
      });
        Button removeButton = (Button) findViewById(R.id.ButtonRemoveFromCart);
        removeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Loop through and remove all the products that are selected
                // Loop backwards so that the remove works correctly
                for(int i=mCartList.size()-1; i>=0; i--) {

                    if(mCartList.get(i).selected) {
                        mCartList.remove(i);
                        Toast.makeText(ShoppingCart.this, "Removed from cart", Toast.LENGTH_SHORT).show();
                    }
                }
                mProductAdapter.notifyDataSetChanged();
            }
        });

    }

}

