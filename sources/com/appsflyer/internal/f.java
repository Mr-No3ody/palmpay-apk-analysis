package com.appsflyer.internal;

import android.content.Context;
import android.hardware.SensorEvent;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20413c;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f20411a = i7;
        this.f20412b = obj;
        this.f20413c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20411a) {
            case 0:
                AFb1kSDK.AFAdRevenueData((AFb1kSDK) this.f20412b, (AFh1pSDK) this.f20413c);
                break;
            case 1:
                ((AFa1uSDK) this.f20412b).getCurrencyIso4217Code((AFh1qSDK) this.f20413c);
                break;
            case 2:
                ((AFi1aSDK) this.f20412b).getRevenue((Context) this.f20413c);
                break;
            case 3:
                ((AFj1oSDK) this.f20412b).G_((SensorEvent) this.f20413c);
                break;
            case 4:
                AFj1sSDK.getMediationNetwork((AFj1sSDK) this.f20412b, (Context) this.f20413c);
                break;
            case 5:
                ((AFj1wSDK) this.f20412b).getCurrencyIso4217Code((Context) this.f20413c);
                break;
            default:
                AFj1ySDK.getCurrencyIso4217Code((AFj1ySDK) this.f20412b, (Context) this.f20413c);
                break;
        }
    }
}
