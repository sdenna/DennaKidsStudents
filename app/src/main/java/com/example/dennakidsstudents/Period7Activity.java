package com.example.dennakidsstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Period7Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_period7);

        // Populate list of student with data from the period5Students array in Kid.java

        ArrayAdapter<Kid> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Kid.period7Students);

        ListView listPeriod7 = (ListView) findViewById(R.id.list_period7);
        listPeriod7.setAdapter(listAdapter);

        // Create listener to listen for when a student from period 5 is clicked on
        AdapterView.OnItemClickListener itemClickListener =

                new AdapterView.OnItemClickListener()  {
                    public void onItemClick(AdapterView<?> listPeriod5,
                                            View itemView, int position, long id) {
                        // Pass the student name the user clicks on to Student5DetailActivity
                        Intent intent = new Intent(Period7Activity.this, Student7DetailActivity.class);
                        intent.putExtra(Student7DetailActivity.EXTRA_STUDENTID, (int) id);
                        startActivity(intent);

                        // Transition from Suraj Rao's Mad Lib lab
                        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
                    }
                };

        listPeriod7.setOnItemClickListener(itemClickListener);

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
