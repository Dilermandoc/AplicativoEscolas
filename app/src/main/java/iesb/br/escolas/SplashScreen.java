package iesb.br.escola;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;



    public class SplashScreen extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    finish();
                    Intent intent = new Intent();
                    intent.setClass(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                }
            }, 6000);
        }
    }