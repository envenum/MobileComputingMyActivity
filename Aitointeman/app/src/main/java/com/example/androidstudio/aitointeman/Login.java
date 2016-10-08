package com.example.androidstudio.aitointeman;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.MotionEvent;
import android.content.Intent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import android.view.View.OnClickListener;
import android.util.Log;
public class Login extends AppCompatActivity {
    EditText t1,t2;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(EditText)findViewById(R.id.editText);
        t2=(EditText)findViewById(R.id.editText2);

        bt1=(Button)findViewById(R.id.button);
bt1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(intent);
            final String email = t1.getText().toString();
            final String password = t2.getText().toString();
            if (!validate(email)) {

                t1.setError("Invalid Email");


            }
            if (!validatepass(password)) {
                t2.setError("Invalid Password");
            }

            if (validate(email) && validatepass(password)) {

                Intent intent2 = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);

            }


        }

                                        });



    private boolean validate(String email)
           {
               String em_pat="admin";
               Pattern pattern =Pattern.compile(em_pat ) ;
                Matcher matcher =pattern.matcher(email) ;
                return matcher.matches();
        }






           private boolean validatepass(String password) {
               if (password =="test")
                {

                   return true;
              }
               return false;
           }



        }
