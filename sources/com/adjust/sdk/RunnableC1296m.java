package com.adjust.sdk;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* JADX INFO: renamed from: com.adjust.sdk.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1296m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f19390d;

    public /* synthetic */ RunnableC1296m(ActivityHandler activityHandler, AdjustDeeplink adjustDeeplink, long j6, int i7) {
        this.f19387a = i7;
        this.f19388b = activityHandler;
        this.f19389c = adjustDeeplink;
        this.f19390d = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19387a) {
            case 0:
                ((ActivityHandler) this.f19388b).lambda$processDeeplink$13((AdjustDeeplink) this.f19389c, this.f19390d);
                break;
            case 1:
                ((ActivityHandler) this.f19388b).lambda$processDeeplink$12((AdjustDeeplink) this.f19389c, this.f19390d);
                break;
            case 2:
                ((ActivityHandler) this.f19388b).lambda$processAndResolveDeeplink$14((AdjustDeeplink) this.f19389c, this.f19390d);
                break;
            case 3:
                ((ActivityHandler) this.f19388b).lambda$processAndResolveDeeplink$15((AdjustDeeplink) this.f19389c, this.f19390d);
                break;
            default:
                ((CrashlyticsCore) this.f19388b).lambda$log$2(this.f19390d, (String) this.f19389c);
                break;
        }
    }

    public /* synthetic */ RunnableC1296m(CrashlyticsCore crashlyticsCore, long j6, String str) {
        this.f19387a = 4;
        this.f19388b = crashlyticsCore;
        this.f19390d = j6;
        this.f19389c = str;
    }
}
