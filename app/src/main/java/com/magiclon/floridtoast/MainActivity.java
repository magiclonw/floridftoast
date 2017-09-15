package com.magiclon.floridtoast;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void success(View v) {
        showSToast("成功");
    }

    public void wron(View v) {
        showWToast("警告");
    }

    public void info(View v) {
        showIToast("info");
    }

    public void error(View v) {
        showEToast("错误");
    }
}
