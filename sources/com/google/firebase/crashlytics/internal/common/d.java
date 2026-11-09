package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f22950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SettingsProvider f22951c;

    public /* synthetic */ d(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider, int i7) {
        this.f22949a = i7;
        this.f22950b = crashlyticsCore;
        this.f22951c = settingsProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22949a) {
            case 0:
                this.f22950b.lambda$doBackgroundInitializationAsync$0(this.f22951c);
                break;
            default:
                this.f22950b.lambda$finishInitSynchronously$9(this.f22951c);
                break;
        }
    }
}
