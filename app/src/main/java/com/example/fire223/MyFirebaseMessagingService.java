package com.example.fire223;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = "FirebaseServes";


    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Log.d(TAG, "from" + remoteMessage.getFrom());

        if(remoteMessage.getData().size()>0)
            Log.d(TAG, "message data "+ remoteMessage.getData());

          //TODO chacke message state and write 2 method for it

        if(remoteMessage.getNotification() != null){
            Log.d(TAG, "message noty " + remoteMessage.getNotification().getBody());
        }

    }//


    @Override
    public void onNewToken(String s) {
        Log.d(TAG, "token ref" + s);
    }
}
