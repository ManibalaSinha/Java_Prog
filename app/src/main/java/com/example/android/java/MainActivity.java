package com.example.android.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import javax.sql.DataSource;

public class MainActivity extends AppCompatActivity {
    private static final int SIGNIN_REQUEST = 1001;
    public static final String TAG="MainActivity";
    public static final String MY_GLOBAL_PREFS="my_global_prefs";

    //List<DataItem> mDataItemList = SampleDataProvider.dataItemList;
    private static final String JSON_URL = "http://560057.youcanlearnit.net/services/json/itemsfeed.php";

    DataSource mDataSource;
    //List<Da>


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
