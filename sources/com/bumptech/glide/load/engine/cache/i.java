package com.bumptech.glide.load.engine.cache;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20637c;

    public i(g gVar) {
        Context context = gVar.f20629a;
        ActivityManager activityManager = gVar.f20630b;
        int i7 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f20637c = i7;
        int iRound = Math.round(activityManager.getMemoryClass() * 1048576 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = (DisplayMetrics) gVar.f20631c.f20634b;
        float f10 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f11 = gVar.f20632d;
        int iRound2 = Math.round(f10 * f11);
        int iRound3 = Math.round(f10 * 2.0f);
        int i10 = iRound - i7;
        if (iRound3 + iRound2 <= i10) {
            this.f20636b = iRound3;
            this.f20635a = iRound2;
        } else {
            float f12 = i10 / (f11 + 2.0f);
            this.f20636b = Math.round(2.0f * f12);
            this.f20635a = Math.round(f12 * f11);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.f20636b);
            Formatter.formatFileSize(context, this.f20635a);
            Formatter.formatFileSize(context, i7);
            Formatter.formatFileSize(context, iRound);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
