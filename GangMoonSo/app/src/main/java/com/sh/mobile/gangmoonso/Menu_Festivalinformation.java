package com.sh.mobile.gangmoonso;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class Menu_Festivalinformation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button gangdongBtn, starOfstarBtn, multiculturalBtn;
    ImageButton gangdong_ImageBtn, starOfstar_ImageBtn, multicultural_ImageBtn;
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getAttributes().layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.festivalinformation_menu);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawer_layout);
        navigationView=(NavigationView)findViewById(R.id.nav_view);
        toolbar=(Toolbar)findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle;
        toggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.nav_home);

        gangdongBtn = (Button)findViewById(R.id.gangdongBtn);
        starOfstarBtn = (Button)findViewById(R.id.starofstarBtn);
        multiculturalBtn = (Button)findViewById(R.id.multiculturalBtn);

        gangdong_ImageBtn = (ImageButton)findViewById(R.id.gangdong_ImageBtn);
        starOfstar_ImageBtn = (ImageButton)findViewById(R.id.starofstar_ImageBtn);
        multicultural_ImageBtn = (ImageButton)findViewById(R.id.multicultural_ImageBtn);

        gangdongBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Festival.class);
                startActivity(intent);
            }
        });
        gangdong_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Festival.class);
                startActivity(intent);
            }
        });

        starOfstarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Festival_three.class);
                startActivity(intent);
            }
        });
        starOfstar_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Festival_three.class);
                startActivity(intent);
            }
        });

        multiculturalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Festival_two.class);
                startActivity(intent);
            }
        });
        multicultural_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Festival_two.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                Intent hintent =new Intent(Menu_Festivalinformation.this,Main2Activity.class);
                startActivity(hintent);
                break;
            case R.id.nav_culture:
                Intent cintent =new Intent(Menu_Festivalinformation.this,Menu_Cultureinformation.class);
                startActivity(cintent);
                break;
            case R.id.nav_art:
                Intent aintent =new Intent(Menu_Festivalinformation.this,Menu_Artinformation.class);
                startActivity(aintent);
                break;
            case R.id.nav_festival:
                Intent fintent =new Intent(Menu_Festivalinformation.this,Menu_Festivalinformation.class);
                startActivity(fintent);
                break;
            case R.id.nav_book:
                Intent bintent =new Intent(Menu_Festivalinformation.this,Menu_Booksinformation.class);
                startActivity(bintent);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
