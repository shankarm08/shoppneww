package e.poojasharma.shopping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Quantity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantity);
    }




    public class MainActivity extends AppCompatActivity {
        int minteger = 0;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_quantity);
        }

        public void increaseInteger(View view) {
            minteger = minteger + 1;
            display(minteger);

        }public void decreaseInteger(View view) {
            minteger = minteger - 1;
            display(minteger);
        }

        private void display(int number) {
            TextView displayInteger = (TextView) findViewById(
                    R.id.integer_number);
            displayInteger.setText("" + number);
        }
    }









}




