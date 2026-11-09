package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f20628e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f20630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f20631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f20632d;

    static {
        f20628e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public g(Context context) {
        this.f20632d = f20628e;
        this.f20629a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f20630b = activityManager;
        this.f20631c = new h(context.getResources().getDisplayMetrics(), 0);
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f20632d = 0.0f;
    }
}
