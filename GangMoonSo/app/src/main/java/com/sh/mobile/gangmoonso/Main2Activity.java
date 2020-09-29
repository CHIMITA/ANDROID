package com.sh.mobile.gangmoonso;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity{

    @RequiresApi(api = Build.VERSION_CODES.Q)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getAttributes().layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main2);

        ImageButton Cbtn = findViewById(R.id.ibtn_culture);
        Cbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Cultureinformation cultureinformation =(Cultureinformation) getSupportFragmentManager().findFragmentById(R.id.cultureinfomation_frame);
                //replaceFragment(cultureinformation.CInstance());
                Intent cintent =new Intent(getApplication(),Menu_Cultureinformation.class);
                startActivity(cintent);
            }
        });

        ImageButton Abtn = findViewById(R.id.ibtn_art);
        Abtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Artinformation artinformation = (Artinformation) getSupportFragmentManager().findFragmentById(R.id.artiformation_frame);
//                replaceFragment(artinformation.AInstance());
                Intent aintent =new Intent(getApplication(),Menu_Artinformation.class);
                startActivity(aintent);
            }
        });

        ImageButton Fbtn = findViewById(R.id.ibtn_festival);
        Fbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Festivalinformation festivalinformation = (Festivalinformation)getSupportFragmentManager().findFragmentById(R.id.festivalinformation_frame);
//                replaceFragment(festivalinformation.FInstance());
                Intent fintent =new Intent(getApplication(),Menu_Festivalinformation.class);
                startActivity(fintent);
            }
        });

        ImageButton Bbtn = findViewById(R.id.ibtn_books);
        Bbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Booksinformation booksinformation = (Booksinformation)getSupportFragmentManager().findFragmentById(R.id.bookinformation_frame);
//                replaceFragment(booksinformation.BInstance());
                Intent bintent =new Intent(getApplication(), Menu_Booksinformation.class);
                startActivity(bintent);
            }
        });


    }

    public void onConfigurationChanged(Configuration newConfig) {

        super.onConfigurationChanged(newConfig);

    }

}



