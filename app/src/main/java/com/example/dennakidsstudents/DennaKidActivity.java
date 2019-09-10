package com.example.dennakidsstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DennaKidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denna_kid);

        // Populate the list of kids with data from the dennaKids array in the Kid.java class
        // This code goes in the onCreate so it is populated when the activity loads
        // The toString method will be called for each Kid and print out its name
        ArrayAdapter<Kid> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1,
                Kid.dennasKids);

        ListView listKids = (ListView) findViewById(R.id.list_kids);
        listKids.setAdapter(listAdapter);

        // Create the listener to listen for when a kid is clicked on
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listKids,
                                            View itemView, int position, long id) {
                        // Pass the kid name the user clickson to KidDetailActivity
                        Intent intent = new Intent(DennaKidActivity.this, KidDetailActivity.class);
                        intent.putExtra(KidDetailActivity.EXTRA_KIDID, (int) id);
                        startActivity(intent);
                    }
                };

        // Assign the listener to the list view
        listKids.setOnItemClickListener(itemClickListener);

    }
}
