package com.example.dennakidsstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class KidDetailActivity extends AppCompatActivity {

    public static final String EXTRA_KIDID = "kidId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kid_detail);

        Intent intent = getIntent();
        int kidId = intent.getIntExtra(EXTRA_KIDID, 0);

        Kid myKid = Kid.dennasKids[kidId];

        // photo, name, dob, likes

        ImageView photo = (ImageView) findViewById(R.id.photo);
        TextView name = (TextView) findViewById(R.id.name);
        TextView dob = (TextView) findViewById(R.id.dob);
        TextView likes = (TextView) findViewById(R.id.likes);

        photo.setImageResource(myKid.getImageResourceID());
        name.setText(myKid.getName());
        dob.setText(myKid.getDob());
        likes.setText(myKid.getFavActivity());
    }
}
