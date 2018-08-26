package co.edu.udea.compumovil.gr05_20182.lab1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.R.*;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //layout.activity_splash_screen
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intenet = new Intent(SplashScreen.this,MainActivity.class);
                startActivity(intenet);
            }
        },3000);
    }
}
