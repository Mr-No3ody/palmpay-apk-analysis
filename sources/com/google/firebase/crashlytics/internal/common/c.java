package com.google.firebase.crashlytics.internal.common;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22948c;

    public /* synthetic */ c(int i7, Object obj, Object obj2) {
        this.f22946a = i7;
        this.f22947b = obj;
        this.f22948c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f22946a) {
            case 0:
                ((CrashlyticsController) this.f22947b).lambda$openSession$1((String) this.f22948c);
                break;
            case 1:
                ((CrashlyticsCore) this.f22947b).lambda$setCustomKeys$6((Map) this.f22948c);
                break;
            case 2:
                ((CrashlyticsCore) this.f22947b).lambda$logFatalException$8((Throwable) this.f22948c);
                break;
            default:
                ((CrashlyticsCore) this.f22947b).lambda$setUserId$4((String) this.f22948c);
                break;
        }
    }
}
