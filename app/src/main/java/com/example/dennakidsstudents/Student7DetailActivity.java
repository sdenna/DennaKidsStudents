package com.example.dennakidsstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Student7DetailActivity extends AppCompatActivity {

    public static final String EXTRA_STUDENTID = "studentid";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student7_detail);
        Intent intent = getIntent();
        int studentId = intent.getIntExtra(EXTRA_STUDENTID, 1);
        Kid myStudent = Kid.period7Students[studentId];


        ImageView photo = (ImageView) findViewById(R.id.photo);
        TextView name = (TextView) findViewById(R.id.name);
        TextView dob = (TextView) findViewById(R.id.dob);
        TextView likes = (TextView) findViewById(R.id.likes);

        photo.setImageResource(myStudent.getImageResourceID());
        name.setText(myStudent.getName());
        dob.setText(myStudent.getDob());
        likes.setText(myStudent.getFavActivity());
    }

    // https://stackoverflow.com/questions/12047770/android-how-to-animate-an-activity-transition-when-the-default-back-button-is

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}