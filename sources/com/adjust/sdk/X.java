package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class X implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f19353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19354c;

    public /* synthetic */ X(Object obj, Context context, int i7) {
        this.f19352a = i7;
        this.f19353b = context;
        this.f19354c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f19352a) {
            case 0:
                return Reflection.getGoogleAdId(this.f19353b, this.f19354c);
            default:
                return Reflection.isGoogleAdIdTrackingEnabled(this.f19353b, this.f19354c);
        }
    }
}
