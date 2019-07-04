
package devsnik.com.findyourflat;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;

import devsnik.com.findyourflat.customui.CustomTextView;
import devsnik.com.findyourflat.model.ApartmentModel;

public class DetailsActivity extends BaseActivity {

    ApartmentModel model;
    CustomTextView txt_price, txt_name;
    ImageView img_apartment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        model = (ApartmentModel) getIntent().getSerializableExtra("model");


        txt_price = findViewById(R.id.txt_price);
        txt_name = findViewById(R.id.txt_name);
        img_apartment = findViewById(R.id.img_apartment);


        txt_price.setText(model.getPrice()+"/");
        txt_name.setText(model.getApartmentName());
        img_apartment.setImageDrawable(ContextCompat.getDrawable(this, model.getImg()));


        findViewById(R.id.img_back).setOnClickListener(v -> {
            finish();
        });
    }
}
