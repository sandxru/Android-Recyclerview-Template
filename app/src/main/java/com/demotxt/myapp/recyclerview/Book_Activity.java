package com.demotxt.myapp.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sandaru Muthuwadige on 11/05/2019.
 */

public class Book_Activity extends AppCompatActivity {

    private TextView tvtitle,tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);

        tvdescription = (TextView) findViewById(R.id.txtDesc);
        img = (ImageView) findViewById(R.id.bookthumbnail);

        // Recieve data
        Intent intent = getIntent();
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail") ;

        // Setting values
        tvdescription.setText(Description);
        img.setImageResource(image);


    }
}