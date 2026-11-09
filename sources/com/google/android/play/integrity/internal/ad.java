package com.google.android.play.integrity.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
final class ad implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f22746a;

    public /* synthetic */ ad(ae aeVar, ac acVar) {
        this.f22746a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f22746a.f22749c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f22746a.c().post(new aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f22746a.f22749c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f22746a.c().post(new ab(this));
    }
}
