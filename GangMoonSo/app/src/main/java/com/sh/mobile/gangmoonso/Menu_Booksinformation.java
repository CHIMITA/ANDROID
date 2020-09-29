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

public class Menu_Booksinformation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    ImageButton li1_ImageBtn, li2_ImageBtn, li3_ImageBtn, li4_ImageBtn, li5_ImageBtn, li6_ImageBtn, li7_ImageBtn, li8_ImageBtn,
            li9_ImageBtn, li10_ImageBtn, li11_ImageBtn, li12_ImageBtn, li13_ImageBtn, li14_ImageBtn, li15_ImageBtn;
    Button li1_Btn, li2_Btn, li3_Btn, li4_Btn, li5_Btn, li6_Btn, li7_Btn, li8_Btn, li9_Btn, li10_Btn, li11_Btn, li12_Btn, li13_Btn, li14_Btn, li15_Btn;

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getAttributes().layoutInDisplayCutoutMode =
                WindowManager.LayoutParams.LAYOUT_IN_DISPLAY_CUTOUT_MODE_SHORT_EDGES;
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.booksinformation_menu);

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

        li1_ImageBtn = (ImageButton)findViewById(R.id.library1_ImageBtn);
        li2_ImageBtn = (ImageButton)findViewById(R.id.library2_ImageBtn);
        li3_ImageBtn = (ImageButton)findViewById(R.id.library3_ImageBtn);
        li4_ImageBtn = (ImageButton)findViewById(R.id.library4_ImageBtn);
        li5_ImageBtn = (ImageButton)findViewById(R.id.library5_ImageBtn);
        li6_ImageBtn = (ImageButton)findViewById(R.id.library6_ImageBtn);
        li7_ImageBtn = (ImageButton)findViewById(R.id.library7_ImageBtn);
        li8_ImageBtn = (ImageButton)findViewById(R.id.library8_ImageBtn);
        li9_ImageBtn = (ImageButton)findViewById(R.id.library9_ImageBtn);
        li10_ImageBtn = (ImageButton)findViewById(R.id.library10_ImageBtn);
        li11_ImageBtn = (ImageButton)findViewById(R.id.library11_ImageBtn);
        li12_ImageBtn = (ImageButton)findViewById(R.id.library12_ImageBtn);
        li13_ImageBtn = (ImageButton)findViewById(R.id.library13_ImageBtn);
        li14_ImageBtn = (ImageButton)findViewById(R.id.library14_ImageBtn);
        li15_ImageBtn = (ImageButton)findViewById(R.id.library15_ImageBtn);

        li1_Btn = (Button)findViewById(R.id.library1_Btn);
        li2_Btn = (Button)findViewById(R.id.library2_Btn);
        li3_Btn = (Button)findViewById(R.id.library3_Btn);
        li4_Btn = (Button)findViewById(R.id.library4_Btn);
        li5_Btn = (Button)findViewById(R.id.library5_Btn);
        li6_Btn = (Button)findViewById(R.id.library6_Btn);
        li7_Btn = (Button)findViewById(R.id.library7_Btn);
        li8_Btn = (Button)findViewById(R.id.library8_Btn);
        li9_Btn = (Button)findViewById(R.id.library9_Btn);
        li10_Btn = (Button)findViewById(R.id.library10_Btn);
        li11_Btn = (Button)findViewById(R.id.library11_Btn);
        li12_Btn = (Button)findViewById(R.id.library12_Btn);
        li13_Btn = (Button)findViewById(R.id.library13_Btn);
        li14_Btn = (Button)findViewById(R.id.library14_Btn);
        li15_Btn = (Button)findViewById(R.id.library15_Btn);

        li1_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library1.class);
                startActivity(intent);
            }
        });
        li1_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library1.class);
                startActivity(intent);
            }
        });

        li2_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library2.class);
                startActivity(intent);
            }
        });
        li2_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library2.class);
                startActivity(intent);

            }
        });
        li3_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library3.class);
                startActivity(intent);
            }
        });
        li3_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library3.class);
                startActivity(intent);
            }
        });

        li4_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library4.class);
                startActivity(intent);
            }
        });
        li4_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library4.class);
                startActivity(intent);
            }
        });

        li5_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library5.class);
                startActivity(intent);
            }
        });
        li5_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library5.class);
                startActivity(intent);
            }
        });

        li6_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library6.class);
                startActivity(intent);
            }
        });
        li6_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library6.class);
                startActivity(intent);
            }
        });

        li7_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library7.class);
                startActivity(intent);
            }
        });
        li7_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Library7.class);
                startActivity(intent);
            }
        });

        li8_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library8.class);
                startActivity(intent);
            }
        });

        li8_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library8.class);
                startActivity(intent);
            }
        });

        li9_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library9.class);
                startActivity(intent);
            }
        });
        li9_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library9.class);
                startActivity(intent);
            }
        });
        li10_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library10.class);
                startActivity(intent);
            }
        });
        li10_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library10.class);
                startActivity(intent);
            }
        });

        li11_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library11.class);
                startActivity(intent);
            }
        });

        li11_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library11.class);
                startActivity(intent);
            }
        });

        li12_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library12.class);
                startActivity(intent);
            }
        });
        li12_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library12.class);
                startActivity(intent);
            }
        });

        li13_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library13.class);
                startActivity(intent);
            }
        });
        li13_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library13.class);
                startActivity(intent);
            }
        });

        li14_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library14.class);
                startActivity(intent);
            }
        });
        li14_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library14.class);
                startActivity(intent);
            }
        });

        li15_Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library15.class);
                startActivity(intent);
            }
        });

        li15_ImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Library15.class);
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
                Intent hintent =new Intent( Menu_Booksinformation.this,Main2Activity.class);
                startActivity(hintent);
                break;
            case R.id.nav_culture:
                Intent cintent =new Intent( Menu_Booksinformation.this,Menu_Cultureinformation.class);
                startActivity(cintent);
                break;
            case R.id.nav_art:
                Intent aintent =new Intent( Menu_Booksinformation.this,Menu_Artinformation.class);
                startActivity(aintent);
                break;
            case R.id.nav_festival:
                Intent fintent =new Intent( Menu_Booksinformation.this,Menu_Festivalinformation.class);
                startActivity(fintent);
                break;
            case R.id.nav_book:
                Intent bintent =new Intent( Menu_Booksinformation.this,Menu_Booksinformation.class);
                startActivity(bintent);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
