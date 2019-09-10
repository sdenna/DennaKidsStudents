package com.example.dennakidsstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create an OnItemClickListener (notice the O is capitalized!!!)
        // since the ListView isn't a subclass of Button, that is why we have to implement a listener
        // and cannot use an onClick attribute like we did for Buttons, checkboxes or radio buttons

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> listView,
                                    View itemView, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this, DennaKidActivity.class);

                    startActivity(intent);
                }
            }
        };

        //Add the listener to the list View
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }
}
