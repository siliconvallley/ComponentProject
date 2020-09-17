package com.dh.componentproject.base;

import android.app.Application;

import com.dh.common_library.RecordPathManager;
import com.dh.common_library.constant.RecordPathConstants;
import com.dh.componentproject.MainActivity;
import com.dh.order.OrderMainActivity;
import com.dh.personal.PersonalMainActivity;

/**
 * @author 86351
 * @date 2020/9/17
 * @description
 */
public class BaseAppApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // 如果Activity很多，我们手动这么添加太累
        RecordPathManager.joinGroup(RecordPathConstants.GROUP_APP, RecordPathConstants.MainActivity, MainActivity.class);
        RecordPathManager.joinGroup(RecordPathConstants.GROUP_ORDER, RecordPathConstants.OrderMainActivity, OrderMainActivity.class);
        RecordPathManager.joinGroup(RecordPathConstants.GROUP_PERSONAL, RecordPathConstants.PersonalMainActivity, PersonalMainActivity.class);
    }
}
