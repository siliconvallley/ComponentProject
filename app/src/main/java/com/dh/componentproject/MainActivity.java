package com.dh.componentproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.dh.common_library.RecordPathManager;
import com.dh.common_library.constant.RecordPathConstants;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btOrder;
    private Button btPersonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btOrder = findViewById(R.id.btOrder);
        btPersonal = findViewById(R.id.btPersonal);

        btOrder.setOnClickListener(this);
        btPersonal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Class<?> targetClass;
        switch (v.getId()) {
            case R.id.btOrder:
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
                break;
            case R.id.btPersonal:
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
                break;
        }
    }

    private void jumpActivity(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        intent.putExtra("key", "value");
        startActivity(intent);
    }
}