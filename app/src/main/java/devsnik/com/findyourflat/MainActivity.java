package devsnik.com.findyourflat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    RecyclerView rl_aprtment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rl_aprtment = findViewById(R.id.rl_aprtment);

        rl_aprtment.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL,false));

        rl_aprtment.setAdapter(new ApartmentAdapter(this,Constants.getList()));

    }
}
