package com.example.pc002.myfragmentdrawer;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class planetsLists extends Fragment implements AdapterView.OnItemClickListener {

    private ListView planetsListView = null;
    private int[] drawableIds = {
            R.drawable.img_id_row1, R.drawable.img_id_row2,
            R.drawable.img_id_row3, R.drawable.img_id_row4,
            R.drawable.img_id_row5, R.drawable.img_id_row6,
            R.drawable.img_id_row7, R.drawable.img_id_row8,
            R.drawable.img_id_row9 };
    private String[] planets = {
            "Mercury",
            "Venus",
            "Earth",
            "Mars",
            "Jupiter",
            "Saturn",
            "Neptune",
            "Uranus",
            "Pluto",};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.planets_listview_demo, container, false);

        planetsListView = layout.findViewById(R.id.planets_listview);

        PlanetsAdapter adapter = new PlanetsAdapter(getActivity(), R.layout.planets_item_layout, planets, drawableIds);
        planetsListView.setAdapter(adapter);
        planetsListView.setOnItemClickListener(this);
        return layout;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView planetsTextView = view.findViewById(R.id.planet_name);
        if (planetsTextView.getText().toString().equals("Pluto")){
            Toast.makeText(getActivity(), planetsTextView.getText().toString() + " is not part of solar system anymore" , Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getActivity(), planetsTextView.getText().toString() + " is part of solar system." , Toast.LENGTH_LONG).show();
        }
    }

}