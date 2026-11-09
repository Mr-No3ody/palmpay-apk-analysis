package com.snail.antifake.jni;

import L7.b;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public class EmulatorCheckService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f25247a = new Handler();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new b(this);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        Process.killProcess(Process.myPid());
    }
}
