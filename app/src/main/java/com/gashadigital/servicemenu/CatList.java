package com.gashadigital.servicemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class CatList extends AppCompatActivity implements AdapterView.OnItemClickListener {

    TextView title;
    ImageView imgSrc;
    ListView catListView;
    String[] catListBooks, catListTrans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_list);

        Resources res = getResources();

        title = findViewById(R.id.title_view);
        imgSrc = findViewById(R.id.cat_view);
        catListView = findViewById(R.id.cat_list);
        catListBooks = res.getStringArray(R.array.books);
        catListTrans = res.getStringArray(R.array.transport);
        catListView.setOnItemClickListener(this);

        Intent intent = getIntent();
        String catTitle = intent.getStringExtra("category");

//        Set Resources
        title.setText(catTitle);
        if(catTitle.equals("Books")) {
            imgSrc.setImageResource(R.drawable.books_cat);
            setList(catListBooks);
        }
        else if(catTitle.equals("Transport")) {
            Toast.makeText(this,"OK", Toast.LENGTH_LONG).show();
            imgSrc.setImageResource(R.drawable.transport_cat);
            setList(catListTrans);
        }

    }

    private void setList(String[] StringCat) {
        ArrayAdapter<String> catAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, StringCat);
        catListView.setAdapter(catAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String detail = parent.getItemAtPosition(position).toString();
        Intent intent = new Intent(this, Detail.class);
        Bundle extra = new Bundle();
        extra.putString("detail", detail);
        intent.putExtras(extra);
        startActivity(intent);
        Toast.makeText(this, detail, Toast.LENGTH_LONG).show();
    }
}