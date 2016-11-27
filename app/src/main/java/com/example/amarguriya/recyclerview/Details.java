package com.example.amarguriya.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class Details extends AppCompatActivity {

    ImageView image;
    TextView dName;
    TextView dEdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        image= (ImageView) findViewById(R.id.d_imageView);
        dName= (TextView) findViewById(R.id.d_name);
        dEdu= (TextView) findViewById(R.id.dEdu);

        image.setImageResource(getIntent().getIntExtra("Image",00));
        dName.setText("Name :"+getIntent().getStringExtra("Name"));
        dEdu.setText("Education: "+getIntent().getStringExtra("Education"));
    }
}
