package com.gashadigital.servicemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView titleDetail, descDetail;
    ImageView imgDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        titleDetail = findViewById(R.id.title_detail);
        imgDetail = findViewById(R.id.img_detail);
        descDetail = findViewById(R.id.text_detail);

        Intent intent = getIntent();
        String titleMore = intent.getStringExtra("detail");
        int detailID = intent.getIntExtra("catId", 0);

        if(titleMore.equals("Learning Materials")) {
            Materials materials = Materials.materials[detailID];
            titleDetail.setText(materials.getTitle());
            imgDetail.setImageResource(materials.getImg());
            descDetail.setText(materials.getDescription());
        }

    }
}