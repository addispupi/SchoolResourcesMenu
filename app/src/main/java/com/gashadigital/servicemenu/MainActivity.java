package com.gashadigital.servicemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView servList;
    String[] category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();

        servList = findViewById(R.id.serv_list);
        category = res.getStringArray(R.array.equipments);

        servList.setOnItemClickListener(this);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String cat = parent.getItemAtPosition(position).toString();
            Intent intent = new Intent(this, CatList.class);
            Bundle extra = new Bundle();
            extra.putString("category", cat);
            intent.putExtras(extra);
            startActivity(intent);
    }
}