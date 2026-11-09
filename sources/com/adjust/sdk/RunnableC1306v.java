package com.adjust.sdk;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.adjust.sdk.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1306v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdjustTimeoutCallback f19537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f19538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f19539d;

    public /* synthetic */ RunnableC1306v(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context, int i7) {
        this.f19536a = i7;
        this.f19537b = adjustTimeoutCallback;
        this.f19538c = arrayList;
        this.f19539d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19536a) {
            case 0:
                if (this.f19537b.getOnAdidReadListener() != null) {
                    synchronized (this.f19538c) {
                        this.f19538c.remove(this.f19537b);
                        break;
                    }
                    new Handler(this.f19539d.getMainLooper()).post(new RunnableC1305u(this, 0));
                    return;
                }
                return;
            case 1:
                if (this.f19537b.getOnAttributionReadListener() != null) {
                    synchronized (this.f19538c) {
                        this.f19538c.remove(this.f19537b);
                        break;
                    }
                    new Handler(this.f19539d.getMainLooper()).post(new RunnableC1305u(this, 1));
                    return;
                }
                return;
            default:
                if (this.f19537b.getOnThirdPartySharingSettingsReadListener() != null) {
                    synchronized (this.f19538c) {
                        this.f19538c.remove(this.f19537b);
                        break;
                    }
                    new Handler(this.f19539d.getMainLooper()).post(new RunnableC1305u(this, 2));
                    return;
                }
                return;
        }
    }
}
