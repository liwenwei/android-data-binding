package com.liwenwei.mydatabinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Simple_Click(View v) {
        Intent intent = new Intent(this, SimpleBindActivity.class);
        startActivity(intent);
    }

    public void List_Click(View v) {
    }
}
