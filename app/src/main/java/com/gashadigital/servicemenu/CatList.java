package com.gashadigital.servicemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CatList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView title;
    ImageView imgSrc;
    ListView catListView;
    String catTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_list);

        Resources res = getResources();

        title = findViewById(R.id.title_view);
        imgSrc = findViewById(R.id.cat_view);
        catListView = findViewById(R.id.cat_list);
        catListView.setOnItemClickListener(this);

        Intent intent = getIntent();
        catTitle = intent.getStringExtra("category");

        // Set Resources
        title.setText(catTitle);
        if(catTitle.equals("Learning Materials")) {
            imgSrc.setImageResource(R.drawable.stationary);
            ArrayAdapter<Materials> catAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Materials.materials);
            catListView.setAdapter(catAdapter);
        }
        else if(catTitle.equals("Transport")) {
            Toast.makeText(this,"OK", Toast.LENGTH_LONG).show();
            imgSrc.setImageResource(R.drawable.transport_cat);
            ArrayAdapter<Materials> catAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Materials.materials);
            catListView.setAdapter(catAdapter);
        }

    }

//    private void setList(Class<?> cat) {
//        ArrayAdapter<Materials> catAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Materials.materials);
//        catListView.setAdapter(catAdapter);
//    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String detail = parent.getItemAtPosition(position).toString();
        Intent intent = new Intent(this, Detail.class);
        Bundle extra = new Bundle();
        extra.putString("detail", catTitle);
        extra.putInt("catId", (int)id);

        intent.putExtras(extra);
        startActivity(intent);
//        Toast.makeText(this, detail, Toast.LENGTH_LONG).show();
    }
}