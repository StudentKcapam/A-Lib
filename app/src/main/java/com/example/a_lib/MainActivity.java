package com.example.a_lib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nameText  = (EditText) findViewById(R.id.nameText);
        final EditText passwordText = (EditText) findViewById(R.id.passwordText);
        Button nameButton = (Button) findViewById(R.id.nameButton);

        nameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String name = nameText.getText().toString();
                String password = passwordText.getText().toString();
                if(ValidationID(name, password)){
                    Intent intent = new Intent(getApplicationContext(), SubbActivity.class);
                    Intent intentforweb = new Intent(getApplicationContext(), WebLayout.class);
                    Intent intentforweb2 = new Intent(getApplicationContext(), Web2.class);
                    intent.putExtra("nameText", "hello " + name);
                    //startActivity(intent);
                    startActivity(intentforweb2);
                }
            }
        });
    }
    protected boolean ValidationID(String ID, String PW){//원래는 서버와의 통신으로 이루어져야 하는 내용이나 서버가 없는 관계로 하드코딩
        if(ID.equals("admin") && PW.equals("admin")){//관리자 계정(방식의 전환은 이루어질 수 있음, 관리자인지 아닌지 확인하는 method를 만드는 방식 등)
            return true;
        }
        else if(ID.equals("testaccount") && PW.equals("testpassword")){//일반유저 계정
            return true;
        }
        else{
            return false;
        }
    }
}
