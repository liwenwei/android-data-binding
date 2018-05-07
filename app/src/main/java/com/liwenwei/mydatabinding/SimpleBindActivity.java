package com.liwenwei.mydatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.liwenwei.mydatabinding.databinding.ActivitySimpleBindBinding;

public class SimpleBindActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivitySimpleBindBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_simple_bind);
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
