package com.dh.order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dh.common_library.RecordPathManager;
import com.dh.common_library.constant.RecordPathConstants;

public class OrderMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtApp;
    private Button mBtPersonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_activity_main);

        mBtApp = findViewById(R.id.btApp);
        mBtPersonal = findViewById(R.id.btPersonal);

        mBtApp.setOnClickListener(this);
        mBtPersonal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Class<?> targetClass;
        if (id == R.id.btPersonal) {
            /*try {
                Class<?> aClass = Class.forName("com.dh.personal.PersonalMainActivity");
                jumpActivity(aClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }*/
            targetClass = RecordPathManager.getTargetClass(
                    RecordPathConstants.GROUP_PERSONAL,
                    RecordPathConstants.PersonalMainActivity);
            jumpActivity(targetClass);
        } else if (id == R.id.btApp) {
            /*try {
                Class<?> aClass = Class.forName("com.dh.componentproject.MainActivity");
                jumpActivity(aClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }*/
            targetClass = RecordPathManager.getTargetClass(
                    RecordPathConstants.GROUP_APP,
                    RecordPathConstants.MainActivity);
            jumpActivity(targetClass);
        }
    }

    private void jumpActivity(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        intent.putExtra("key", "value");
        startActivity(intent);
    }
}
