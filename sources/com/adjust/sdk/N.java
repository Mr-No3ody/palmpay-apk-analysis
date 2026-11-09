package com.adjust.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class N implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19332b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f19333c = new LinkedBlockingQueue(1);

    public N(long j6) {
        this.f19331a = j6;
    }

    public final IBinder a() {
        if (this.f19332b) {
            throw new IllegalStateException();
        }
        this.f19332b = true;
        return (IBinder) this.f19333c.poll(this.f19331a, TimeUnit.MILLISECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f19333c.put(iBinder);
        } catch (InterruptedException unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
