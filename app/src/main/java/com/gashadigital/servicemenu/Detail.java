package com.gashadigital.servicemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {
    TextView titleDetail, descDetail;
    ImageView imgDetail;
    String[] details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Resources res = getResources();
        titleDetail = findViewById(R.id.title_detail);
        imgDetail = findViewById(R.id.img_detail);
    }
}