package com.example.dbenglishtext;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //drawer
    private DrawerLayout drawerLayout;
    private View drawerView;
    private Button openDrawer;
    private Button closeDrawer;
    private DrawerLayout.DrawerListener myDrawerListener;
    private CustomAdapter adapter;
    private Button saveEngData; //임시
    private Button addMenu;
    private ListView listView;
    ArrayList<MyDataList> engData;

    //viewPager
    private ViewPager pager;
    private PagerItem mPagerAdapter;
    ArrayList<String> word;
    ArrayList<String> mean;

    //popUp
    private PopupWindow mPopupWindow ;
    private EditText menuEdit;
    private EditText wordEdit;
    private EditText meanEdit;
    private Button menuAdd;
    private Button wordAdd;
    private Button addClose;
    private Button popupPasate;
    boolean manuNameFlag;
    View popupView;

    //붙여넣기 popup
    private PopupWindow pastePopup ;
    private View pasteView;
    private Button pasteAdd;
    private Button pasteCancel;
    private EditText pasteEdit;
    ClipboardManager clipBoard;
    ClipData.Item item ;

    //종료 popup
    private PopupWindow pop;
    //data
    String data ="";

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        engData = new ArrayList<>();

        engData = MyValue.getEng(getApplicationContext());


        drawerInit(); //drawer 할당
        viewPagerInit(); // ViewPager 할당
    }

    @Override
    public void onBackPressed() {
        if(pop!=null && pop.isShowing())
        {
            pop.dismiss();
        }
        View popView = getLayoutInflater().inflate(R.layout.popup_finish, null);
        pop = new PopupWindow(popView, LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        //popupView 에서 (LinearLayout 을 사용) 레이아웃이 둘러싸고 있는 컨텐츠의 크기 만큼 팝업 크기를 지정
        pop.showAtLocation(popView, Gravity.CENTER, 0, 0);

        Button cancel = (Button)popView.findViewById(R.id.popupCancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop.dismiss();
            }
        });

        final Button fini = (Button)popView.findViewById(R.id.popupFinish);
        fini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void getWordText(String temp)
    {
        String t = "";
        for(int i=0; i<temp.length(); i++)
        {
            if(!String.valueOf('|').equals(String.valueOf(temp.charAt(i)))
                    && !String.valueOf('/').equals(String.valueOf(temp.charAt(i))))
                t +=temp.charAt(i);

            else if(String.valueOf('|').equals(String.valueOf(temp.charAt(i))))
            {
                word.add(t);
                t="";
            }
            else if(String.valueOf('/').equals(String.valueOf(temp.charAt(i))))
            {
                mean.add(t);
                t="";
            }
        }
    }


    void viewPagerInit() {
    }

    void drawerInit() {
    }


}