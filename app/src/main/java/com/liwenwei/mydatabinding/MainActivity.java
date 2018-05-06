package com.liwenwei.mydatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.liwenwei.mydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new User();
        user.setFirstName("Allen");
        user.setLastName("Lee");
        binding.setUser(user);
    }

    public void updateValue(View v) {
        user.setFirstName("Bill");
        user.setLastName("Gates");
    }
}
