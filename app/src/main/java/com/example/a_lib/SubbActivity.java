package com.example.a_lib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubbActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle bundle) {

        //final Button gobackButton = (Button) findViewById(R.id.gobackbutton);
        super.onCreate(bundle);
        setContentView(R.layout.activity_sub);

        TextView nameText = (TextView) findViewById(R.id.nameText);
        Intent intent = getIntent();
        nameText.setText(((Intent) intent).getStringExtra("nameText").toString());


    }

}
