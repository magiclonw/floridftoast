package com.magiclon.floridtoast;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.magiclon.individuationtoast.ToastUtil;

/**
 * Created by Admin on 2017/9/15 015.
 */

public abstract class BaseActivity extends AppCompatActivity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }
    public void showSToast(String msg) {
        ToastUtil.showsuccess(this, msg, Toast.LENGTH_SHORT, true).show();
    }

    public void showIToast(String msg) {
        ToastUtil.showinfo(this, msg, Toast.LENGTH_SHORT, true).show();
    }

    public void showWToast(String msg) {
        ToastUtil.showwarning(this, msg, Toast.LENGTH_SHORT, true).show();
    }

    public void showEToast(String msg) {
        ToastUtil.showerror(this, msg, Toast.LENGTH_SHORT, true).show();
    }
}
