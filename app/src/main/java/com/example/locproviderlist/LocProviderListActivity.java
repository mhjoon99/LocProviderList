package com.example.locproviderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity {
    TextView mTextView;
    LocationManager lm;
    List<String> locProvlist;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.txtOutput);
        mButton = findViewById(R.id.button);
        mButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lm = (LocationManager) getSystemService(LOCATION_SERVICE);

                locProvlist = lm.getAllProviders();

//                String s = "";
//                for(int i = 0; i < locProvlist.size(); i++) {
//                    s += "Loc. Provider: " + locProvlist.get(i) + "\n"
//                           + "Status: "  + lm.isProviderEnabled(locProvlist.get(i)) + "\n\n";
//                }

//                mTextView.setText(s);


                for (String string : locProvlist) {
                    mTextView.append("Loc. providers: " + string + "\n");
                    mTextView.append("Status: " + string.() + "\n\n");
                }

            }
        }));


    }
}