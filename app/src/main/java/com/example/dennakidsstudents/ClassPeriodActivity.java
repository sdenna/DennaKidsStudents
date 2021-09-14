package com.example.dennakidsstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ClassPeriodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_period);

        // Populate list of student with data from the period5Students array in Kid.java

        Intent intent = getIntent();
        String perNum = intent.getStringExtra(MainActivity.EXTRA_PERIOD);

        ArrayAdapter<Kid> listAdapter = null;

        if (perNum.equals("5")) {
            listAdapter = new ArrayAdapter<>(
                    this, android.R.layout.simple_list_item_1, Kid.period5Students);
            ListView listView = (ListView) findViewById(R.id.classList);
            listView.setAdapter(listAdapter);

            // Create listener to listen for when a student from the period is clicked on
            AdapterView.OnItemClickListener itemClickListener =

                    new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> listPeriod5,
                                                View itemView, int position, long id) {
                            // Pass the student name the user clicks on to Student5DetailActivity

                            // NEED TO ADD IN THE CODE TO USE THE ClassPeriodDetialActivity
                            // BASICALLY NEED TO PASS IN A PARAM SO IT KNOWS WHICH PERIOD/ARRAY, WHICH ELEMENT IN THAT
                            
                            // SEE IF CAN SET IT UP TO ONLY HAVE A MAIN, A CATEGORY, AND A DETAIL PAGE

                            Intent intent = new Intent(ClassPeriodActivity.this, Student5DetailActivity.class);
                            intent.putExtra(Student5DetailActivity.EXTRA_STUDENTID, (int) id);
                            startActivity(intent);

                            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        }
                    };

            listView.setOnItemClickListener(itemClickListener);
        } else if (perNum.equals("7")) {
            listAdapter = new ArrayAdapter<>(
                    this, android.R.layout.simple_list_item_1, Kid.period7Students);

            ListView listView = (ListView) findViewById(R.id.classList);
            listView.setAdapter(listAdapter);

            // Create listener to listen for when a student from the period is clicked on
            AdapterView.OnItemClickListener itemClickListener =

                    new AdapterView.OnItemClickListener() {
                        public void onItemClick(AdapterView<?> listPeriod7,
                                                View itemView, int position, long id) {
                            // Pass the student name the user clicks on to Student5DetailActivity
                            Intent intent = new Intent(ClassPeriodActivity.this, Student7DetailActivity.class);
                            intent.putExtra(Student7DetailActivity.EXTRA_STUDENTID, (int) id);
                            startActivity(intent);

                            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                        }
                    };

            listView.setOnItemClickListener(itemClickListener);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}