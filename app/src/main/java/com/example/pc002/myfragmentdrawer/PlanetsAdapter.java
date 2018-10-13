package com.example.pc002.myfragmentdrawer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PlanetsAdapter extends BaseAdapter {

    private String[] planets = null;
    private Context context = null;
    private int layoutResource = -1;
    private int[] drawableIds;

    public PlanetsAdapter(@NonNull Context context, int resource, @NonNull String[] planets, @NonNull int[] drawableIds) {
        this.context = context;
        this.layoutResource = resource;
        this.planets = planets;
        this.drawableIds = drawableIds;
    }

    public int getCount() {
        // TODO Auto-generated method stub
        return planets.length;
    }

    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row;
        row = inflater.inflate(R.layout.planets_item_layout, parent, false);
        TextView title;
        ImageView i1;
        i1 = (ImageView) row.findViewById(R.id.planet_icon);
        title = (TextView) row.findViewById(R.id.planet_name);
        title.setText(planets[position]);
        i1.setImageResource(drawableIds[position]);

        return (row);
    }
}
