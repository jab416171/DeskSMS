package com.koushikdutta.desktopsms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SmsReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, Intent intent) {
        try {
            Helper.startSyncService(context);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
