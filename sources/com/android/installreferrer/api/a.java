package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.android.installreferrer.commons.InstallReferrerCommons;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InstallReferrerStateListener f20369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f20370b;

    public a(b bVar, InstallReferrerStateListener installReferrerStateListener) {
        this.f20370b = bVar;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.f20369a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        IGetInstallReferrerService iGetInstallReferrerServiceB = IGetInstallReferrerService.Stub.b(iBinder);
        b bVar = this.f20370b;
        bVar.f20373c = iGetInstallReferrerServiceB;
        bVar.f20371a = 2;
        this.f20369a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        b bVar = this.f20370b;
        bVar.f20373c = null;
        bVar.f20371a = 0;
        this.f20369a.onInstallReferrerServiceDisconnected();
    }
}
