package com.dh.personal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dh.common_library.RecordPathManager;
import com.dh.common_library.constant.RecordPathConstants;

public class PersonalMainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtApp;
    private Button mBtOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_activity_main);

        mBtApp = findViewById(R.id.btApp);
        mBtOrder = findViewById(R.id.btOrder);

        mBtApp.setOnClickListener(this);
        mBtOrder.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Class<?> targetClass;
        if (id == R.id.btOrder) {
            /*try {
                Class<?> aClass = Class.forName("com.dh.order.OrderMainActivity");
                jumpActivity(aClass);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }*/
            targetClass = RecordPathManager.getTargetClass(
                    RecordPathConstants.GROUP_ORDER,
                    RecordPathConstants.OrderMainActivity);
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
