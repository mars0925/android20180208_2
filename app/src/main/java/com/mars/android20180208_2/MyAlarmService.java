package com.mars.android20180208_2;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyAlarmService extends Service {
    public MyAlarmService() {
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("SERIVCE","service start!");

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
