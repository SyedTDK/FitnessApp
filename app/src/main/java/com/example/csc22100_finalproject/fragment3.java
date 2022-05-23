package com.example.csc22100_finalproject;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatSpinner;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment3 extends Fragment {

    private void removeView(View view, LinearLayout layoutList) {
        layoutList.removeView(view);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment3, container, false);
        LinearLayout layoutList = (LinearLayout) view.findViewById(R.id.layout_list3);
        Button buttonAdd = (Button) view.findViewById(R.id.button_add);
        List<String> workoutList = new ArrayList<>();
        workoutList.add("Workout");
        workoutList.add("Preacher Curls");
        workoutList.add("Hammer Curls");
        workoutList.add("Triceps Extension with Dumbbell");
        workoutList.add("Rope Push-Downs");

        buttonAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final View repsView = getLayoutInflater().inflate(R.layout.row_add_rep, null, false);
                EditText editText = (EditText) repsView.findViewById(R.id.edit_rep);
                AppCompatSpinner spinnerWorkout = (AppCompatSpinner) repsView.findViewById(R.id.spinner_workout);
                ImageView imageClose = (ImageView) repsView.findViewById(R.id.image_remove);
                ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_spinner_item, workoutList);

                spinnerWorkout.setAdapter(arrayAdapter);

                imageClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        removeView(repsView, layoutList);
                    }
                });

                layoutList.addView(repsView);
            }

        });


        return view;

    }
}
