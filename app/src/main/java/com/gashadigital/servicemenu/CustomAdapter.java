package com.gashadigital.servicemenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<Materials> {

    public CustomAdapter(Context context, Materials[] materialsList) {
        super(context, R.layout.list_item, materialsList);
    }
    
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Materials materials = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView materialImage = convertView.findViewById(R.id.thumb_view);
        TextView materialTitle = convertView.findViewById(R.id.cat_list_title);
        TextView materialDescription = convertView.findViewById(R.id.cat_list_desc);
        
        materialImage.setImageResource(materials.getImg());
        materialTitle.setText(materials.getTitle());
        materialDescription.setText(materials.getDescription());
        return super.getView(position, convertView, parent);
    }
}
