package com.example.tvz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;



public class MainActivity2 extends AppCompatActivity{
    private ImageView ing;
    private Button btn;
    private EditText email,pass;


    private static final String email_txt = "artemshipov2002@yandex.ru";
    private static final String pass_txt = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        login();


    }
    public void login () {
        ing = (ImageView) findViewById(R.id.imageView4);
        btn = (Button) findViewById(R.id.button2);
        email = (EditText) findViewById(R.id.editTextTextEmailAddress2);
        pass = (EditText) findViewById(R.id.editTextTextPassword4);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (email_txt.equals(String.valueOf(email.getText())) && pass_txt.equals(String.valueOf(pass.getText()))) {
                            ing.setImageResource(R.drawable.photo1);
                            Intent intent2 = new Intent(MainActivity2.this, MainActivity4.class);
                            startActivity(intent2);

                        } else
                            ing.setImageResource(R.drawable.photo);

                    }

                }
        );
    }
}
