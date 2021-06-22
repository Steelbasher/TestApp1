package com.example.peekz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);

        Thread thread = new Thread(){
        public void run(){
            try {
            sleep(2500);
            }

            catch (Exception e){
                e.printStackTrace();
            }
            finally {
                Intent intent = new Intent(Splash_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }


        }


        };thread.start();

    }
}