package com.example.pc002.myfragmentdrawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class enrollment extends Fragment {

    private CheckBox cb1 = null;
    private CheckBox cb2 = null;
    private CheckBox cb3 = null;
    private CheckBox cb4 = null;
    //..............................
    private boolean cb1Value = false;
    private boolean cb2Value = false;
    private boolean cb3Value = false;
    private boolean cb4Value = false;

    private String[] degrees = {"ABM", "BSIT", "BSCS", "BSCPE", "MSIT", "MSCS"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.enrollment_form, container, false);

        Button btnSubmit = layout.findViewById(R.id.submit);

        //...................................................
        cb1 = layout.findViewById(R.id.box1);
        cb2 = layout.findViewById(R.id.box2);
        cb3 = layout.findViewById(R.id.box3);
        cb4 = layout.findViewById(R.id.box4);
        //....................................................
        cb1Value = cb1.isChecked();
        cb2Value = cb2.isChecked();
        cb3Value = cb3.isChecked();
        cb4Value = cb4.isChecked();


        RadioGroup genderRadio = layout.findViewById(R.id.radioGroup);


        ArrayList<String> degreeDataSet = new ArrayList<>(Arrays.asList(degrees));

        Spinner degreeSpinner = layout.findViewById(R.id.degree_spinner);
        degreeAdapterActivity adapter = new degreeAdapterActivity(getActivity(), R.layout.degree_spinner_item_layout, degreeDataSet);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        degreeSpinner.setAdapter(adapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnSubmitButtonClicked();
            }
        });

        return layout;
    }

    private void btnSubmitButtonClicked() {
        Toast.makeText(getActivity(), "Request Submitted.", Toast.LENGTH_SHORT).show();
    }
}