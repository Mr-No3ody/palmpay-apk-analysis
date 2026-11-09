package com.adjust.sdk;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class W implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f19351a;

    public W(Context context) {
        this.f19351a = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return Reflection.getAdvertisingInfoObject(this.f19351a);
        } catch (Exception unused) {
            return null;
        }
    }
}
