package com.luck.picture.lib.service;

import A1.b;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.core.app.B;
import com.luck.picture.lib.R;
import com.luck.picture.lib.config.SelectMimeType;
import com.luck.picture.lib.config.SelectorProviders;
import com.luck.picture.lib.utils.SdkVersionUtils;

/* JADX INFO: loaded from: classes3.dex */
public class ForegroundService extends Service {
    private static final String CHANNEL_NAME = "com.luck.picture.lib";
    private static final int NOTIFICATION_ID = 1;
    private static final String CHANNEL_ID = "com.luck.picture.lib.".concat(ForegroundService.class.getName());
    private static boolean isForegroundServiceIng = false;

    private Notification createForegroundNotification() {
        int i7 = SdkVersionUtils.isMaxN() ? 4 : 0;
        if (SdkVersionUtils.isO()) {
            b.j();
            NotificationChannel notificationChannelC = b.c(i7, CHANNEL_ID);
            notificationChannelC.setLightColor(-16776961);
            notificationChannelC.canBypassDnd();
            notificationChannelC.setBypassDnd(true);
            notificationChannelC.setLockscreenVisibility(0);
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(notificationChannelC);
        }
        String string = getString(SelectorProviders.getInstance().getSelectorConfig().chooseMode == SelectMimeType.ofAudio() ? R.string.ps_use_sound : R.string.ps_use_camera);
        B b7 = new B(this, CHANNEL_ID);
        b7.f15917v.icon = R.drawable.ps_ic_trans_1px;
        b7.f15901e = B.b(getAppName());
        b7.f15902f = B.b(string);
        b7.d(2, true);
        return b7.a();
    }

    private String getAppName() {
        try {
            return getPackageManager().getPackageInfo(getPackageName(), 0).applicationInfo.loadLabel(getPackageManager()).toString();
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static void startForegroundService(Context context, boolean z3) {
        try {
            if (isForegroundServiceIng || !z3) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) ForegroundService.class);
            if (SdkVersionUtils.isO()) {
                context.startForegroundService(intent);
            } else {
                context.startService(intent);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void stopService(Context context) {
        try {
            if (isForegroundServiceIng) {
                context.stopService(new Intent(context, (Class<?>) ForegroundService.class));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        startForeground(1, createForegroundNotification());
    }

    @Override // android.app.Service
    public void onDestroy() {
        isForegroundServiceIng = false;
        stopForeground(true);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i10) {
        isForegroundServiceIng = true;
        return super.onStartCommand(intent, i7, i10);
    }
}
