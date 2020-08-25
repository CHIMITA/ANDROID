package com.example.dbenglishtext;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.ArrayList;

public class MyValue {
    public static String saveTempContent;
    public static String saveTempMenu;
    public static String value;

    static public ArrayList<MyDataList> getEng(Context ctx) {

        SharedPreferences prefs = ctx.getSharedPreferences("eng", Context.MODE_PRIVATE); //적은 데이터들을 안드로이드 내에 저장하는 함수
        String result = prefs.getString("data", null);
        ArrayList<MyDataList> temp = stringToMyDataList(result);
        Log.d("qwe", result + "!!!!");
        return temp;
    }

    private static ArrayList<MyDataList> stringToMyDataList(String temp) {

        String value = "";
        String v1 = "";
        ArrayList<MyDataList> result = new ArrayList<>();
        MyDataList myDataList;

        for (int i = 0; i < temp.length(); i++) {
            Log.d("qwe", value);
            if (!String.valueOf('★').equals(String.valueOf(temp.charAt(i)))
                    && !String.valueOf('☆').equals(String.valueOf(temp.charAt(i)))) {
                value += temp.charAt(i);
            } else if (String.valueOf('★').equals(String.valueOf(temp.charAt(i)))) {
                v1 = value;
                value = "";
            } else if (String.valueOf('☆').equals(String.valueOf(temp.charAt(i)))) {
                myDataList = new MyDataList(v1, value);
                result.add(myDataList);
                value = "";
            }
        }
        return result;
    }

    public static void saveEng(Context applicationContext, ArrayList<MyDataList> engData) {
    }
}



