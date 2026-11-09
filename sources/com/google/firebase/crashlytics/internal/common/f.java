package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CrashlyticsCore f22954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f22956d;

    public /* synthetic */ f(CrashlyticsCore crashlyticsCore, String str, String str2, int i7) {
        this.f22953a = i7;
        this.f22954b = crashlyticsCore;
        this.f22955c = str;
        this.f22956d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22953a) {
            case 0:
                this.f22954b.lambda$setCustomKey$5(this.f22955c, this.f22956d);
                break;
            default:
                this.f22954b.lambda$setInternalKey$7(this.f22955c, this.f22956d);
                break;
        }
    }
}
