package com.example.hulei.wechatlogin.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.example.hulei.wechatlogin.R;
import com.example.hulei.wechatlogin.fragment.loginFragment;

/**
 * Created by asus on 2016/1/16.
 */
public class LoginActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.sample_content_fragment);
        if (fragment == null) {
            fragment = new loginFragment();
            fm.beginTransaction()
                    .add(R.id.sample_content_fragment, fragment)
                    .commit();
        }
    }
}
